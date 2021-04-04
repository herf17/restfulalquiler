package rivas.hiram.app.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class OrdenAlqulerRequest {
	
	
	private String username;
	
	private String password;

	@JsonFormat(pattern ="yyyy-MM-dd")
	private Date fecha_ini;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date fecha_fin;
	private String [] autos;
	
	
	public OrdenAlqulerRequest() {}
	
	
	
	


	public String getUsername() {
		return username;
	}






	public void setUsername(String username) {
		this.username = username;
	}
	
	




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






	public String getPassword() {
		return password;
	}






	public void setPassword(String password) {
		this.password = password;
	}






	public String [] getAutos() {
		return autos;
	}



	public void setAutos(String [] autos) {
		this.autos = autos;
	}
	

}
