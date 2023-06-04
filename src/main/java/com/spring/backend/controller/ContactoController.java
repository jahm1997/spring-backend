package com.spring.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.backend.DTO.ContactoDTO;
import com.spring.backend.models.Contacto;
import com.spring.backend.services.implementacionContactoService;

@Controller
@RequestMapping("/contactos")
public class ContactoController {

	@Autowired
    private implementacionContactoService contactoService;
    
    @GetMapping("")
    public List<Contacto> obtenerContactos() {
        return contactoService.obtenerContacto();
    }
    
    @GetMapping("/detalles/{id}")
    public Optional<Contacto> selectContacto(@PathVariable String id) {
    	Integer numero = Integer.parseInt(id);
        return contactoService.detalleContacto(numero);
    }
    
    @PostMapping("/cargue")
    public Contacto addContacto(@RequestBody ContactoDTO contacto) {
        return contactoService.agregarContacto(contacto);
    }
    
    @DeleteMapping("/borrar/{id}")
    public Contacto deleteContacto(@PathVariable String id) {
    	Integer variable = Integer.parseInt(id);
        return contactoService.borrarContacto(variable);
    }
	
}
