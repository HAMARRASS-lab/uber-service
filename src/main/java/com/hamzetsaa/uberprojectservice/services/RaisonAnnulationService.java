package com.hamzetsaa.uberprojectservice.services;

import java.util.List;
import java.util.Optional;

import com.hamzetsaa.uberprojectservice.entities.RaisonAnnulation;

public interface RaisonAnnulationService {

	public List <RaisonAnnulation> findAll();

	public Optional<RaisonAnnulation> findById(int idRaisonAnnulation);

	public void save(RaisonAnnulation theRaisonAnnulation);

	public void deleteById ( int idRaisonAnnulation);
}
