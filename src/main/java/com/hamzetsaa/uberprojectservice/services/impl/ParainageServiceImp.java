package com.hamzetsaa.uberprojectservice.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hamzetsaa.uberprojectservice.entities.Parainage;
import com.hamzetsaa.uberprojectservice.repositories.ParainageRepository;
import com.hamzetsaa.uberprojectservice.services.ParainageService;
@Service
public class ParainageServiceImp implements ParainageService {

	
	private ParainageRepository parainageRepository;
	@Autowired
	public void  ParainageServiceImpl(ParainageRepository theParainageRepository) {
		parainageRepository= theParainageRepository;
	}
	@Override
	public List<Parainage> findAll() {
		
		return parainageRepository.findAll();
	}

	@Override
	public Optional<Parainage> findById(int idParainage) {
		// TODO Auto-generated method stub
		return parainageRepository.findById(idParainage);
	}

	@Override
	public void save(Parainage theParainage) {
		parainageRepository.save(theParainage);

	}

	@Override
	public void deleteById(int idParainage) {
		parainageRepository.deleteById(idParainage);

	}

}
