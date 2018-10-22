package com.example.demo.converter;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import com.example.demo.entity.Persona;
import com.example.demo.modelo.MPersona;

@Component("ConvertidorPersona")
public class convertidor {
	
	public List<MPersona> convertirLista(List<Persona> nombre){
			List <MPersona> mpersona = new ArrayList<>();
		
		for(Persona per: nombre) {
			mpersona.add(new MPersona(per));
		}
		return mpersona;
	}

	

}
