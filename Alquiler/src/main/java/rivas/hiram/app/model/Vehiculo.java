package rivas.hiram.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="vehiculos")
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
	@Column
	private boolean activo;
	@Column
	private String ano;
	@Column
	private String precio;
	
	public Vehiculo() {}

	

	public Vehiculo(String matricula, String estado, String marca, String modelo, String color, String km,
			boolean activo, String ano, String precio) {
		super();
		this.matricula = matricula;
		this.estado = estado;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.km = km;
		this.activo = activo;
		this.ano = ano;
		this.precio = precio;
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

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}



	public String getAno() {
		return ano;
	}



	public void setAno(String ano) {
		this.ano = ano;
	}



	public String getPrecio() {
		return precio;
	}



	public void setPrecio(String precio) {
		this.precio = precio;
	}



	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", estado=" + estado + ", marca=" + marca + ", modelo=" + modelo
				+ ", color=" + color + ", km=" + km + ", activo=" + activo + ", ano=" + ano + ", precio=" + precio
				+ "]";
	}
	
	
	
	

}
