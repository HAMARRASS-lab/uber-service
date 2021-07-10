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
import com.hamzetsaa.uberprojectservice.entities.Chauffeur;
import com.hamzetsaa.uberprojectservice.services.ChauffeurService;

@RestController
@RequestMapping(value ="/api")
public class ChauffeurController {
	
	// injjection service object 
	
	private ChauffeurService chauffeurService;
	
	@Autowired
	public ChauffeurController( ChauffeurService theChauffeurService){
		
		chauffeurService= theChauffeurService;
	}

	
//create mapping  explotre all chauffeur
	
@GetMapping( value ="/chauffeurs")
public List  <Chauffeur> findAll(){
		
	return chauffeurService.findAll();
}

// crete mapping to expose a ville with a primary key 

@GetMapping(value="/chauffeurs/{idChauffeur}")
public Optional<Chauffeur> getChauffeur(@PathVariable int  idChauffeur) {
	
Optional<Chauffeur> theChauffeur = chauffeurService.findById(idChauffeur);
	
	if(theChauffeur == null) {
		
	
		throw new RuntimeException( " the Chauffeur is not found "+ idChauffeur);
	
	}
 return theChauffeur;
}

// create a mipping to save a ville 

@PostMapping("/chauffeurs")
public Chauffeur addChauffeur (@RequestBody Chauffeur theChauffeur) {
	
	/* theVille.setIdVille(0); */
	chauffeurService.save(theChauffeur);
	
	return theChauffeur;
}

@PutMapping("/chauffeurs")
public Chauffeur updateChauffeur(@RequestBody Chauffeur theChauffeur) {
	
	chauffeurService.save(theChauffeur);
	
	return theChauffeur;
}

// add mapping to delete an ville

@DeleteMapping(value ="/chauffeurs/{idChauffeur}")
public String deleteChauffeur( @PathVariable int idChauffeur) {
	
	Optional<Chauffeur> theChauffeur = chauffeurService.findById(idChauffeur);
	
	if (theChauffeur == null) {
		
		throw new RuntimeException( " the id of Chauffeur is not found "+ idChauffeur);
	}
	chauffeurService.deleteById(idChauffeur);
	
	return " the Chauffeur was deleted "+ idChauffeur;
	
}
}

