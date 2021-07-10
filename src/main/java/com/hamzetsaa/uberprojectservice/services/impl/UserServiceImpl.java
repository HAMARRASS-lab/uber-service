package com.hamzetsaa.uberprojectservice.services.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hamzetsaa.uberprojectservice.entities.User;
import com.hamzetsaa.uberprojectservice.repositories.UserRepository;
import com.hamzetsaa.uberprojectservice.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	// iject a repository user 
	UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl(UserRepository theUserRepository) {
		userRepository = theUserRepository;
		
	}
	@Override
	public List<User> findAll() {
	
		return userRepository.findAll();
	}

	@Override
	public Optional<User> findById(int idUser) {
		
		return userRepository.findById(idUser);
	}

	@Override
	public void save(User theUser) {
		userRepository.save(theUser);
		
	}

	@Override
	public void deleteById(int idUser) {
		
		userRepository.deleteById(idUser);
	}

}
