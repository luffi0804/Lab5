package com.example.demo.modelo;

import com.example.demo.entity.Persona;

public class MPersona {
	
	public MPersona() {
		
	}
	
	public MPersona (Persona nombre) {
		this.nombre= nombre.getNombre();
	}
	public MPersona(String nombre) {
		this.nombre = nombre;
	}

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
