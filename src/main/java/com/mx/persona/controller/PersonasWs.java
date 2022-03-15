package com.mx.persona.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.persona.dominio.Personas;
import com.mx.persona.servicio.Metodos;



@RestController 
@RequestMapping ("PersonasWs") 
@CrossOrigin 

public class PersonasWs {

	@Autowired 
	Metodos metodos;
	
	@GetMapping ("lista") 
	public List<Personas> lista(){
		List<Personas> lista = metodos.lista();
		
		return lista;
	}
	//@Requestbody convierte el json en objeto
	//la url nuevamente : http://localhost:9000/PersonasWs/guardar
	//Guardar
	@PostMapping("guardar")
	public void guardar(@RequestBody Personas persona) {
		metodos.guardar(persona);
	}

	//url:http://localhost:9000/PérsonasWs/eliminar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Personas persona) {
		metodos.eliminar(persona);
	}
	//url: http://localhost:9000/PersonasWs/editar
	@PostMapping("editar")
	public void editar(@RequestBody Personas persona) {
		metodos.editar(persona);
	}
	//url: http://localhost:9000/PersonasWs/buscar
	@PostMapping("buscar")
	public void buscar(@RequestBody Personas persona) {
		persona = metodos.buscar(persona);
		metodos.eliminar(persona);
	}
}
