package rivas.hiram.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="COCHES")
public class Vehiculo {
	@Column(name = "matricula")
	@Id
	private String matricula;
	@Column
	private String estado;
	@Column
	private String marca;
	@Column
	private String modelo;
	@Column
	private String color;
	@Column
	private String km;
	
	public Vehiculo() {}

	public Vehiculo(String matricula, String estado, String marca, String modelo, String color, String km) {
		this.matricula = matricula;
		this.estado = estado;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.km = km;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getKm() {
		return km;
	}

	public void setKm(String km) {
		this.km = km;
	}
	
	
	
	

}
