package ar.edu.unju.fi.model;

public class Alumno {

	private int dni;
	private String nombre;
	private String apellido;
	private String email;
	private int telefono;
	
	public Alumno() {
		
	}
	
	
	/**
	 * @param dni
	 * @param nombre
	 * @param apellido
	 * @param email
	 * @param telefono
	 */
	public Alumno(int dni, String nombre, String apellido, String email, int telefono) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
	}




	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
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

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
	
}
