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
import com.hamzetsaa.uberprojectservice.entities.User;
import com.hamzetsaa.uberprojectservice.services.UserService;

@RestController
@RequestMapping(value="/api")
public class UserController {
	// inject a service user 
	UserService userService;
	
	@Autowired
	public UserController (UserService theUserService) {
		
		userService = theUserService;
	}
	
	//create mapping  explore all Users
	
	@GetMapping( value ="/users")
	public List  <User> findAll(){
			
		return userService.findAll();
	}

	// crete mapping to expose a User with a primary key 

	@GetMapping(value="/users/{idUser}")
	public Optional<User> getUser(@PathVariable int  idUser) {
		
	Optional<User> theUser = userService.findById(idUser);
		
		if(theUser == null) {
			
		
			throw new RuntimeException( " the id User is not found "+ theUser);
		}
	 return theUser;
	}

	// create a mipping to save a User 

	@PostMapping("/users")
	public User addUser (@RequestBody User theUser) {
		

		userService.save(theUser);
		
		return theUser;
	}

	@PutMapping("/users/{idUser}")
	public User updateUser(@RequestBody User theUser) {
		
		userService.save(theUser);
		
		return theUser;
	}

	// add mapping to delete an User

	@DeleteMapping(value ="/users/{idUser}")
	public String deleteUser( @PathVariable int idUser) {
		
		Optional<User> theUser = userService.findById(idUser);
		
		if (theUser == null) {
			
			throw new RuntimeException( " the id of User is not found "+ idUser);
		}
		userService.deleteById(idUser);
		
		return " the User was deleted "+ idUser;
		

    }
	}
