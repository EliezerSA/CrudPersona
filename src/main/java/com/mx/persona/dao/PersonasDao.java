package com.mx.persona.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.persona.dominio.Personas;

public interface PersonasDao extends CrudRepository<Personas, Integer> {

}
