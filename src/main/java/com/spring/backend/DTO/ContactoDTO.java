package com.spring.backend.DTO;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContactoDTO {
	
	@JsonProperty("nombres")
	private String nombres;
	
	@JsonProperty("apellidos")
	private String apellidos;
	
	@JsonProperty("email") 
	private String email;
	
	@JsonProperty("telefono")
	private String telefono;
	
	@JsonProperty("fechaNacimiento")
	private Date fechaNacimiento;
	
	@JsonProperty("direccion")
	private String direccion;
	
	@JsonProperty("tipoContacto")
	private String tipoContacto;
	
	@JsonProperty("origen")
	private String origen;

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTipoContacto() {
		return tipoContacto;
	}

	public void setTipoContacto(String tipoContacto) {
		this.tipoContacto = tipoContacto;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
}
