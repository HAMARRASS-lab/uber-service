package com.hamzetsaa.uberprojectservice.services;

import java.util.List;
import java.util.Optional;

import com.hamzetsaa.uberprojectservice.entities.Operation;

public interface  OperationService {

	public List <Operation> findAll();

	public Optional<Operation> findById(int idOperation);

	public void save(Operation theOperation);

	public void deleteById ( int idOperation);
}
