package com.spring.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.backend.models.DetalleTarea;

@Repository
public interface DetalleTareaRepository extends JpaRepository<DetalleTarea, Integer>{

}
