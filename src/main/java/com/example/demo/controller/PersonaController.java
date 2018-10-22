package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.converter.convertidor;
import com.example.demo.entity.Persona;
import com.example.demo.service.Servicio;
import com.example.demo.modelo.MPersona;

@RestController
@RequestMapping("/v1")
public class PersonaController {

	@Autowired
	@Qualifier("Servicio")
	Servicio service;
	
	@PutMapping("/Persona")
	public boolean agregarPersona(@RequestBody @Valid Persona nombre){
		
		return service.crear(nombre);
	}
		
	@GetMapping ("/Persona")
	public List<MPersona> ObtenerPersona(){
		
		return service.obtener();
	}

