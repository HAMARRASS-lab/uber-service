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
import com.hamzetsaa.uberprojectservice.entities.Evaluation;
import com.hamzetsaa.uberprojectservice.services.EvaluationService;

@RestController
@RequestMapping(value="/api")
public class EvaluationController {

	EvaluationService evaluationService;
	@Autowired
	public  EvaluationController(EvaluationService theEvaluationService) {
		evaluationService	= theEvaluationService;
	}
	
	// create a mapping to explore all evaluations
	@GetMapping(value = "/evaluations")
	public  List <Evaluation> findAll(){
		
		return evaluationService.findAll();
		
		
	}
	
	// create a mapping to get a evaluation with a primary key 
	@GetMapping(value="/evaluations/{idEvaluation}")
	public Optional <Evaluation> getEvaluation(@PathVariable int idEvaluation){
		Optional <Evaluation> theEvaluation = evaluationService.findById(idEvaluation);
		
		if ( theEvaluation== null ) {
			throw new RuntimeException( " the Evaluation  is not found "+ idEvaluation);
		}
		return theEvaluation;
	}
		//create a mapping to save a evaluation
		@PostMapping(value="/evaluations")
		public Evaluation addEvaluation( @RequestBody Evaluation theEvaluation) {
			evaluationService.save(theEvaluation);
			return theEvaluation;
		}
		
		// create a mapping to update an exsiting evaluation with primary key 
		@PutMapping(value="/evaluations/{idEvaluation}")
		public Evaluation updateEvaluation(@RequestBody Evaluation theEvaluation){
			 evaluationService.save(theEvaluation);
			 return theEvaluation ;
			
		}
		 
		// create a mapping to delete an exsiting evaluation with primary key 
		
		@DeleteMapping(value="/evaluations/{idEvaluation}")
		public String deleteEvaluation(@PathVariable int idEvaluation){
			Optional <Evaluation> theEvaluation = evaluationService.findById(idEvaluation);
			
			if ( theEvaluation== null ) {
				throw new RuntimeException( " the Evaluation  is not found "+ idEvaluation);
			}
			evaluationService.deleteById(idEvaluation);
			return "the evaluation was deleted "+ idEvaluation;
		}
	}



