package com.mx.persona.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // indica que esta clase va a ser mi entidad
@Table(name = "PERSONA")
public class Personas {

	/*
	 * CREATE TABLE PERSONA( ID NUMBER PRIMARY KEY, NOMBRE NVARCHAR2(100), APP
	 * NVARCHAR2(100), APM NVARCHAR2(100), EDAD NUMBER, PESO NUMBER, ESTATURA
	 * NUMBER, ESTADOCIVIL NVARCHAR2(100) );
	 */

	@Id // con esta anotacion idico que es mi llave
	@Column(name = "ID", columnDefinition = "NUMBER") // @Column mapeo mi tabla, es decir me dice la estructra de mis
														// atributos > con esto estamos mapeando la tabla
	int id;
	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2(100)")
	String nombre;
	@Column(name = "APP", columnDefinition = "NVARCHAR2(100)")
	String app;
	@Column(name = "APM", columnDefinition = "NVARCHAR2(100)")
	String apm;
	@Column(name = "EDAD", columnDefinition = "NUMBER")
	int edad;
	@Column(name = "PESO", columnDefinition = "NUMBER")
	int peso;
	@Column(name = "ESTATURA", columnDefinition = "NUMBER")
	int estatura;
	@Column(name = "ESTADOCIVIL", columnDefinition = "NVARCHAR2(100)")
	String estadocivil;

	public Personas() {

	}

	public Personas(int id) {

		this.id = id;
	}

	public Personas(int id, String nombre, String app, String apm, int edad, int peso, int estatura,
			String estadocivil) {

		this.id = id;
		this.nombre = nombre;
		this.app = app;
		this.apm = apm;
		this.edad = edad;
		this.peso = peso;
		this.estatura = estatura;
		this.estadocivil = estadocivil;
	}

	@Override
	public String toString() {
		return "Personas [id=" + id + ", nombre=" + nombre + ", app=" + app + ", apm=" + apm + ", edad=" + edad
				+ ", peso=" + peso + ", estatura=" + estatura + ", estadocivil=" + estadocivil + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getApm() {
		return apm;
	}

	public void setApm(String apm) {
		this.apm = apm;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getEstatura() {
		return estatura;
	}

	public void setEstatura(int estatura) {
		this.estatura = estatura;
	}

	public String getEstadocivil() {
		return estadocivil;
	}

	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}

}
