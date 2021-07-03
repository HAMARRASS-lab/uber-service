package com.hamzetsaa.uberprojectservice.services;

import java.util.List;
import java.util.Optional;

import com.hamzetsaa.uberprojectservice.entities.Ville;

public interface VilleService {

public List <Ville> findAll();

Optional <Ville> findById(int theId);

public Ville save (Ville theVille);

public void deleteById(int idVille);



}
