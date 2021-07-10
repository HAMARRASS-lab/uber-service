package com.hamzetsaa.uberprojectservice.services;

import java.util.List;
import java.util.Optional;

import com.hamzetsaa.uberprojectservice.entities.Paiement;

public interface PaiementService {

	public List <Paiement> findAll();
	
	Optional <Paiement> findById(int idPaiement);
	
	public void save (Paiement thePaiement);
	
	public void deleteById ( int idPaiement);

}
