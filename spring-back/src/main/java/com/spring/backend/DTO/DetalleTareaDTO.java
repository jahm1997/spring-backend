package com.spring.backend.DTO;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DetalleTareaDTO {

	@JsonProperty("responsable")
	private String responsable;
	
	@JsonProperty("fechaLimite")
	private Date fechaLimite;
	
	@JsonProperty("fechaGeneracion")
	private Date fechaGeneracion;

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public Date getFechaLimite() {
		return fechaLimite;
	}

	public void setFechaLimite(Date fechaLimite) {
		this.fechaLimite = fechaLimite;
	}

	public Date getFechaGeneracion() {
		return fechaGeneracion;
	}

	public void setFechaGeneracion(Date fechaGeneracion) {
		this.fechaGeneracion = fechaGeneracion;
	}
	
	
}
