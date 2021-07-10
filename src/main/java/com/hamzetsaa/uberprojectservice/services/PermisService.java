package com.hamzetsaa.uberprojectservice.services;
import java.util.List;
import java.util.Optional;
import com.hamzetsaa.uberprojectservice.entities.Permis;

public interface PermisService {
	
public List <Permis> findAll();

public Optional<Permis> findById(int idPermis);

public void save(Permis thePermis);

public void deleteById ( int idPermis);
}
