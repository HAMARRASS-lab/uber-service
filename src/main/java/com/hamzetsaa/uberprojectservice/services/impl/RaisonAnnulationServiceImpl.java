package com.hamzetsaa.uberprojectservice.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hamzetsaa.uberprojectservice.entities.RaisonAnnulation;
import com.hamzetsaa.uberprojectservice.repositories.RaisonAnnulationRepository;
import com.hamzetsaa.uberprojectservice.services.RaisonAnnulationService;
@Service
public class RaisonAnnulationServiceImpl implements RaisonAnnulationService {

	
	private RaisonAnnulationRepository raisonAnnulationRepository;
	@Autowired
	public void  RaisonAnnulationServiceImpl(RaisonAnnulationRepository theRaisonAnnulationRepository) {
		raisonAnnulationRepository= theRaisonAnnulationRepository;
	}
	@Override
	public List<RaisonAnnulation> findAll() {
		// TODO Auto-generated method stub
		return raisonAnnulationRepository.findAll();
	}

	@Override
	public Optional<RaisonAnnulation> findById(int idRaisonAnnulation) {
		// TODO Auto-generated method stub
		return raisonAnnulationRepository.findById(idRaisonAnnulation);
	}

	@Override
	public void save(RaisonAnnulation theRaisonAnnulation) {
		raisonAnnulationRepository.save(theRaisonAnnulation);

	}

	@Override
	public void deleteById(int idRaisonAnnulation) {
		raisonAnnulationRepository.deleteById(idRaisonAnnulation);

	}

}
