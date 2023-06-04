package com.spring.backend.DTO;


import com.fasterxml.jackson.annotation.JsonProperty;

public class TareaDTO {

	@JsonProperty("tipo")
	private String tipo;
	
	@JsonProperty("titulo")
	private String titulo;

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
