package com.hamzetsaa.uberprojectservice.services;

import java.util.List;
import java.util.Optional;

import com.hamzetsaa.uberprojectservice.entities.Chauffeur;

public interface ChauffeurService {
	
	public List <Chauffeur> findAll();

	public Optional<Chauffeur> findById(int idChauffeur);

	public void save(Chauffeur theChauffeur);

	public void deleteById ( int idChauffeur);
}
