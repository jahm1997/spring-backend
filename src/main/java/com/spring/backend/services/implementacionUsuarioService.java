package com.spring.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.backend.DTO.UsuarioDTO;
import com.spring.backend.models.Usuario;
import com.spring.backend.repository.UsuarioRepository;

public class implementacionUsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
		
	public List<Usuario> obtenerUsuarios(){
		return usuarioRepository.findAll();
	}

	public Optional<Usuario> detalleUsuario(Integer id) {
		return usuarioRepository.findById(id);
	}

	public Usuario agregarTarea(UsuarioDTO usuario) {
		

		//private String nombres;
		//private String apellidos;
		//private String email;
		//private String telefono;
		//private Date fechaNacimiento;
		//private String direccion;
		//private String tipoContacto;
		//private String origen;
		
		Usuario auxiliar = new Usuario();
		auxiliar.setNombres(usuario.getNombres());
		auxiliar.setApellidos(usuario.getApellidos());
		auxiliar.setEmail(usuario.getEmail());
		auxiliar.setTelefono(usuario.getTelefono());
		auxiliar.setFechaNacimiento(usuario.getFechaNacimiento());
		auxiliar.setDireccion(usuario.getDireccion());
		auxiliar.setTipoContacto(usuario.getTipoContacto());
		auxiliar.setOrigen(usuario.getOrigen());
		
		try {
			usuarioRepository.save(auxiliar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return auxiliar;
	}

	public Usuario borrarUsuario(Integer id) {
        Optional<Usuario> usuarioOptional = usuarioRepository.findById(id);
        if (usuarioOptional.isPresent()) {
        	Usuario usuario = usuarioOptional.get();
        	usuarioRepository.deleteById(usuario.getId());
            return usuario;
        } else {
            return null;
        }
		
	}
	
}
