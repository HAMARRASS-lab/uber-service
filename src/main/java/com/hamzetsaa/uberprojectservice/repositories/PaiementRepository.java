package com.hamzetsaa.uberprojectservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hamzetsaa.uberprojectservice.entities.Paiement;

public interface PaiementRepository extends JpaRepository<Paiement, Integer> {

}
