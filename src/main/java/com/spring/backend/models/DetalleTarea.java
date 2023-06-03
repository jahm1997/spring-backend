package com.spring.backend.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalleTareas")
public class DetalleTarea {
	private String Responsable;
	private Date FechaLimite;
	private Date FechaGeneracion;
	
	
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


	@Override
	public String toString() {
		return "DetalleTarea [Responsable=" + Responsable + ", FechaLimite=" + FechaLimite + ", FechaGeneracion="
				+ FechaGeneracion + "]";
	}
	
	
	
}
