package rivas.hiram.app.services;

import java.util.Date;

import rivas.hiram.app.model.Alquiler;


public interface CrearOrdenServices {
	
	public Alquiler insertarOrden(Date fechini,Date fechfin,String idvehiculo,String user);

}
