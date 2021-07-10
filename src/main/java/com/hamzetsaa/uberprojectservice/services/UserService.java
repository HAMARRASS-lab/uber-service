package com.hamzetsaa.uberprojectservice.services;

import java.util.List;
import java.util.Optional;
import com.hamzetsaa.uberprojectservice.entities.User;

public interface UserService {


	public List  <User> findAll();
	
	public Optional <User> findById( int idUser);
	
	public void save ( User theUser);
	
	public void deleteById(int idUser);
}
