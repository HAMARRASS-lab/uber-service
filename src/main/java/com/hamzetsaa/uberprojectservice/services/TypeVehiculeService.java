package com.hamzetsaa.uberprojectservice.services;

import java.util.List;
import java.util.Optional;

import com.hamzetsaa.uberprojectservice.entities.TypeVehicule;

public interface TypeVehiculeService {
	
	public List<TypeVehicule> findAll();
	
	public Optional<TypeVehicule> findById(int idTypeVehicule);
    
	public void save(TypeVehicule theTypeVehicule);
    
	public void deleteById(int idTypeVehicule);
}
