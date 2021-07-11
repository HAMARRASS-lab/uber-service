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

import com.hamzetsaa.uberprojectservice.entities.TypeVehicule;
import com.hamzetsaa.uberprojectservice.services.TypeVehiculeService;

@RestController
@RequestMapping(value ="/api")
public class TypeVehiculeController {
	
	// injjection service object 
	
	private TypeVehiculeService typeVehiculeService;
	
	@Autowired
	public TypeVehiculeController( TypeVehiculeService theTypeVehiculeService){
		
		typeVehiculeService= theTypeVehiculeService;
	}

	
//create mapping  explotre all chauffeur
	
@GetMapping( value ="/typeVehicules")
public List  <TypeVehicule> findAll(){
		
	return typeVehiculeService.findAll();
}

// crete mapping to expose a ville with a primary key 

@GetMapping(value="/typeVehicules/{idTypeVehicule}")
public Optional<TypeVehicule> getChauffeur(@PathVariable int  idTypeVehicule) {
	
Optional<TypeVehicule> theTypeVehicule = typeVehiculeService.findById(idTypeVehicule);
	
	if(theTypeVehicule == null) {
		
	
		throw new RuntimeException( " the TypeVehicule is not found "+ idTypeVehicule);
	
	}
 return theTypeVehicule;
}

// create a mipping to save a ville 

@PostMapping("/typeVehicules")
public TypeVehicule addTypeVehicule (@RequestBody TypeVehicule theTypeVehicule) {
	
	/* theVille.setIdVille(0); */
	typeVehiculeService.save(theTypeVehicule);
	
	return theTypeVehicule;
}

@PutMapping("/typeVehicules")
public TypeVehicule updateTypeVehicule(@RequestBody TypeVehicule theTypeVehicule) {
	
	typeVehiculeService.save(theTypeVehicule);
	
	return theTypeVehicule;
}

// add mapping to delete an ville

@DeleteMapping(value ="/typeVehicules/{idTypeVehicule}")
public String deleteTypeVehicule( @PathVariable int idTypeVehicule) {
	
	Optional<TypeVehicule> theTypeVehicule = typeVehiculeService.findById(idTypeVehicule);
	
	if (theTypeVehicule == null) {
		
		throw new RuntimeException( " the id of TypeVehicule is not found "+ idTypeVehicule);
	}
	typeVehiculeService.deleteById(idTypeVehicule);
	
	return " the typeVehicule was deleted "+ idTypeVehicule;
	
}
}

