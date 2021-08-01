package com.hamzetsaa.uberprojectservice.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hamzetsaa.uberprojectservice.entities.TypeOperation;
import com.hamzetsaa.uberprojectservice.repositories.TypeOperationRepository;
import com.hamzetsaa.uberprojectservice.services.TypeOperationService;
@Service
public class TypeOperationServiceImpl implements TypeOperationService {

	
	private TypeOperationRepository typeOperationRepository;
	@Autowired
	public void  TypeOperationServiceImpl(TypeOperationRepository theTypeOperationRepository) {
		typeOperationRepository= theTypeOperationRepository;
	}
	@Override
	public List<TypeOperation> findAll() {
		return typeOperationRepository.findAll();
	}

	@Override
	public Optional<TypeOperation> findById(int idTypeOperation) {
		return typeOperationRepository.findById(idTypeOperation);
	}

	@Override
	public void save(TypeOperation theTypeOperation) {
		typeOperationRepository.save(theTypeOperation);

	}

	@Override
	public void deleteById(int idTypeOperation) {
		typeOperationRepository.deleteById(idTypeOperation);

	}

}
