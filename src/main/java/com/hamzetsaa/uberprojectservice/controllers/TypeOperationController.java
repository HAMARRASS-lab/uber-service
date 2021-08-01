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

import com.hamzetsaa.uberprojectservice.entities.TypeOperation;
import com.hamzetsaa.uberprojectservice.services.TypeOperationService;

@RestController
@RequestMapping(value = "/api")
public class TypeOperationController {
	// injection service object

		private TypeOperationService typeOperationService;

		@Autowired
		public TypeOperationController(TypeOperationService theTypeOperationService) {

			typeOperationService = theTypeOperationService;
		}

	//create mapping  explotre all chauffeur

		@GetMapping(value = "/typeOperations")
		public List<TypeOperation> findAll() {

			return typeOperationService.findAll();
		}

	// crete mapping to expose a ville with a primary key 

		@GetMapping(value = "/typeOperations/{idTypeOperation}")
		public Optional<TypeOperation> getTypeOperation(@PathVariable int idTypeOperation) {

			Optional<TypeOperation> theTypeOperation = typeOperationService.findById(idTypeOperation);

			if (theTypeOperation == null) {

				throw new RuntimeException(" the TypeOperation is not found " + idTypeOperation);

			}
			return theTypeOperation;
		}

	// create a mipping to save a ville 

		@PostMapping("/typeOperations")
		public TypeOperation addTypeOperation(@RequestBody TypeOperation theTypeOperation) {

			/* theVille.setIdVille(0); */
			typeOperationService.save(theTypeOperation);

			return theTypeOperation;
		}

		@PutMapping("/typeOperations")
		public TypeOperation updateTypeOperation(@RequestBody TypeOperation theTypeOperation) {

			typeOperationService.save(theTypeOperation);

			return theTypeOperation;
		}

	// add mapping to delete an ville

		@DeleteMapping(value = "/typeOperations/{idTypeOperation}")
		public String deleteTypeOperation(@PathVariable int idTypeOperation) {

			Optional<TypeOperation> theTypeOperation = typeOperationService.findById(idTypeOperation);

			if (theTypeOperation == null) {

				throw new RuntimeException(" the id of Chauffeur is not found " + idTypeOperation);
			}
			typeOperationService.deleteById(idTypeOperation);

			return " the TypeOperation was deleted " + idTypeOperation;

		}
}
