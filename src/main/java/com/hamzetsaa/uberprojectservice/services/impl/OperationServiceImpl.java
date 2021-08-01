package com.hamzetsaa.uberprojectservice.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hamzetsaa.uberprojectservice.entities.Operation;
import com.hamzetsaa.uberprojectservice.repositories.OperationRepository;
import com.hamzetsaa.uberprojectservice.services.OperationService;
@Service
public class OperationServiceImpl implements OperationService {

	private OperationRepository operationRepository;
	@Autowired
	public void  OperationServiceImpl(OperationRepository theOperationRepository) {
		operationRepository= theOperationRepository;
	}
	
	@Override
	public List<Operation> findAll() {
		// TODO Auto-generated method stub
		return operationRepository.findAll();
	}

	@Override
	public Optional<Operation> findById(int idOperation) {
		// TODO Auto-generated method stub
		return operationRepository.findById(idOperation);
	}

	@Override
	public void save(Operation theOperation) {
		operationRepository.save(theOperation);

	}

	@Override
	public void deleteById(int idOperation) {
		operationRepository.deleteById(idOperation);

	}

}
