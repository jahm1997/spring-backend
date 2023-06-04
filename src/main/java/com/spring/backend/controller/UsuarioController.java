package com.spring.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.spring.backend.DTO.UsuarioDTO;
import com.spring.backend.models.Usuario;
import com.spring.backend.services.ImplementacionUsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private ImplementacionUsuarioService usuarioService	;
	
	@GetMapping("")
	public List<Usuario> obtenerUsuario(){
		System.out.println("Esto es / del controllador usuario");
		return usuarioService.obtenerUsuarios();
	}
	
	@GetMapping("/detalles/{id}")
    public Optional<Usuario> detalleUsuario(@PathVariable String id) {
		Integer numero = Integer.parseInt(id);
        return usuarioService.detalleUsuario(numero);
    }
    
    @PostMapping("/cargue")
    public Usuario agregarTAreas(@RequestBody UsuarioDTO usuario) {
        return usuarioService.agregarUsuario(usuario);
    }
    
    @DeleteMapping("/borrar/{id}")
    public Usuario borrarUsuario(@PathVariable String id) {
    	Integer variable = Integer.parseInt(id);
    	return usuarioService.borrarUsuario(variable);
    }
	
}
