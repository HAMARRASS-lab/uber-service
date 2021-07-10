package com.hamzetsaa.uberprojectservice.services;

import java.util.List;
import java.util.Optional;

import com.hamzetsaa.uberprojectservice.entities.Image;

public interface ImageService {

	public List <Image> findAll();

	Optional <Image> findById(int theId);

	public Image save (Image theImage);

	public void deleteById(int idImage);
	
	
}
