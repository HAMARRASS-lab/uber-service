package com.hamzetsaa.uberprojectservice.services;

import java.util.List;
import java.util.Optional;
import com.hamzetsaa.uberprojectservice.entities.Role;

public interface RoleService {
	public List <Role> findAll();

	public Optional<Role> findById(int idRole);

	public void save(Role theRole);

	public void deleteById ( int idRole);
}
