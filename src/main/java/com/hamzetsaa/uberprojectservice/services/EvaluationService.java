package com.hamzetsaa.uberprojectservice.services;

import java.util.List;
import java.util.Optional;

import com.hamzetsaa.uberprojectservice.entities.Evaluation;

public interface EvaluationService {
	
	public List <Evaluation> findAll();
	
	public Optional <Evaluation> findById( int idEvaluation);
	
	public void  save(Evaluation theEvaluation);
	
	public void deleteById( int idEvaluation);
	
	
	

}
