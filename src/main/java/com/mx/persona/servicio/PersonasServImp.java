package com.mx.persona.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.persona.dao.PersonasDao;
import com.mx.persona.dominio.Personas;

public class PersonasServImp implements Metodos {

	@Autowired
	PersonasDao personaDao;

	@Override
	public void guardar(Personas persona) {
		// TODO Auto-generated method stub
		personaDao.save(persona);
	}

	@Override
	public void editar(Personas persona) {
		// TODO Auto-generated method stub
		personaDao.save(persona);
	}

	@Override
	public void eliminar(Personas persona) {
		// TODO Auto-generated method stub
		personaDao.delete(persona);
	}

	@Override
	public Personas buscar(Personas persona) {
		// TODO Auto-generated method stub
		return personaDao.findById(persona.getId()).orElse(null);
	}

	@Override
	public List<Personas> lista() {
		// TODO Auto-generated method stub
		return (List<Personas>) personaDao.findAll();
	}

}
