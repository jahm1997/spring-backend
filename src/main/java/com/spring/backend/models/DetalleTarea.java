package com.spring.backend.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

@Document(collection = "detalleTarea")
public class DetalleTarea {
	@Id
	private Integer id;
	
	@Field(name = "responsable")
	private String responsable;
	
	@Field(name = "fechaLimite", targetType = FieldType.DATE_TIME)
	private Date fechaLimite;
	
	@Field(name = "fechaGeneracion", targetType = FieldType.DATE_TIME)
	private Date fechaGeneracion;

	public DetalleTarea() {
		// TODO Auto-generated constructor stub
	}

	public DetalleTarea(Integer id, String responsable, Date fechaLimite, Date fechaGeneracion) {
		super();
		this.id = id;
		this.responsable = responsable;
		this.fechaLimite = fechaLimite;
		this.fechaGeneracion = fechaGeneracion;
	}
		
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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
