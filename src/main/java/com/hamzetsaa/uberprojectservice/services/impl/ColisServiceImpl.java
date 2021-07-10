package com.hamzetsaa.uberprojectservice.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hamzetsaa.uberprojectservice.entities.Colis;
import com.hamzetsaa.uberprojectservice.repositories.ColisRepository;
import com.hamzetsaa.uberprojectservice.services.ColisService;
@Service
public class ColisServiceImpl implements ColisService {

	// inject colis repository
	 ColisRepository colisReppository;
	 @Autowired
	 public ColisServiceImpl (ColisRepository theColisReppository) {
		 colisReppository =theColisReppository;
	 }
	@Override
	public List<Colis> findAll() {
		
		return colisReppository.findAll();
	}

	@Override
	public Optional<Colis> findById(int idColis) {
		
		return colisReppository.findById(idColis)  ;
	}

	@Override
	public void save(Colis theColis) {
		colisReppository.save(theColis);
		
	}

	@Override
	public void deleteById(int idColis) {
		colisReppository.deleteById(idColis);
	}

}
