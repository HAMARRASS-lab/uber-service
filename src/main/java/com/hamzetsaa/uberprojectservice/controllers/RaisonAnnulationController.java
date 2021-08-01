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
import com.hamzetsaa.uberprojectservice.entities.RaisonAnnulation;
import com.hamzetsaa.uberprojectservice.services.RaisonAnnulationService;

@RestController
@RequestMapping(value = "/api")
public class RaisonAnnulationController {

	private RaisonAnnulationService raisonAnnulationService;

	@Autowired
	public RaisonAnnulationController(RaisonAnnulationService theRaisonAnnulationService) {

		raisonAnnulationService = theRaisonAnnulationService;
	}

//create mapping  explotre all chauffeur

	@GetMapping(value = "/raisonAnnulations")
	public List<RaisonAnnulation> findAll() {

		return raisonAnnulationService.findAll();
	}

// crete mapping to expose a ville with a primary key 

	@GetMapping(value = "/raisonAnnulations/{idRaisonAnnulation}")
	public Optional<RaisonAnnulation> getRaisonAnnulation(@PathVariable int idRaisonAnnulation) {

		Optional<RaisonAnnulation> theRaisonAnnulation = raisonAnnulationService.findById(idRaisonAnnulation);

		if (theRaisonAnnulation == null) {

			throw new RuntimeException(" the RaisonAnnulation is not found " + idRaisonAnnulation);

		}
		return theRaisonAnnulation;
	}

// create a mipping to save a ville 

	@PostMapping("/raisonAnnulations")
	public RaisonAnnulation addRaisonAnnulation(@RequestBody RaisonAnnulation theRaisonAnnulation) {

		/* theVille.setIdVille(0); */
		raisonAnnulationService.save(theRaisonAnnulation);

		return theRaisonAnnulation;
	}

	@PutMapping("/raisonAnnulations")
	public RaisonAnnulation updateRaisonAnnulation(@RequestBody RaisonAnnulation theRaisonAnnulation) {

		raisonAnnulationService.save(theRaisonAnnulation);

		return theRaisonAnnulation;
	}

// add mapping to delete an ville

	@DeleteMapping(value = "/raisonAnnulations/{idRaisonAnnulation}")
	public String deleteRaisonAnnulation(@PathVariable int idRaisonAnnulation) {

		Optional<RaisonAnnulation> theRaisonAnnulation = raisonAnnulationService.findById(idRaisonAnnulation);

		if (theRaisonAnnulation == null) {

			throw new RuntimeException(" the id of RaisonAnnulation is not found " + idRaisonAnnulation);
		}
		raisonAnnulationService.deleteById(idRaisonAnnulation);

		return " the RaisonAnnulation was deleted " + idRaisonAnnulation;

	}
}
