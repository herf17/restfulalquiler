package rivas.hiram.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import rivas.hiram.app.model.OrdenAlqulerRequest;
import rivas.hiram.app.model.RegistroRequest;
import rivas.hiram.app.model.Usuarios;
import rivas.hiram.app.model.Vehiculo;
import rivas.hiram.app.repository.UsuariosRepository;
import rivas.hiram.app.repository.VehiculoRepository;
import rivas.hiram.app.services.CrearOrdenServices;
import rivas.hiram.app.services.UsuariosDetailsImpl;
import rivas.hiram.app.services.VehiculosDispoServices;

@RestController
public class AlquilerController {
	@Autowired
	AuthenticationManager autenticador;
	@Autowired
	private VehiculoRepository vehiculo;
	
	@Autowired
	private CrearOrdenServices crearOrdenServices;
	
	@Autowired
	private UsuariosRepository usuarioRepository;
	
	@Autowired
	private VehiculosDispoServices vehiculoDispoServices;
	
	@Autowired
	PasswordEncoder contr;
	
	@GetMapping("/todo")
	public List<Vehiculo> todosVehiculo(){
		return vehiculoDispoServices.getdisponible();	
	}
	
	@PostMapping("/cuenta")
	public OrdenAlqulerRequest CrearOrdenAlquiler(@RequestBody OrdenAlqulerRequest oar) {
		
		Authentication autentica = autenticador.authenticate(new UsernamePasswordAuthenticationToken(oar.getUsername(),oar.getPassword()));
		SecurityContextHolder.getContext().setAuthentication(autentica);
		UsuariosDetailsImpl user = (UsuariosDetailsImpl) autentica.getPrincipal();
		int i = crearOrdenServices.insertarOrden(oar.getFecha_ini(), oar.getFecha_fin(), oar.getAutos(), user.getUsername());
	
		return oar;
		
		
	}
	
	/*@PostMapping("/cuenta")
	public ResponseEntity<?> CrearOrdenAlquiler(@RequestBody RegistroRequest reg) {
		Usuarios user = new Usuarios(reg.getUsername(),contr.encode(reg.getPassword()));
		usuarioRepository.save(user);
		return ResponseEntity.ok("cuenta creada");
		
	}*/

}
