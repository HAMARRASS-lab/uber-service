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
import com.hamzetsaa.uberprojectservice.entities.Colis;
import com.hamzetsaa.uberprojectservice.services.ColisService;

@RestController
@RequestMapping(value="/api")
public class ColisController {
// injjection service object 
	
	private ColisService colisService;
	
	@Autowired
	public ColisController( ColisService theColisService){
		
		colisService= theColisService;
	}

//create mapping  explore all colis
	
@GetMapping( value ="/colis")
public List  <Colis> findAll(){
		
	return colisService.findAll();
}

// crete mapping to expose a colis with a primary key 

@GetMapping(value="/colis/{idColis}")
public Optional<Colis> getColis(@PathVariable int  idColis) {
	
Optional<Colis> theColis = colisService.findById(idColis);
	
	if(theColis == null) {
		
	
		throw new RuntimeException( " the id Colis is not found "+ theColis);
	}
 return theColis;
}

// create a mipping to save a colis 

@PostMapping("/colis")
public Colis addColis (@RequestBody Colis theColis) {
	

	colisService.save(theColis);
	
	return theColis;
}

@PutMapping("/colis/{idColis}")
public Colis updateColis(@RequestBody Colis theColis) {
	
	colisService.save(theColis);
	
	return theColis;
}

// add mapping to delete an colis

@DeleteMapping(value ="/colis/{idColis}")
public String deleteColis( @PathVariable int idColis) {
	
	Optional<Colis> theColis = colisService.findById(idColis);
	
	if (theColis == null) {
		
		throw new RuntimeException( " the id of Colis is not found "+ idColis);
	}
	colisService.deleteById(idColis);
	
	return " the Colis was deleted "+ idColis;
	
}
}
