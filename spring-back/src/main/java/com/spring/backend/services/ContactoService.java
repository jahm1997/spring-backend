package com.spring.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.backend.DTO.ContactoDTO;
import com.spring.backend.models.Contacto;
import com.spring.backend.repository.ContactoRepository;

@Service
public class ContactoService {

	@Autowired
	private ContactoRepository contactoRepository;
		
	public List<Contacto> obtenerContacto(){
		return contactoRepository.findAll();
	}

	public Optional<Contacto> detalleContacto(String id) {
		return contactoRepository.findById(id);
	}

	public Contacto agregarContacto(ContactoDTO contacto) {
		//private Integer id;
		//private String nombres;
		//private String apellidos;
		//private String email;
		//private String telefono;
		//private Date fechaNacimiento;
		//private String direccion;
		//private String tipoContacto;
		//private String origen;
		Contacto auxiliar = new Contacto();
		auxiliar.setNombres(contacto.getNombres());
		auxiliar.setApellidos(contacto.getApellidos());
		auxiliar.setEmail(contacto.getEmail());
		auxiliar.setDireccion(contacto.getDireccion());
		auxiliar.setTelefono(contacto.getTelefono());
		auxiliar.setFechaNacimiento(contacto.getFechaNacimiento());
		auxiliar.setDireccion(contacto.getDireccion());
		auxiliar.setTipoContacto(contacto.getTipoContacto());
		auxiliar.setOrigen(contacto.getOrigen());
		try {
			System.out.println("Linea 48 antes de agregar contacto");
            contactoRepository.save(auxiliar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return auxiliar;
	}

	public Contacto borrarContacto(String id) {
        Optional<Contacto> contactoOptional = contactoRepository.findById(id);
        if (contactoOptional.isPresent()) {
            contactoRepository.deleteById(id);
            return contactoOptional.get();
        } else {
            return null;
        }
		
	}
	
	public Contacto editarContacto( ContactoDTO contactoDTO, String id) {
	    Optional<Contacto> contactoOptional = contactoRepository.findById(id);
	    if (contactoOptional.isPresent()) {
	        Contacto contacto = contactoOptional.get();
	        contacto.setNombres(contactoDTO.getNombres());
	        contacto.setApellidos(contactoDTO.getApellidos());
	        contacto.setEmail(contactoDTO.getEmail());
	        contacto.setDireccion(contactoDTO.getDireccion());
	        contacto.setTelefono(contactoDTO.getTelefono());
	        contacto.setFechaNacimiento(contactoDTO.getFechaNacimiento());
	        contacto.setDireccion(contactoDTO.getDireccion());
	        contacto.setTipoContacto(contactoDTO.getTipoContacto());
	        contacto.setOrigen(contactoDTO.getOrigen());
	        return contactoRepository.save(contacto);
	    } else {
	        return null;
	    }
	}

}
