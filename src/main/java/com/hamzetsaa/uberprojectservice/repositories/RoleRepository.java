package com.hamzetsaa.uberprojectservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hamzetsaa.uberprojectservice.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
