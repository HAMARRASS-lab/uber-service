package com.hamzetsaa.uberprojectservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hamzetsaa.uberprojectservice.entities.Chauffeur;

public interface ChauffeurRepository extends JpaRepository<Chauffeur, Integer> {

}
