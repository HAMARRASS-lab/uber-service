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

import com.hamzetsaa.uberprojectservice.entities.Marque;
import com.hamzetsaa.uberprojectservice.services.MarqueService;

@RestController
@RequestMapping("/api")
public class MarqueController {

	
	private MarqueService marqueService;

	// injection service
	
	@Autowired
	public MarqueController(MarqueService TheMarqueService) {
		marqueService = TheMarqueService ;
	}
	
	// create mapping to expose all villes
	@GetMapping( value ="/marques")
	public List <Marque>findAll () {
		
		return marqueService.findAll();
	}
	
	
	// crete mapping to expose a ville with a primary key 
	
	@GetMapping(value="/marques/{idMarque}")
	public Optional<Marque> getMarque(@PathVariable int  idMarque) {
		
	Optional<Marque> theMarque = marqueService.findById(idMarque);
	
	if(theMarque == null) {
		

		throw new RuntimeException( " the Marque is not found "+ idMarque);

	}
	return theMarque;
	}
	
	// create a mipping to save a ville 
	
	@PostMapping("/marques")
	public Marque addMarque (@RequestBody Marque theMarque) {
		/* theVille.setIdVille(0); */
		marqueService.save(theMarque);
		return theMarque;
	}

	@PutMapping("/marques")
	public Marque updateMarque(@RequestBody Marque theMarque) {
		
		marqueService.save(theMarque);
		
		return theMarque;
	}
	
	// add mapping to delete an ville
	
	@DeleteMapping(value ="/marques/{idMarque")
	public String deleteMarque( @PathVariable int idMarque) {
		
		Optional<Marque> theMarque = marqueService.findById(idMarque);
		
		if (theMarque == null) {
			
			throw new RuntimeException( " the id of Marque is not found "+ idMarque);
		}
		marqueService.deleteById(idMarque);
		return " the Marque was deleted "+ idMarque;
		
	}
}
