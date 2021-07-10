package com.hamzetsaa.uberprojectservice.services;

import java.util.List;
import java.util.Optional;

import com.hamzetsaa.uberprojectservice.entities.Requete;

public interface RequeteService {

	public List  <Requete> findAll();
	
	public Optional <Requete> findById( int idRequete);
	
	public void save ( Requete theRequete);
	
	public void deleteById(int idRequete);
}
