package ar.edu.unju.fi.model;

public class Curso {
	private String codigo;
	private String titulo;
	private String categoria;
	private String fecha_inicio;
	private String fecha_fin;
	private String cantidad_de_horas;
	private String modalidad;
	private String docente;
	
	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Curso(String codigo, String titulo, String categoria, String fecha_inicio, String fecha_fin,
			String cantidad_de_horas, String modalidad, String docente) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.categoria = categoria;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.cantidad_de_horas = cantidad_de_horas;
		this.modalidad = modalidad;
		this.docente = docente;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public String getFecha_fin() {
		return fecha_fin;
	}
	public void setFecha_fin(String fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	public String getCantidad_de_horas() {
		return cantidad_de_horas;
	}
	public void setCantidad_de_horas(String cantidad_de_horas) {
		this.cantidad_de_horas = cantidad_de_horas;
	}
	public String getModalidad() {
		return modalidad;
	}
	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}
	public String getDocente() {
		return docente;
	}
	public void setDocente(String docente) {
		this.docente = docente;
	}
	
}
