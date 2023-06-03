package com.spring.backend.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import com.spring.backend.models.DetalleTarea;

public interface DetalleTareaRepository extends MongoRepository<DetalleTarea, Integer>{

}
