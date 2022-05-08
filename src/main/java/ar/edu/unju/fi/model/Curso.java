package ar.edu.unju.fi.model;

import java.time.LocalDate;

public class Curso {
	private String codigo;
	private String titulo;
	private LocalDate fecha_inicio;
	private LocalDate fecha_fin;
	private int cantidad_horas;
	private String modalidad;
	private Docente docente;
	
	
	
	public Curso() {
		
	}
	
	public Curso(String codigo, String titulo, LocalDate fecha_inicio, LocalDate fecha_fin, int cantidad_horas,
			String modalidad, Docente docente) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.cantidad_horas = cantidad_horas;
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
	public LocalDate getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(LocalDate fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public LocalDate getFecha_fin() {
		return fecha_fin;
	}
	public void setFecha_fin(LocalDate fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	public int getCantidad_horas() {
		return cantidad_horas;
	}
	public void setCantidad_horas(int cantidad_horas) {
		this.cantidad_horas = cantidad_horas;
	}
	public String getModalidad() {
		return modalidad;
	}
	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}
	public Docente getDocente() {
		return docente;
	}
	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	
	
}
