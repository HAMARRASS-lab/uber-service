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
import com.hamzetsaa.uberprojectservice.entities.Vehicule;
import com.hamzetsaa.uberprojectservice.services.VehiculeService;

@RestController
@RequestMapping(value ="/api")
public class VehiculeController {
	
	// injjection service object 
	
	private VehiculeService vehiculeService;
	
	@Autowired
	public VehiculeController( VehiculeService theVehiculeService){
		
		vehiculeService= theVehiculeService;
	}

	
//create mapping  explotre all chauffeur
	
@GetMapping( value ="/vehicules")
public List  <Vehicule> findAll(){
		
	return vehiculeService.findAll();
}

// crete mapping to expose a ville with a primary key 

@GetMapping(value="/vehicules/{idVehicule}")
public Optional<Vehicule> getVehicule(@PathVariable int  idVehicule) {
	
Optional<Vehicule> theVehicule = vehiculeService.findById(idVehicule);
	
	if(theVehicule == null) {
		
	
		throw new RuntimeException( " the Vehicule is not found "+ idVehicule);
	
	}
 return theVehicule;
}

// create a mipping to save a ville 

@PostMapping("/vehicules")
public Vehicule addVehicule (@RequestBody Vehicule theVehicule) {
	
	/* theVille.setIdVille(0); */
	vehiculeService.save(theVehicule);
	
	return theVehicule;
}

@PutMapping("/vehicules")
public Vehicule updateVehicule(@RequestBody Vehicule theVehicule) {
	
	vehiculeService.save(theVehicule);
	
	return theVehicule;
}

// add mapping to delete an ville

@DeleteMapping(value ="/vehiucles/{idVehicule}")
public String deleteVehicule( @PathVariable int idVehicule) {
	
	Optional<Vehicule> theVehicule = vehiculeService.findById(idVehicule);
	
	if (theVehicule == null) {
		
		throw new RuntimeException( " the id of Vehicule is not found "+ idVehicule);
	}
	vehiculeService.deleteById(idVehicule);
	
	return " the Chauffeur was deleted "+ idVehicule;
	
}
}
