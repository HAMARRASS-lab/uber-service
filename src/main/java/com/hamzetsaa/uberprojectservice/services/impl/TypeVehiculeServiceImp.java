package com.hamzetsaa.uberprojectservice.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hamzetsaa.uberprojectservice.entities.TypeVehicule;
import com.hamzetsaa.uberprojectservice.repositories.TypeVehiculeRepository;
import com.hamzetsaa.uberprojectservice.services.TypeVehiculeService;
@Service
public class TypeVehiculeServiceImp implements TypeVehiculeService {

	
	private TypeVehiculeRepository typeVehiculeRepository;
	
	@Autowired
	public void TypeVehiculeServiceImpl(TypeVehiculeRepository theTypeVehiculeRepository) {
		typeVehiculeRepository= theTypeVehiculeRepository;
	}
	
	@Override
	public List<TypeVehicule> findAll() {
		return typeVehiculeRepository.findAll();
	}

	@Override
	public Optional<TypeVehicule> findById(int idTypeVehicule) {
		return typeVehiculeRepository.findById(idTypeVehicule);
	}

	@Override
	public void save(TypeVehicule theTypeVehicule) {
		typeVehiculeRepository.save(theTypeVehicule);

	}

	@Override
	public void deleteById(int idTypeVehicule) {
		typeVehiculeRepository.deleteById(idTypeVehicule);

	}

}
