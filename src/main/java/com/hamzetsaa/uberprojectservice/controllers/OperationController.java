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
import com.hamzetsaa.uberprojectservice.entities.Operation;
import com.hamzetsaa.uberprojectservice.services.OperationService;

@RestController
@RequestMapping(value = "/api")
public class OperationController {

	private OperationService operationService;

	@Autowired
	public OperationController(OperationService theOperationService) {

		operationService = theOperationService;
	}


	@GetMapping(value = "/operations")
	public List<Operation> findAll() {

		return operationService.findAll();
	}

// crete mapping to expose a ville with a primary key 

	@GetMapping(value = "/operations/{idOperation}")
	public Optional<Operation> getOperation(@PathVariable int idOperation) {

		Optional<Operation> theOperation = operationService.findById(idOperation);

		if (theOperation == null) {

			throw new RuntimeException(" the Operation is not found " + idOperation);

		}
		return theOperation;
	}

// create a mipping to save a ville 

	@PostMapping("/operations")
	public Operation addOperation(@RequestBody Operation theOperation) {

		/* theVille.setIdVille(0); */
		operationService.save(theOperation);

		return theOperation;
	}

	@PutMapping("/operations")
	public Operation updateOperation(@RequestBody Operation theOperation) {

		operationService.save(theOperation);

		return theOperation;
	}

// add mapping to delete an ville

	@DeleteMapping(value = "/operations/{idOperation}")
	public String deleteOperation(@PathVariable int idOperation) {

		Optional<Operation> theOperation = operationService.findById(idOperation);

		if (theOperation == null) {

			throw new RuntimeException(" the id of Operation is not found " + idOperation);
		}
		operationService.deleteById(idOperation);

		return " the Operation was deleted " + idOperation;

	}
}
