package com.hamzetsaa.uberprojectservice.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hamzetsaa.uberprojectservice.entities.Assurance;
import com.hamzetsaa.uberprojectservice.repositories.AssuranceRepository;
import com.hamzetsaa.uberprojectservice.repositories.ChauffeurRepository;
import com.hamzetsaa.uberprojectservice.services.AssuranceService;

@Service
public class AssuranceServiceImpl implements AssuranceService {

	private AssuranceRepository assuranceRepository;
	
	@Autowired
	public void  AssuranceServiceImpl( AssuranceRepository theAssuranceRepository) {
		 assuranceRepository= theAssuranceRepository;
	}
	
	@Override
	public List<Assurance> findAll() {
		// TODO Auto-generated method stub
		return assuranceRepository.findAll();
	}

	@Override
	public Optional<Assurance> findById(int idAssurance) {
		// TODO Auto-generated method stub
		return assuranceRepository.findById(idAssurance);
	}

	@Override
	public void save(Assurance theAssurance) {
		assuranceRepository.save(theAssurance);

		
	}

	@Override
	public void deleteById(int idAssurance) {
		assuranceRepository.deleteById(idAssurance);
		
	}

}
