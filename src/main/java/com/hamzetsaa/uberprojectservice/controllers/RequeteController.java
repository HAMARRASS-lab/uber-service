package com.hamzetsaa.uberprojectservice.controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hamzetsaa.uberprojectservice.entities.Requete;
import com.hamzetsaa.uberprojectservice.services.RequeteService;

@RestController
@RequestMapping(value="/api")
public class RequeteController {
	// inject requete service
	RequeteService requeteService;
	
	@Autowired
	public RequeteController(RequeteService theRequeteService ) {
		requeteService = theRequeteService;
	}
	
	//create a mapping to explore all requetes
	@GetMapping(value="/requetes")
	public List <Requete> findAll(){
		return requeteService.findAll();
	}
	
	// create a mapping to get a requete with primary key
	@GetMapping(value="/requetes/{idRequete}")
	public Optional <Requete> getRequete(@PathVariable int idRequete){
		
		Optional <Requete> theRequete = requeteService.findById(idRequete);
		
		if (theRequete ==  null) {
			throw new RuntimeException( " the id of requete is npt found "+ idRequete);
			
		}
		
		return theRequete;
	}

	// create a mapping to save a requete
	@PostMapping(value="/requetes")
	public  Requete addRequete(@RequestBody Requete theRequete) {
		requeteService.save(theRequete);
		return theRequete;
		
	}
	// create a mapping to update a an exsiting requete
	@PutMapping(value="/requetes/{idRequete}")
	public Requete updateRequete( @RequestBody  Requete theRequete) {
		requeteService.save(theRequete);
		return theRequete;
		
	}
	
	// create a mapping to delete a requete with a primary key
	@DeleteMapping(value="/requetes/{idRequete}")
	public String deleteRequete(@PathVariable int idRequete)
	{
		Optional <Requete> theRequete = requeteService.findById(idRequete);
		if (theRequete == null ) {
			throw new RuntimeException(" the id of requete is not found " + idRequete);
		}
		requeteService.deleteById(idRequete);
		return "the requete was deleted " + idRequete;
	}
}
