package com.hamzetsaa.uberprojectservice.services.impl;
import com.hamzetsaa.uberprojectservice.services.PermisService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hamzetsaa.uberprojectservice.entities.Permis;
import com.hamzetsaa.uberprojectservice.repositories.PermisRepository;
@Service
public class PermisServiceImpl implements PermisService {

	private  PermisRepository permisRepository;
	
	@Autowired
	public  void PermisRepository (PermisRepository thePermisRepository) {
		permisRepository = thePermisRepository;
	}
	
	@Override
	public List<Permis> findAll() {
		return permisRepository.findAll();
		 
	}

	@Override
	public Optional<Permis> findById(int idPermis) {
		return permisRepository.findById(idPermis);
		
	}

	@Override
	public void save(Permis thePermis) {
		permisRepository.save(thePermis);
		
	}

	@Override
	public void deleteById(int idPermis) {
		permisRepository.deleteById(idPermis);
	}

}
