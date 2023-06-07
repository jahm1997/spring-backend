package com.spring.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.backend.DTO.ContactoDTO;
import com.spring.backend.models.Contacto;
import com.spring.backend.services.ContactoService;

@CrossOrigin("*")
@RestController
@RequestMapping("/contactos")
public class ContactoController {

	
	@Autowired
    private ContactoService contactoService;
    
    @GetMapping("")
    public List<Contacto> obtenerContactos() {
    	System.out.println("Esto es / del controllador Contactos");
        return contactoService.obtenerContacto();
    }
    
    @GetMapping("/detalles/{id}")
    public Optional<Contacto> detalleContacto(@PathVariable String id) {
    	System.out.println("Esto es /detalles/{id} del controllador Contactos");
        return contactoService.detalleContacto(id);
    }
    
    @PostMapping("/cargue")
    public Contacto agregarContacto(@RequestBody ContactoDTO contacto) {
    	System.out.println(contacto);
    	System.out.println("Esto es /cargue del controllador Contactos");
        return contactoService.agregarContacto(contacto);
    }
    
    @DeleteMapping("/borrar/{id}")
    public Contacto borrarContacto(@PathVariable String id) {
    	System.out.println("Este es el id:" + id);
    	System.out.println("Esto es /borrar/{id} del controllador Contactos");
        return contactoService.borrarContacto(id);
    }
    
    @PutMapping("/actualizar/{id}")
    public Contacto actualizar(@RequestBody ContactoDTO contacto, String id) {
    	System.out.println(contacto);
    	System.out.println("Esto es /actualizar/{id} del controllador Contactos");
    	return contactoService.editarContacto(contacto, id);
    }
	
}
