package rivas.hiram.app.services;

import java.util.Date;

import rivas.hiram.app.model.Usuarios;

public interface CrearOrdenServices {
	
	public int insertarOrden(Date fechini,Date fechfin,String[] idvehiculo,Usuarios user);

}
