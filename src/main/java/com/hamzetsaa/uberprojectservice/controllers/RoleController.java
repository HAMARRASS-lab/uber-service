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
import com.hamzetsaa.uberprojectservice.entities.Role;
import com.hamzetsaa.uberprojectservice.services.RoleService;

@RestController
@RequestMapping(value="/api")
public class RoleController {

	// inject service role 
	RoleService roleService;
	@Autowired
	public RoleController(RoleService theRoleService) {
		roleService = theRoleService;
		
	}
	//create mapping  explore all Roles
	
	@GetMapping( value ="/roles")
	public List  <Role> findAll(){
			
		return roleService.findAll();
	}

	// crete mapping to expose a Role with a primary key 

	@GetMapping(value="/roles/{idRole}")
	public Optional<Role> getRole(@PathVariable int  idRole) {
		
	Optional<Role> theRole = roleService.findById(idRole);
		
		if(theRole == null) {
			
		
			throw new RuntimeException( " the id Role is not found "+ theRole);
		}
	 return theRole;
	}

	// create a mipping to save a Role 

	@PostMapping("/roles")
	public Role addRole (@RequestBody Role theRole) {
		

		roleService.save(theRole);
		
		return theRole;
	}

	@PutMapping("/roles/{idRole}")
	public Role updateRole(@RequestBody Role theRole) {
		
		roleService.save(theRole);
		
		return theRole;
	}

	// add mapping to delete an Role

	@DeleteMapping(value ="/roles/{idRole}")
	public String deleteRole( @PathVariable int idRole) {
		
		Optional<Role> theRole = roleService.findById(idRole);
		
		if (theRole == null) {
			
			throw new RuntimeException( " the id of Role is not found "+ idRole);
		}
		roleService.deleteById(idRole);
		
		return " the Role was deleted "+ idRole;
		
	}
	
}
