package com.spring.backend.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalleTareas")
public class DetalleTarea {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String Responsable;
	private Date FechaLimite;
	private Date FechaGeneracion;
	
	@OneToMany
	private Tarea tarea;
	
	
	public DetalleTarea(String responsable, Date fechaLimite, Date fechaGeneracion) {
		super();
		Responsable = responsable;
		FechaLimite = fechaLimite;
		FechaGeneracion = fechaGeneracion;
	}


	public String getResponsable() {
		return Responsable;
	}


	public void setResponsable(String responsable) {
		Responsable = responsable;
	}


	public Date getFechaLimite() {
		return FechaLimite;
	}


	public void setFechaLimite(Date fechaLimite) {
		FechaLimite = fechaLimite;
	}


	public Date getFechaGeneracion() {
		return FechaGeneracion;
	}


	public void setFechaGeneracion(Date fechaGeneracion) {
		FechaGeneracion = fechaGeneracion;
	}

	public Tarea getTarea() {
		return tarea;
	}


	public void setTarea(Tarea tarea) {
		this.tarea = tarea;
	}

	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "DetalleTarea [Responsable=" + Responsable + ", FechaLimite=" + FechaLimite + ", FechaGeneracion="
				+ FechaGeneracion + "]";
	}
	
	
	
}
