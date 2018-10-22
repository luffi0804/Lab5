package com.example.demo.repository;


import java.io.Serializable;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Persona;
 	

@Repository("Repositorio")
public interface RepositorioPersona extends JpaRepository<Persona, Serializable>{

	public abstract Persona findByPersona( String nombre);
	

}
