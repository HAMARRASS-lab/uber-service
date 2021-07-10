package com.hamzetsaa.uberprojectservice.services.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hamzetsaa.uberprojectservice.entities.Evaluation;
import com.hamzetsaa.uberprojectservice.repositories.EvaluationRepository;
import com.hamzetsaa.uberprojectservice.services.EvaluationService;
@Service
public class EvaluationServiceImpl implements EvaluationService {
	EvaluationRepository evaluationRepository;
	
	@Autowired
	public EvaluationServiceImpl  (EvaluationRepository theEvaluationRepository) {
		evaluationRepository = theEvaluationRepository;
	}

	@Override
	public List<Evaluation> findAll() {
		return evaluationRepository.findAll();
		 
	}

	@Override
	public Optional<Evaluation> findById(int idEvaluation) {
		
		return evaluationRepository.findById(idEvaluation);
	}

	@Override
	public void save(Evaluation theEvaluation) {
		evaluationRepository.save(theEvaluation);
		
	}

	@Override
	public void deleteById(int idEvaluation) {
		
		evaluationRepository.deleteById(idEvaluation);
	}

}
