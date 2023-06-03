package com.spring.backend.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tareas")
public class Tarea {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String tipo;
	private String titulo;
	
	@ManyToOne
	private Usuario usuario;
	
	@OneToOne
	private Tarea tarea;
	
	@OneToMany(mappedBy = "detalleTareas")
	private List<DetalleTarea> detalleTareas;
	
	public Tarea() {
		// TODO Auto-generated constructor stub
	}

	public Tarea(Integer id, String tipo, String titulo) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.titulo = titulo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
	public Tarea getTarea() {
		return tarea;
	}

	public void setTarea(Tarea tarea) {
		this.tarea = tarea;
	}

	public List<DetalleTarea> getDetalleTareas() {
		return detalleTareas;
	}

	public void setDetalleTareas(List<DetalleTarea> detalleTareas) {
		this.detalleTareas = detalleTareas;
	}

	@Override
	public String toString() {
		return "Tareas [id=" + id + ", tipo=" + tipo + ", titulo=" + titulo + "]";
	}
	
	
	
}
