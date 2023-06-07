package com.spring.backend.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import com.spring.backend.models.Contacto;


public interface ContactoRepository extends MongoRepository<Contacto, String> {


}

