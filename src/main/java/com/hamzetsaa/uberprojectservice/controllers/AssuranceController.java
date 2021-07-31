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

import com.hamzetsaa.uberprojectservice.entities.Assurance;
import com.hamzetsaa.uberprojectservice.services.AssuranceService;

@RestController
@RequestMapping(value = "/api")
public class AssuranceController {
	private AssuranceService assuranceService;

	@Autowired
	public AssuranceController(AssuranceService theAssuranceService) {

		assuranceService = theAssuranceService;
	}
	
	@GetMapping(value = "/assurances")
	public List<Assurance> findAll() {

		return assuranceService.findAll();
	}
	
	@GetMapping(value = "/assurances/{idAssurance}")
	public Optional<Assurance> getAssurance(@PathVariable int idAssurance) {

		Optional<Assurance> theAssurance = assuranceService.findById(idAssurance);

		if (theAssurance == null) {

			throw new RuntimeException(" the Assurance is not found " + idAssurance);

		}
		return theAssurance;
	}

	@PostMapping("/assurances")
	public  Assurance addAssurance(@RequestBody  Assurance theAssurance) {

		/* theVille.setIdVille(0); */
		 assuranceService.save(theAssurance);

		return theAssurance;
	}
	
	@PutMapping("/assurances")
	public Assurance updateAssurance(@RequestBody Assurance theAssurance) {

		assuranceService.save(theAssurance);

		return theAssurance;
	}
	@DeleteMapping(value = "/assurances/{idAssurance}")
	public String deleteAssurance(@PathVariable int idAssurance) {

		Optional<Assurance> theAssurance = assuranceService.findById(idAssurance);

		if (theAssurance == null) {

			throw new RuntimeException(" the id of Assurance is not found " + idAssurance);
		}
		assuranceService.deleteById(idAssurance);

		return " the Assurance was deleted " + idAssurance;

	}
}
