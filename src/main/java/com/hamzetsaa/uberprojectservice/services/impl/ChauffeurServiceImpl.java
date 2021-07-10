package com.hamzetsaa.uberprojectservice.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hamzetsaa.uberprojectservice.entities.Chauffeur;
import com.hamzetsaa.uberprojectservice.repositories.ChauffeurRepository;
import com.hamzetsaa.uberprojectservice.services.ChauffeurService;
@Service
public class ChauffeurServiceImpl implements ChauffeurService {

	private ChauffeurRepository chauffeurRepository;
	@Autowired
	public ChauffeurServiceImpl(ChauffeurRepository theChauffeurRepository) {
		chauffeurRepository= theChauffeurRepository;
	}
	
	@Override
	public List<Chauffeur> findAll() {
		return chauffeurRepository.findAll();
			}

	@Override
	public Optional<Chauffeur> findById(int idChauffeur) {
		return chauffeurRepository.findById(idChauffeur);
		
	}

	@Override
	public void save(Chauffeur theChauffeur) {
		chauffeurRepository.save(theChauffeur);
		
	}

	@Override
	public void deleteById(int idChauffeur) {
		chauffeurRepository.deleteById(idChauffeur);
	}

}
