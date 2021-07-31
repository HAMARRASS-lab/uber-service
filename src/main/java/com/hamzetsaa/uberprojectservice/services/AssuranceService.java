package com.hamzetsaa.uberprojectservice.services;

import java.util.List;
import java.util.Optional;

import com.hamzetsaa.uberprojectservice.entities.Assurance;

public interface AssuranceService {
	public List <Assurance> findAll();

	public Optional<Assurance> findById(int idAssurance);

	public void save(Assurance theAssurance);

	public void deleteById ( int idAssurance);

}
