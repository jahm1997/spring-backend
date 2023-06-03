package com.spring.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.backend.models.Contacto;

@Repository
public interface ContactoRepository extends JpaRepository<Contacto, Integer> {

}

