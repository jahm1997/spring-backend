package com.spring.backend.services;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
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
		 ObjectId oid = new ObjectId(id);
		return contactoRepository.findById(oid);
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
		ObjectId oid = new ObjectId(id);
        Optional<Contacto> contactoOptional = contactoRepository.findById(oid);
        if (contactoOptional.isPresent()) {
            contactoRepository.deleteById(oid);
            return contactoOptional.get();
        } else {
            return null;
        }
		
	}

}
