package com.hamzetsaa.uberprojectservice.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hamzetsaa.uberprojectservice.entities.Vehicule;
import com.hamzetsaa.uberprojectservice.repositories.VehiculeRepository;
import com.hamzetsaa.uberprojectservice.services.VehiculeService;

@Service
public class VehiculeServiceImpl implements VehiculeService {

	private final VehiculeRepository vehiculeRepository;

	@Autowired
	public VehiculeServiceImpl(VehiculeRepository theVehiculeRepository) {
		vehiculeRepository = theVehiculeRepository;
	}

	@Override
	public List<Vehicule> findAll() {
		return vehiculeRepository.findAll();
	}

	@Override
	public Optional<Vehicule> findById(int idVehicule) {
		return vehiculeRepository.findById(idVehicule);
	}

	@Override
	public void save(Vehicule theVehicule) {
		 vehiculeRepository.save(theVehicule);
	}

	@Override
	public void deleteById(int idVehicule) {
		vehiculeRepository.deleteById(idVehicule);
	}

}
