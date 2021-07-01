package com.hamzetsaa.uberprojectservice.services.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.hamzetsaa.uberprojectservice.entities.Ville;
import com.hamzetsaa.uberprojectservice.repositories.VilleRepository;
import com.hamzetsaa.uberprojectservice.services.VilleService;


@Service
public class VilleServiceImpl implements VilleService {
	
	// injection ville repository
	 private VilleRepository villeRepository;
	 @Autowired
	 public  VilleServiceImpl ( VilleRepository theVilleRepository) {
		 villeRepository= theVilleRepository ;
	 }
	
	@Override
	public List<Ville> findAll() {
	
		return villeRepository.findAll();
	}

	@Override
	public Optional<Ville> findById(int theId) {
		
		return villeRepository.findById(theId);
	}

	@Override
	public Ville save(Ville theVille) {
		
		return villeRepository.save(theVille);
	}

	@Override
	public void deleteById(int idVille) {
		villeRepository.deleteById(idVille);
		
	}

}
