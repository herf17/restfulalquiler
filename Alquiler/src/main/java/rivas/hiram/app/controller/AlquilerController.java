package rivas.hiram.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import rivas.hiram.app.model.Vehiculo;
import rivas.hiram.app.repository.VehiculoRepository;
import rivas.hiram.app.services.VehiculosDispoServices;

@RestController
public class AlquilerController {
	
	@Autowired
	private VehiculoRepository vehiculo;
	
	@Autowired
	private VehiculosDispoServices vehiculoDispoServices;
	
	@GetMapping("/todo")
	public List<Vehiculo> todosVehiculo(){
		return vehiculoDispoServices.getdisponible();	
	}

}
