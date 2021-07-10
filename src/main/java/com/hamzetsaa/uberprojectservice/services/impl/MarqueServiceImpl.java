package com.hamzetsaa.uberprojectservice.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hamzetsaa.uberprojectservice.entities.Marque;
import com.hamzetsaa.uberprojectservice.repositories.MarqueRepository;
import com.hamzetsaa.uberprojectservice.services.MarqueService;

@Service
public class MarqueServiceImpl implements MarqueService{

	// injection image repository
			 private MarqueRepository marqueRepository;
			 
			 @Autowired
			 public  MarqueServiceImpl (MarqueRepository theMarqueRepository) {
				 marqueRepository= theMarqueRepository ;
			 }
			
			@Override
			public List<Marque> findAll() {
			
				return marqueRepository.findAll();
			}

			@Override
			public Optional<Marque> findById(int theId) {
				
				return marqueRepository.findById(theId);
			}

			@Override
			public Marque save(Marque theMarque) {
				
				return marqueRepository.save(theMarque);
			}

			@Override
			public void deleteById(int idMarque) {
				marqueRepository.deleteById(idMarque);
				
			}
	
}
