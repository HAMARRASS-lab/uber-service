package com.hamzetsaa.uberprojectservice.services;

import java.util.List;
import java.util.Optional;

import com.hamzetsaa.uberprojectservice.entities.Marque;

public interface MarqueService {
	
 
	public List <Marque> findAll();

	Optional <Marque> findById(int theId);

	public Marque save (Marque theMarque);

	public void deleteById(int idMarque);
}
