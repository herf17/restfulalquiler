package rivas.hiram.app.services;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rivas.hiram.app.dao.CrearOrdenDAO;
import rivas.hiram.app.model.Alquiler;
import rivas.hiram.app.model.OrdenAlqulerRequest;
import rivas.hiram.app.model.Usuarios;
import rivas.hiram.app.model.Vehiculo;
import rivas.hiram.app.repository.AlquilerRepository;
import rivas.hiram.app.repository.UsuariosRepository;
import rivas.hiram.app.repository.VehiculoRepository;



@Service
public class CrearOrdenServicesImpl implements CrearOrdenServices {
	
	@Autowired
	private VehiculoRepository vehiculoRepository;
	
	@Autowired
	private CrearOrdenDAO nuevaOrden;
	
	@Autowired
	private UsuariosRepository userrepo;
	
	@Autowired
	private AlquilerRepository alquilerRepository;
	

	@Override
	public int insertarOrden(java.util.Date fechini, java.util.Date fechfin, String idvehiculo, String user) {
		int idAlquiler =0;
		Usuarios userr = userrepo.findByUsername(user);
		long milis = System.currentTimeMillis();
		Date date = new Date(milis);
		Optional <Vehiculo> vehiculo = vehiculoRepository.findById(idvehiculo);
		Alquiler alquiler = new Alquiler(date,userr,fechini,fechfin);
		alquiler.setVehiculos(vehiculo.get());
		alquilerRepository.save(alquiler);
		//nuevaOrden.crearOrdenNueva(alquiler);
		return 0;
	}
	
	
	

}
