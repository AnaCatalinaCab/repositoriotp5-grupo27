package ar.edu.unju.fi.model;

public class Beca {
	private String codigo;
	private String curso;
	private String fecha_inicio;
	private String fecha_cierre;
	
	public Beca() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Beca(String codigo, String curso, String fecha_inicio, String fecha_cierre, String estado) {
		super();
		this.codigo = codigo;
		this.curso = curso;
		this.fecha_inicio = fecha_inicio;
		this.fecha_cierre = fecha_cierre;
		this.estado = estado;
	}





	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public String getFecha_cierre() {
		return fecha_cierre;
	}
	public void setFecha_cierre(String fecha_cierre) {
		this.fecha_cierre = fecha_cierre;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	private String estado;
}
