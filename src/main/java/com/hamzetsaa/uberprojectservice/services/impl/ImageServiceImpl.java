package com.hamzetsaa.uberprojectservice.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hamzetsaa.uberprojectservice.entities.Image;
import com.hamzetsaa.uberprojectservice.repositories.ImageRepository;
import com.hamzetsaa.uberprojectservice.services.ImageService;

@Service
public class ImageServiceImpl implements ImageService  {
   
	// injection image repository
		 private ImageRepository imageRepository;
		 @Autowired
		 public  ImageServiceImpl ( ImageRepository theImageRepository) {
			 imageRepository= theImageRepository ;
		 }
		
		@Override
		public List<Image> findAll() {
		
			return imageRepository.findAll();
		}

		@Override
		public Optional<Image> findById(int theId) {
			
			return imageRepository.findById(theId);
		}

		@Override
		public Image save(Image theImage) {
			
			return imageRepository.save(theImage);
		}

		@Override
		public void deleteById(int idImage) {
			imageRepository.deleteById(idImage);
			
		}
}
