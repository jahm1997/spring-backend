package com.spring.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.backend.DTO.TareaDTO;
import com.spring.backend.models.Tarea;
import com.spring.backend.services.TareaService;

@CrossOrigin("http://localhost:8080")
@RestController
@RequestMapping("/tarea")
public class TareaController {

	@Autowired
	private TareaService tareaService;
	
	@GetMapping("")
	public List<Tarea> tareas(){
		System.out.println("Esto es / del controllador tarea");
		return tareaService.obtenerTareas();
	}
	
	@GetMapping("/detalles/{id}")
    public Optional<Tarea> detalles(@PathVariable String id) {
        return tareaService.detalleTarea(id);
    }
    
    @PostMapping("/cargue")
    public Tarea agregar(@RequestBody TareaDTO tarea) {
    	System.out.println("Linea 41 antes al recibir una tarea: " + tarea);
        return tareaService.agregarTarea(tarea);
    }
    
    @DeleteMapping("/borrar/{id}")
    public Tarea borrar(@PathVariable String id) {
    	return tareaService.borrarTarea(id);
    }
}
