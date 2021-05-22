package rivas.hiram.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import rivas.hiram.app.model.Alquiler;
import rivas.hiram.app.model.AutosDisponibles;
import rivas.hiram.app.model.OrdenAlqulerRequest;
import rivas.hiram.app.model.RegistroRequest;
import rivas.hiram.app.model.Usuarios;
import rivas.hiram.app.repository.UsuariosRepository;
import rivas.hiram.app.services.CrearOrdenServices;
import rivas.hiram.app.services.UsuariosDetailsImpl;
import rivas.hiram.app.services.VehiculosDispoServices;

@RestController
public class AlquilerController {
	@Autowired
	AuthenticationManager autenticador;
	
	@Autowired
	private CrearOrdenServices crearOrdenServices;
	
	@Autowired
	private UsuariosRepository usuarioRepository;
	
	@Autowired
	private VehiculosDispoServices vehiculoDispoServices;
	
	@Autowired
	PasswordEncoder contr;
	
	@CrossOrigin
	@GetMapping("/todo")
	public List<AutosDisponibles> todosVehiculo(){
		return vehiculoDispoServices.getdisponible();	
	}
	
	@PostMapping("/crearorden")
	public Alquiler CrearOrdenAlquiler(@Valid @RequestBody OrdenAlqulerRequest oar) {
		
		Authentication autentica = autenticador.authenticate(new UsernamePasswordAuthenticationToken(oar.getUsername(),oar.getPassword()));
		SecurityContextHolder.getContext().setAuthentication(autentica);
		UsuariosDetailsImpl user = (UsuariosDetailsImpl) autentica.getPrincipal();
		return crearOrdenServices.insertarOrden(oar.getFecha_ini(), oar.getFecha_fin(), oar.getAutos(), user.getUsername());
	}
	
	@PostMapping("/registrar")
	public ResponseEntity<?> Registro(@Valid @RequestBody RegistroRequest reg) {
		if (usuarioRepository.existsByUsername(reg.getUsername())) {
			return ResponseEntity.badRequest()
		            .body("Username no disponible");
		}
		
		
		Usuarios user = new Usuarios(reg.getUsername(),contr.encode(reg.getPassword()));
		usuarioRepository.save(user);
		return ResponseEntity.ok("cuenta creada");
		
	}

}
