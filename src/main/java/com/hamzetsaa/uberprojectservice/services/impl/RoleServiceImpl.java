package com.hamzetsaa.uberprojectservice.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hamzetsaa.uberprojectservice.entities.Role;
import com.hamzetsaa.uberprojectservice.repositories.RoleRepository;
import com.hamzetsaa.uberprojectservice.services.RoleService;
@Service
public class RoleServiceImpl implements RoleService {

	// inject reposiory role
	RoleRepository roleRepository;
	@Autowired
	public RoleServiceImpl (RoleRepository theRoleRepository) {
		
		roleRepository	= theRoleRepository;
	}
	@Override
	public List<Role> findAll() {
	
		return roleRepository.findAll();
	}

	@Override
	public Optional<Role> findById(int idRole) {
	
		return roleRepository.findById(idRole);
	}

	@Override
	public void save(Role theRole) {
		roleRepository.save(theRole);
	}

	@Override
	public void deleteById(int idRole) {
		roleRepository.deleteById(idRole);
	}

}
