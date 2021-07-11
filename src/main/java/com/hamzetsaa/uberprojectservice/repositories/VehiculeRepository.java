package com.hamzetsaa.uberprojectservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hamzetsaa.uberprojectservice.entities.Vehicule;

public interface VehiculeRepository extends JpaRepository<Vehicule, Integer> {

}
