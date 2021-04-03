package rivas.hiram.app.model;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.Entity;
import javax.persistence.EntityResult;
import javax.persistence.FieldResult;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

@NamedStoredProcedureQuery(
		name = "AutosDisponibles",
		procedureName = "autosDisponi",
		resultSetMappings = "AutosDispon"
		)
@SqlResultSetMapping(
		name ="AutosDispon",
		columns = {
				@ColumnResult(name="matricula"),
				@ColumnResult(name="marca"),
				@ColumnResult(name="modelo"),
				@ColumnResult(name="color"),
				@ColumnResult(name="ano"),
				@ColumnResult(name="km"),
				@ColumnResult(name="precio")
		}
		)
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
	private boolean activo;
	@Column
	private String modelo;
	@Column
	private String color;
	@Column
	private String km;
	@Column
	private String ano;
	@Column
	private String precio;
	
	public Vehiculo() {}

	public Vehiculo(String matricula, String estado, String marca, boolean activo, String modelo, String color,
			String km, String ano, String precio) {
		super();
		this.matricula = matricula;
		this.estado = estado;
		this.marca = marca;
		this.activo = activo;
		this.modelo = modelo;
		this.color = color;
		this.km = km;
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

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	
	
	
	
	

}
