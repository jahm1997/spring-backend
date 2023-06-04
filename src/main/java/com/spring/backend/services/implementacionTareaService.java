package com.spring.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.backend.DTO.TareaDTO;
import com.spring.backend.models.Tarea;
import com.spring.backend.repository.TareaRepository;

public class implementacionTareaService {

	@Autowired
	private TareaRepository tareaRepository;
		
	public List<Tarea> obtenerDetalles(){
		return tareaRepository.findAll();
	}

	public Optional<Tarea> detalleContacto(Integer id) {
		return tareaRepository.findById(id);
	}

	public Tarea agregarTarea(TareaDTO tarea) {
		
		//private String titulo;
		//private String titulo;
		Tarea auxiliar = new Tarea();
		auxiliar.setTitulo(tarea.getTitulo());
		auxiliar.setTipo(tarea.getTipo());
		try {
			tareaRepository.save(auxiliar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return auxiliar;
	}

	public Tarea borrarTarea(Integer id) {
        Optional<Tarea> tareaOptional = tareaRepository.findById(id);
        if (tareaOptional.isPresent()) {
        	Tarea tarea = tareaOptional.get();
            tareaRepository.deleteById(tarea.getId());
            return tarea;
        } else {
            return null;
        }
		
	}
	
}
