package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table (name="Persona")
@Entity
public class Persona {
	
	public Persona(Persona nombre) {
		this.nombre= nombre.getNombre();
	}
	
	public Persona(String nombre) {
		this.nombre = nombre;
	
	}
	public Persona() {
		
	}
	@GeneratedValue
	@Id
	@Column(name="NOMBRE")
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}