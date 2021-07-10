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
import com.hamzetsaa.uberprojectservice.entities.Paiement;
import com.hamzetsaa.uberprojectservice.services.PaiementService;

@RestController
@RequestMapping(value="/api")
public class PaiementController {
	
	// inject paiement controller 
	
	PaiementService paiementService;
	
	@Autowired
	public  PaiementController (PaiementService ThePaiementService) {
		paiementService =ThePaiementService;
	}
	
	// create mapping to explore all paiement
	
	@GetMapping(value="/paiements")
	public  List  <Paiement> findAll(Paiement thePaiement){
		return paiementService.findAll() ;
	}

	// cretae a mapping to get a paiement with primary key 
	@GetMapping(value="/paiement/{idPaiement}")
	public  Optional <Paiement> findById(@PathVariable int idPaiement){
		Optional  <Paiement>  paiements = paiementService.findById(idPaiement);
		if (paiements == null) {
			
			throw new RuntimeException (" the id of the paiement is not found " + idPaiement);
		}
		return paiements;
	}
	// create a mapping to save a paiement 
	@PostMapping(value="/paiements")
	public Paiement addPaiement (@RequestBody  Paiement thePaiement ) {
		
		paiementService.save(thePaiement);
		
		return thePaiement;
		
	}
	@PutMapping( value ="/paiements")
	public Paiement updatePaiement( @RequestBody  Paiement thePaiement){
		paiementService.save(thePaiement);
		return thePaiement;
	}
	// create mapping to delete a paiement
	@DeleteMapping(value="/paiements/{idPaiement}")
	public String deletePaiement ( @PathVariable int idPaiement  ) {
		Optional  <Paiement>  paiements = paiementService.findById(idPaiement);
		if (paiements == null) {
			
			throw new RuntimeException (" the id of the paiement is not found " + idPaiement);
		}
		paiementService.deleteById(idPaiement);
		
		return " the Paiement is deleted " + idPaiement;
	}
	
}
