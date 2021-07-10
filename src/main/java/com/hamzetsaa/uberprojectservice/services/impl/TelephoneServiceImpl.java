package com.hamzetsaa.uberprojectservice.services.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hamzetsaa.uberprojectservice.entities.Telephone;
import com.hamzetsaa.uberprojectservice.repositories.TelephoneRepository;
import com.hamzetsaa.uberprojectservice.services.TelephoneService;

 @Service
public class TelephoneServiceImpl implements TelephoneService {

	// inject telephone repository
	 TelephoneRepository  telephoneRepository;
	 
	 @Autowired
	 public TelephoneServiceImpl( TelephoneRepository  theTelephoneRepository) {
		 telephoneRepository = theTelephoneRepository;
	 }
	 
	@Override
	public List<Telephone> findAll() {
	
		return telephoneRepository.findAll();
	}

	@Override
	public Optional<Telephone> findById(int idTelephone) {
		
		return telephoneRepository.findById(idTelephone);
	}

	@Override
	public void save(Telephone theTelephone) {
		telephoneRepository.save(theTelephone);
	}

	@Override
	public void deleteById(int idTelephone) {
		telephoneRepository.deleteById(idTelephone);
	}

}
