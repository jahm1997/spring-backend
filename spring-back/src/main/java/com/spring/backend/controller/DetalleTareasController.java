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

import com.spring.backend.DTO.DetalleTareaDTO;
import com.spring.backend.models.DetalleTarea;
import com.spring.backend.services.DetalleTareaService;

@CrossOrigin("*")
@RestController
@RequestMapping("/detalles")
public class DetalleTareasController {
	
	@Autowired
	private DetalleTareaService detalleTareaService;
	
	@GetMapping("")
	public List<DetalleTarea> obtenerDetalleTareas(){
		System.out.println("Esto es / del controllador detalles");
		return detalleTareaService.obtenerDetalles();
	}
	
	@GetMapping("/detalles/{id}")
    public Optional<DetalleTarea> detallesTarea(@PathVariable String id) {
		System.out.println("Esto es /detalles/{id} del controllador detalles");
        return detalleTareaService.detalles(id);
    }
    
    @PostMapping("/cargue")
    public DetalleTarea agregarDetalles(@RequestBody DetalleTareaDTO detalleTarea) {
    	System.out.println("Esto es /cargue del controllador detalles");
        return detalleTareaService.agregarDetalles(detalleTarea);
    }
    
    @DeleteMapping("/borrar/{id}")
    public DetalleTarea borrarDetalles(@PathVariable String id) {
    	System.out.println("Esto es /borrar/{id} del controllador detalles");
        return detalleTareaService.borrarDetalles(id);
    }
	
	
}
