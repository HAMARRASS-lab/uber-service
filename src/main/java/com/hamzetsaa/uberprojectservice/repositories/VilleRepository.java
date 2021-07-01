package com.hamzetsaa.uberprojectservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hamzetsaa.uberprojectservice.entities.Ville;

public interface VilleRepository extends JpaRepository<Ville, Integer> {

}
