package rivas.hiram.app.model;

public class AutosDisponibles {
	
	private String matricula;
	
	private String marca;
	
	private String modelo;
	private String color;
	private String ano;
	private String km;
	private String precio;
	public AutosDisponibles(){}
	public AutosDisponibles(String matricula, String marca, String modelo, String color, String ano, String km,
			String precio) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.ano = ano;
		this.km = km;
		this.precio = precio;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
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
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getKm() {
		return km;
	}
	public void setKm(String km) {
		this.km = km;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "AutosDisponibles [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color="
				+ color + ", ano=" + ano + ", km=" + km + ", precio=" + precio + "]";
	}
	
}
