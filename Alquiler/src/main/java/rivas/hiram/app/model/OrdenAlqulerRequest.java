package rivas.hiram.app.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class OrdenAlqulerRequest {
	
	
	private String username;
	
	private String password;

	
	private List<AutosParaAlquilar> autos;
	
	
	public OrdenAlqulerRequest() {}
	
	
	
	


	public String getUsername() {
		return username;
	}






	public void setUsername(String username) {
		this.username = username;
	}






	public String getPassword() {
		return password;
	}






	public void setPassword(String password) {
		this.password = password;
	}






	public List<AutosParaAlquilar> getAutos() {
		return autos;
	}



	public void setAutos(List<AutosParaAlquilar> autos) {
		this.autos = autos;
	}
	

}
