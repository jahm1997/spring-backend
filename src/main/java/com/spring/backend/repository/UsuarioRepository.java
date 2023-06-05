package com.spring.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.backend.models.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {

}
