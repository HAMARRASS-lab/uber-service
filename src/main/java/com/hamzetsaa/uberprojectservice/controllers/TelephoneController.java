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
import com.hamzetsaa.uberprojectservice.entities.Telephone;
import com.hamzetsaa.uberprojectservice.services.TelephoneService;

@RestController
@RequestMapping(value = "/api")
public class TelephoneController {

	// ineject  telephone service 
	
	TelephoneService telephoneService;
	@Autowired
	public TelephoneController (TelephoneService theTelephoneService) {
		telephoneService 	=  theTelephoneService;
	}
	
		// create a mapping to explore all telephones
		@GetMapping(value = "/telephones")
		public  List <Telephone> findAll(){
			
			return telephoneService.findAll();
		}
		
		// create a mapping to get a telephone with a primary key 
		@GetMapping(value="/telephones/{idTelephone}")
		public Optional <Telephone> getTelephone(@PathVariable int idTelephone){
			Optional <Telephone> theTelephone = telephoneService.findById(idTelephone);
			
			if ( theTelephone== null ) {
				throw new RuntimeException( " the telephone  is not found "+ idTelephone);
			}
			return theTelephone;
		}
			//create a mapping to save a telephone
			@PostMapping(value="/telephones")
			public Telephone addTelephonen( @RequestBody Telephone theTelephone) {
				telephoneService.save(theTelephone);
				return theTelephone;
			}
			
			// create a mapping to update an exsiting evaluation with primary key 
			@PutMapping(value="/telephones/{idTelephone}")
			public Telephone updateTelephone(@RequestBody Telephone theTelephone){
				telephoneService.save(theTelephone);
				 return theTelephone ;
				
			}
			 
			// create a mapping to delete an exsiting telephone with primary key 
			
			@DeleteMapping(value="/telephones/{idTelephone}")
			public String deleteTelephone(@PathVariable int idTelephone){
				Optional <Telephone> theTelephone = telephoneService.findById(idTelephone);
				
				if ( theTelephone== null ) {
					throw new RuntimeException( " the telephone  is not found "+ idTelephone);
				}
				telephoneService.deleteById(idTelephone);
				return "the telephone was deleted "+ idTelephone;
			}
}
