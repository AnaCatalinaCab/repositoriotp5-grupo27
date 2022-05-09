package ar.edu.unju.fi.model;

import java.time.LocalDate;

public class Beca {

	private int codigo;
	private Curso curso;
	private LocalDate fechaInicio;
	private LocalDate fechaCierra;
	private String estado;
	
	public Beca() {
		super();
	}

	public Beca(int codigo, Curso curso, LocalDate fechaInicio, LocalDate fechaCierra, String estado) {
		super();
		this.codigo = codigo;
		this.curso = curso;
		this.fechaInicio = fechaInicio;
		this.fechaCierra = fechaCierra;
		this.estado = estado;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaCierra() {
		return fechaCierra;
	}

	public void setFechaCierra(LocalDate fechaCierra) {
		this.fechaCierra = fechaCierra;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
