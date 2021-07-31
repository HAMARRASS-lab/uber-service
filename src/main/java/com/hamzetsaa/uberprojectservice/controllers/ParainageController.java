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
import com.hamzetsaa.uberprojectservice.entities.Parainage;
import com.hamzetsaa.uberprojectservice.services.ParainageService;

@RestController
@RequestMapping(value = "/api")
public class ParainageController {

	private ParainageService parainageService;
	@Autowired
	public ParainageController(ParainageService theParainageService) {

		parainageService = theParainageService;
	}
   
	@GetMapping(value = "/parainages")
	public List<Parainage> findAll() {

		return parainageService.findAll();
	}
	
	@GetMapping(value = "/parainages/{idParainage}")
	public Optional<Parainage> getParainage(@PathVariable int idParainage) {

		Optional<Parainage> theParainage = parainageService.findById(idParainage);

		if (theParainage == null) {

			throw new RuntimeException(" the Chauffeur is not found " + idParainage);

		}
		return theParainage;
	}
	
	@PostMapping("/parainages")
	public Parainage addParainage(@RequestBody Parainage theParainage) {

		/* theVille.setIdVille(0); */
		parainageService.save(theParainage);

		return theParainage;
	}
	@PutMapping("/parainages")
	public Parainage updateParainage(@RequestBody Parainage theParainage) {

		parainageService.save(theParainage);

		return theParainage;
	}
	@DeleteMapping(value = "/parainages/{idParainage}")
	public String deleteParainage(@PathVariable int idParainage) {

		Optional<Parainage> theParainage = parainageService.findById(idParainage);

		if (theParainage == null) {

			throw new RuntimeException(" the id of Parainage is not found " + idParainage);
		}
		parainageService.deleteById(idParainage);

		return " the Parainage was deleted " + idParainage;

	}
}
