package rivas.hiram.app.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AutosParaAlquilar {
	
	@JsonFormat(pattern ="yyyy-MM-dd")
	private Date fecha_ini;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date fecha_fin;
	
	private String idVehiculo;

	public Date getFecha_ini() {
		return fecha_ini;
	}

	public void setFecha_ini(Date fecha_ini) {
		this.fecha_ini = fecha_ini;
	}

	public Date getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public String getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(String idVehiculo) {
		this.idVehiculo = idVehiculo;
	}
	
	

}
