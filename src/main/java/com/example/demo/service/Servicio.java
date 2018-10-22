package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.repository.RepositorioPersona;
import com.example.demo.converter.convertidor;
import com.example.demo.entity.Persona; 
import com.example.demo.modelo.MPersona;

@Service ("Servicio")
public class Servicio {
	
	@Autowired
	@Qualifier ("Repositorio")
	private RepositorioPersona repositorio;
	
	@Autowired
	@Qualifier("convertidor")
	private convertidor convertidor;
	
	public boolean crear(Persona nombre) {
		try {
			repositorio.save(nombre);
			return true;
		}catch (Exception e) {
			return false;
			
		}
		
	}
	
	public boolean Actualizar(Persona nombre) {
		
		try {
			repositorio.save(nombre);
			return true;
			
		}catch(Exception e) {
			return false;
		}
	}
		
		public List<MPersona> obtener(){
			return convertidor.convertirLista(repositorio.findAll());
		}
		

	}
	
	
