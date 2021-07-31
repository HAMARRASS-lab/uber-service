package com.hamzetsaa.uberprojectservice.services;

import java.util.List;
import java.util.Optional;

import com.hamzetsaa.uberprojectservice.entities.Parainage;

public interface ParainageService {
	
	public List <Parainage> findAll();

	public Optional<Parainage> findById(int idParainage);

	public void save(Parainage theParainage);

	public void deleteById ( int idParainage);

}
