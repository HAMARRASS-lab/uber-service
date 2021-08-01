package com.hamzetsaa.uberprojectservice.services;

import java.util.List;
import java.util.Optional;

import com.hamzetsaa.uberprojectservice.entities.TypeOperation;

public interface TypeOperationService {

	public List <TypeOperation> findAll();

	public Optional<TypeOperation> findById(int idTypeOperation);

	public void save(TypeOperation theTypeOperation);

	public void deleteById ( int idTypeOperation);
}
