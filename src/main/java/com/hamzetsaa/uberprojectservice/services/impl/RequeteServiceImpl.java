package com.hamzetsaa.uberprojectservice.services.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hamzetsaa.uberprojectservice.entities.Requete;
import com.hamzetsaa.uberprojectservice.repositories.RequeteRepository;
import com.hamzetsaa.uberprojectservice.services.RequeteService;
@Service
public class RequeteServiceImpl implements RequeteService {

	// inject requete repository 
	
	RequeteRepository requeteRepository;
	@Autowired
	public RequeteServiceImpl (RequeteRepository theRequeteRepository) {
		requeteRepository = theRequeteRepository;
	}
	@Override
	public List<Requete> findAll() {
		
		return requeteRepository.findAll();
	}

	@Override
	public Optional<Requete> findById(int idRequete) {
	
		return requeteRepository.findById(idRequete);
	}

	@Override
	public void save(Requete theRequete) {
		requeteRepository.save(theRequete);
	}

	@Override
	public void deleteById(int idRequete) {
		requeteRepository.deleteById(idRequete);
	}

}
