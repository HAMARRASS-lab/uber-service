package com.hamzetsaa.uberprojectservice.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hamzetsaa.uberprojectservice.entities.Paiement;
import com.hamzetsaa.uberprojectservice.repositories.PaiementRepository;
import com.hamzetsaa.uberprojectservice.services.PaiementService;
@Service
public class PaiementServiceImpl implements PaiementService {
	
	// inject paiement repository
	
	PaiementRepository paiementRepository;
	
	@Autowired
	public PaiementServiceImpl (PaiementRepository thePaiementRepository ) {
		paiementRepository = thePaiementRepository;
	}
	
	@Override
	public List<Paiement> findAll() {
		
		return  paiementRepository.findAll();
	}

	@Override
	public Optional<Paiement> findById(int idPaiement) {

		return paiementRepository.findById(idPaiement) ;
	}

	@Override
	public void save(Paiement thePaiement) {
		paiementRepository.save(thePaiement);
		
	}

	@Override
	public void  deleteById(int idPaiement) {
		paiementRepository.deleteById(idPaiement);
		
	}

}
