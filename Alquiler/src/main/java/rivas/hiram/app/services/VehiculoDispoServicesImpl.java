package rivas.hiram.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import rivas.hiram.app.dao.VehiculosDispoDAO;
import rivas.hiram.app.model.Vehiculo;

@Service
public class VehiculoDispoServicesImpl implements VehiculosDispoServices {
	@Autowired
	private VehiculosDispoDAO vehiculoDAO;
	
	
	@Override
	@Transactional
	public List<Vehiculo> getdisponible() {
		return vehiculoDAO.getDisponibles();
	}
	
	

}
