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
import com.hamzetsaa.uberprojectservice.entities.Ville;
import com.hamzetsaa.uberprojectservice.services.VilleService;

@RestController
@RequestMapping("/api")

public class VilleController {
	

	private VilleService villeService;

	// injection service
	
	@Autowired
	public VilleController(VilleService TheVilleService) {
		villeService = TheVilleService ;
	}
	
	// create mapping to expose all villes
	@GetMapping( value ="/villes")
	public List <Ville>findAll () {
		
		return villeService.findAll();
	}
	
	
	// crete mapping to expose a ville with a primary key 
	
	@GetMapping(value="/villes/{idVille}")
	public Optional<Ville> getVille(@PathVariable int  idVille) {
		
	Optional<Ville> theVille = villeService.findById(idVille);
	
	if(theVille == null) {
		

		throw new RuntimeException( "  Narjis the City is not found "+ idVille);

	}
	return theVille;
	}
	
	// create a mipping to save a ville 
	
	@PostMapping("/villes")
	public Ville addVille (@RequestBody Ville theVille) {
		/* theVille.setIdVille(0); */
		villeService.save(theVille);
		return theVille;
	}

	@PutMapping("/villes")
	public Ville updateVille(@RequestBody Ville theVille) {
		
		villeService.save(theVille);
		
		return theVille;
	}
	
	// add mapping to delete an ville
	
	@DeleteMapping(value ="/villes/{idVille}")
	public String deleteVille( @PathVariable int idVille) {
		
		Optional<Ville> theVille = villeService.findById(idVille);
		
		if (theVille == null) {
			
			throw new RuntimeException( " the id of ville is not found "+idVille);
		}
		villeService.deleteById(idVille);
		return " the City was deleted "+idVille;
		
	}
}
