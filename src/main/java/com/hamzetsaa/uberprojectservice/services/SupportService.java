package com.hamzetsaa.uberprojectservice.services;

import java.util.List;
import java.util.Optional;

import com.hamzetsaa.uberprojectservice.entities.Support;

public interface SupportService {
	
	public List <Support> findAll();

	public Optional<Support> findById(int idSupport);

	public void save(Support theSupport);

	public void deleteById ( int idSupport);
}
