package com.spring.backend.repository;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.spring.backend.models.Contacto;


public interface ContactoRepository extends MongoRepository<Contacto, ObjectId> {


}

