package ar.edu.unju.fi.model;

public class Docente {
	private int legajo;
	private String nombre;
	private String apellido;
	private String email;
	private String teléfono;
	
	
	
	public Docente() {
		super();
	}
	
	public Docente(int legajo, String nombre, String apellido, String email, String teléfono) {
		super();
		this.legajo = legajo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.teléfono = teléfono;
	}
	
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTeléfono() {
		return teléfono;
	}
	public void setTeléfono(String teléfono) {
		this.teléfono = teléfono;
	}
	
	
	
}
