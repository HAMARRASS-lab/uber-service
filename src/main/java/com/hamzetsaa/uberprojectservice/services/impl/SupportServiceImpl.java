package com.hamzetsaa.uberprojectservice.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hamzetsaa.uberprojectservice.entities.Support;
import com.hamzetsaa.uberprojectservice.repositories.SupportRepository;
import com.hamzetsaa.uberprojectservice.services.SupportService;
@Service
public class SupportServiceImpl implements SupportService {

	private SupportRepository supportRepository;
	@Autowired
	public void  SupportServiceImpl(SupportRepository theSupportRepository) {
		supportRepository= theSupportRepository;
	}
	@Override
	public List<Support> findAll() {
		return supportRepository.findAll();
	}

	@Override
	public Optional<Support> findById(int idSupport) {
		// TODO Auto-generated method stub
		return supportRepository.findById(idSupport);
	}

	@Override
	public void save(Support theSupport) {
		supportRepository.save(theSupport);

	}

	@Override
	public void deleteById(int idSupport) {
		supportRepository.deleteById(idSupport);

	}

}
