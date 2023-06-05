package com.spring.backend.models;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;


@Document(collection = "contacto")
public class Contacto {
	
	@Id
	private String id;
	
	@Field(name = "nombres")
	private String nombres;
	
	@Field(name = "apellidos")
	private String apellidos;
	
	@Field(name = "email") 
	private String email;
	
	@Field(name = "telefono")
	private String telefono;
	
	@Field(name = "fechaNacimiento",targetType = FieldType.DATE_TIME)
	private Date fechaNacimiento;
	
	@Field(name = "direccion")
	private String direccion;
	
	@Field(name = "tipoContacto")
	private String tipoContacto;
	
	@Field(name = "origen")
	private String origen;
	
	private List<Tarea> tareas;
	
	public List<Tarea> getTareas() {
		return tareas;
	}

	public Contacto(String id, String nombres, String apellidos, String email, String telefono, Date fechaNacimiento,
			String direccion, String tipoContacto, String origen, List<Tarea> tareas) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.email = email;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.tipoContacto = tipoContacto;
		this.origen = origen;
		this.tareas = tareas;
	}

	public void setContactos(List<Tarea> tareas) {
		this.tareas = tareas;
	}



	public Contacto() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


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
