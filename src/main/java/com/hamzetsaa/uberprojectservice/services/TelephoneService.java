package com.hamzetsaa.uberprojectservice.services;

import java.util.List;
import java.util.Optional;
import com.hamzetsaa.uberprojectservice.entities.Telephone;

public interface TelephoneService {

public List <Telephone> findAll();
	
	Optional <Telephone> findById(int idTelephone);
	
	public void save (Telephone theTelephone);
	
	public void deleteById ( int idTelephone);
}
