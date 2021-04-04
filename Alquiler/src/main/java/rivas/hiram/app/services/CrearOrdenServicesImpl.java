package rivas.hiram.app.services;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rivas.hiram.app.dao.CrearOrdenDAO;
import rivas.hiram.app.model.Alquiler;
import rivas.hiram.app.model.OrdenAlqulerRequest;
import rivas.hiram.app.model.Usuarios;




public class CrearOrdenServicesImpl implements CrearOrdenServices {
	
	@Autowired
	private CrearOrdenDAO alquilerNuevo;

	@Override
	public int insertarOrden(java.util.Date fechini, java.util.Date fechfin, String[] idvehiculo, Usuarios user) {
		int idAlquiler =0;
		long milis = System.currentTimeMillis();
		Date date = new Date(milis);
		alquilerNuevo.crearOrdenNueva(new Alquiler(date,user,fechini,fechfin));
		return 0;
	}
	
	
	

}
