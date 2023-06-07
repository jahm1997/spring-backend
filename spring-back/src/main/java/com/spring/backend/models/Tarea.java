package com.spring.backend.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "tarea")
public class Tarea {
	
	@Id
	private String id;
	
	@Field(name = "tipo")
	private String tipo;
	
	@Field(name = "titulo")
	private String titulo;
	
	public Tarea() {
		// TODO Auto-generated constructor stub
	}

	public Tarea(String id, String tipo, String titulo) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.titulo = titulo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	
}
