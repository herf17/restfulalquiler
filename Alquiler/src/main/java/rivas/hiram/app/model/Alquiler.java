package rivas.hiram.app.model;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "alquiler")
public class Alquiler {
	
	@Id
    @Column(name = "alquiler_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name="fecha_alquiler")
	private Date fecha;
	
	@Column
	private boolean estado;
	
	@ManyToOne
	@JoinColumn(name = "User_id", referencedColumnName = "user_id")
	private Usuarios usuarios;
	
	@Column
	@Temporal(TemporalType.DATE)
	private java.util.Date fecha_ini;
	
	@Column
	@Temporal(TemporalType.DATE)
	private java.util.Date fecha_fin;
	
	@ManyToMany(mappedBy = "alquileres", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	private Set<Vehiculo> vehiculos = new HashSet<>();
	
	public Alquiler() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public java.util.Date getFecha_ini() {
		return fecha_ini;
	}

	public void setFecha_ini(java.util.Date fecha_ini) {
		this.fecha_ini = fecha_ini;
	}

	public java.util.Date getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(java.util.Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public Usuarios getUsuarios() {
		return usuarios;
	}

	public Set<Vehiculo> getVehiculos() {
		return vehiculos;
	}
	
	
}