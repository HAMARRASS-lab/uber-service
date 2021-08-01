package com.hamzetsaa.uberprojectservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hamzetsaa.uberprojectservice.entities.Operation;

public interface OperationRepository extends JpaRepository<Operation, Integer>{

}
