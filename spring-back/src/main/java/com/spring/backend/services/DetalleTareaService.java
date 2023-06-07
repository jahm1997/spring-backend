package com.spring.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.backend.DTO.DetalleTareaDTO;
import com.spring.backend.models.DetalleTarea;
import com.spring.backend.repository.DetalleTareaRepository;

@Service
public class DetalleTareaService {

	@Autowired
	private DetalleTareaRepository detalleTareaRepository;

	public List<DetalleTarea> obtenerDetalles() {
		return detalleTareaRepository.findAll();
	}

	public Optional<DetalleTarea> detalles(String id) {
		return detalleTareaRepository.findById(id);
	}

	public DetalleTarea agregarDetalles(DetalleTareaDTO detalleTarea) {

		// private String responsable;
		// private Date fechaLimite;
		// private Date fechaGeneracion;
		DetalleTarea auxiliar = new DetalleTarea();
		auxiliar.setResponsable(detalleTarea.getResponsable());
		auxiliar.setFechaLimite(detalleTarea.getFechaLimite());
		auxiliar.setFechaGeneracion(detalleTarea.getFechaGeneracion());
		try {
			detalleTareaRepository.save(auxiliar);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return auxiliar;
	}

	public DetalleTarea borrarDetalles(String id) {
		Optional<DetalleTarea> detalleOptional = detalleTareaRepository.findById(id);
		if (detalleOptional.isPresent()) {
			detalleTareaRepository.deleteById(id);
			return detalleOptional.get();
		} else {
			return null;
		}
	}

}
