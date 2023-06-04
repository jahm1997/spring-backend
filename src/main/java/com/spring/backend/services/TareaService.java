package com.spring.backend.services;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.backend.DTO.TareaDTO;
import com.spring.backend.models.Tarea;
import com.spring.backend.repository.TareaRepository;

@Service
public class TareaService {

	@Autowired
	private TareaRepository tareaRepository;
		
	public List<Tarea> obtenerTareas(){
		return tareaRepository.findAll();
	}

	public Optional<Tarea> detalleTarea(String id) {
		ObjectId oid = new ObjectId(id);
		return tareaRepository.findById(oid);
	}

	public Tarea agregarTarea(TareaDTO tarea) {
		
		//private String titulo;
		//private String tipo;
		Tarea auxiliar = new Tarea();
		auxiliar.setTitulo(tarea.getTitulo());
		auxiliar.setTipo(tarea.getTipo());
		try {
			System.out.println("Linea 35 antes de guardar una tarea: " + auxiliar);
			return tareaRepository.save(auxiliar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
		return auxiliar;
	}

	public Tarea borrarTarea(String id) {
		ObjectId oid = new ObjectId(id);
        Optional<Tarea> tareaOptional = tareaRepository.findById(oid);
        if (tareaOptional.isPresent()) {
            tareaRepository.deleteById(oid);
            return tareaOptional.get();
        } else {
            return null;
        }
		
	}
	
}
