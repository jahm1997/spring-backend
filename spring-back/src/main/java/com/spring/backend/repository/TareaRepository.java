package com.spring.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.backend.models.Tarea;

public interface TareaRepository extends MongoRepository<Tarea, String>{

}
