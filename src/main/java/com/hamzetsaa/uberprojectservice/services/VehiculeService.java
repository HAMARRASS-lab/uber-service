package com.hamzetsaa.uberprojectservice.services;

import com.hamzetsaa.uberprojectservice.entities.Vehicule;
import java.util.List;
import java.util.Optional;

public interface VehiculeService {
	
	public List <Vehicule> findAll();
	
	public Optional<Vehicule> findById(int idVehicule);
	
	public void save(Vehicule theVehicule);
	
	public void deleteById(int idVehicule);

}
