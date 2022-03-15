package com.mx.persona.servicio;

import java.util.List;

import com.mx.persona.dominio.Personas;

public interface Metodos {

	public void guardar(Personas persona);

	public void editar(Personas persona);

	public void eliminar(Personas persona);

	public Personas buscar(Personas persona);

	public List<Personas> lista();

}
