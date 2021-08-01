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
import com.hamzetsaa.uberprojectservice.entities.Support;
import com.hamzetsaa.uberprojectservice.services.SupportService;

@RestController
@RequestMapping(value = "/api")
public class SupportController {

	private SupportService supportService;
	@Autowired
	public SupportController(SupportService theSupportService) {

		supportService = theSupportService;
	}
	
	@GetMapping(value = "/supports")
	public List<Support> findAll() {

		return supportService.findAll();
	}
	
	@GetMapping(value = "/supports/{idSupport}")
	public Optional<Support> getSupport(@PathVariable int idSupport) {

		Optional<Support> theSupport = supportService.findById(idSupport);

		if (theSupport == null) {

			throw new RuntimeException(" the Support is not found " + idSupport);

		}
		return theSupport;
	}

	@PostMapping("/supports")
	public Support addSupport(@RequestBody Support theSupport) {

		/* theVille.setIdVille(0); */
		supportService.save(theSupport);

		return theSupport;
	}

	@PutMapping("/supports")
	public Support updateSupport(@RequestBody Support theSupport) {

		supportService.save(theSupport);

		return theSupport;
	}
	
	@DeleteMapping(value = "/supports/{idSupport}")
	public String deleteSupport(@PathVariable int idSupport) {

		Optional<Support> theSupport = supportService.findById(idSupport);

		if (theSupport == null) {

			throw new RuntimeException(" the id of Support is not found " + idSupport);
		}
		supportService.deleteById(idSupport);

		return " the Support was deleted " + idSupport;

	}
}
