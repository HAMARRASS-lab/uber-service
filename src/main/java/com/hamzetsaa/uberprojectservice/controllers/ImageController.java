package com.hamzetsaa.uberprojectservice.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hamzetsaa.uberprojectservice.entities.Image;
import com.hamzetsaa.uberprojectservice.services.ImageService;

@RestController
@RequestMapping("/api")
public class ImageController {

	private ImageService imageService;

	// injection service
	
	@Autowired
	public ImageController(ImageService TheImageService) {
		imageService = TheImageService ;
	}
	
	// create mapping to expose all villes
	@GetMapping( value ="/images")
	public List <Image>findAll () {
		
		return imageService.findAll();
	}
	
	
	// crete mapping to expose a ville with a primary key 
	
	@GetMapping(value="/images/{idImage}")
	public Optional<Image> getImage(@PathVariable int  idImage) {
		
	Optional<Image> theImage = imageService.findById(idImage);
	
	if(theImage == null) {
		

		throw new RuntimeException( " the City is not found "+ idImage);

	}
	return theImage;
	}
	
	// create a mipping to save a ville 
	
	@PostMapping("/images")
	public Image addImage (@RequestBody Image theImage) {
		/* theVille.setIdVille(0); */
		imageService.save(theImage);
		return theImage;
	}

	@PutMapping("/images")
	public Image updateImage(@RequestBody Image theImage) {
		
		imageService.save(theImage);
		
		return theImage;
	}
	
	// add mapping to delete an ville
	
	@DeleteMapping(value ="/images/{idImage}")
	public String deleteImage( @PathVariable int idImage) {
		
		Optional<Image> theImage = imageService.findById(idImage);
		
		if (theImage == null) {
			
			throw new RuntimeException( " the id of ville is not found "+idImage);
		}
		imageService.deleteById(idImage);
		return " the City was deleted "+idImage;
		
	}
}
