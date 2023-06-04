package com.spring.backend.services;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.backend.DTO.UsuarioDTO;
import com.spring.backend.models.Usuario;
import com.spring.backend.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
		
	public List<Usuario> obtenerUsuarios(){
		return usuarioRepository.findAll();
	}

	public Optional<Usuario> detalleUsuario(String id) {
		ObjectId oid = new ObjectId(id);
		return usuarioRepository.findById(oid);
	}

	public Usuario agregarUsuario(UsuarioDTO usuario) {
		

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

	public Usuario borrarUsuario(String id) {
		ObjectId oid = new ObjectId(id);
        Optional<Usuario> usuarioOptional = usuarioRepository.findById(oid);
        if (usuarioOptional.isPresent()) {
        	usuarioRepository.deleteById(oid);
            return usuarioOptional.get();
        } else {
            return null;
        }
		
	}
	
}
