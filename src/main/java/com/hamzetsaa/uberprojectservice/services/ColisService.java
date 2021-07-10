package com.hamzetsaa.uberprojectservice.services;

import java.util.List;
import java.util.Optional;
import com.hamzetsaa.uberprojectservice.entities.Colis;


public interface ColisService {
	public List <Colis> findAll();
	
	public Optional <Colis> findById( int idColis);
	
	public void  save(Colis theColis);
	
	public void deleteById( int idColis);

}
