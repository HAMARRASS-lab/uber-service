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
import com.hamzetsaa.uberprojectservice.entities.Permis;
import com.hamzetsaa.uberprojectservice.services.PermisService;

@RestController
@RequestMapping(value="/api")
public class PermisController {
	
	// injection service 
	 private PermisService permisService;
	 
	 @Autowired
	 public PermisController(PermisService thePermisService) {
		 permisService 	= thePermisService;
	 }
	 
	// create mapping to get all permis s
	 
	 @GetMapping(value="/permis")
	 public List <Permis> findAll(){
		 
		 return permisService.findAll();
	//	System.out.println(Chauffeur.getIdChauffeur());
	 } 
	 
	 // create a maping  to get a  permis with id 
	 @GetMapping(value="/permis/{idPermis}")
	 public Optional <Permis> getPermis( @PathVariable int idPermis){
		 
		 Optional <Permis> thePermisService = permisService.findById(idPermis);
		 
		 if(thePermisService == null ) {
			 
			 throw new RuntimeException("the id permis is not found "+ idPermis);
		 }
		 return thePermisService;
		 
	 }
	 
	 // create a maping  to add a new permis
	 
	 @PostMapping(value="/permis")
	 public Permis addPermis(@RequestBody Permis thePermis) {
		 permisService.save(thePermis);
		return thePermis;
		
	 }
	 
	 // create a maping  to update a  permis
	 
	 @PutMapping(value="/permis/{idPermis}")
	 public Permis updatePermis(@RequestBody Permis  thePermis) {
		 
				permisService.save(thePermis);
				return thePermis;
	 }
	 
	 // create a maping  to delete a permis
	 
	 @DeleteMapping(value="/permis/{idPermis}")
	 public String deletePermis(@PathVariable int idPermis) {
		 
		 Optional <Permis> thePermis = permisService.findById(idPermis);
		 
			 if (thePermis == null ) {
				 
				 throw new RuntimeException("Id permis is not found"+ idPermis);
				
			 }
		 permisService.deleteById(idPermis);
		 
		 return " the permis was deleted"+ idPermis;
		 
	 }
}

