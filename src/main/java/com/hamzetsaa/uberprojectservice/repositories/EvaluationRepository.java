package com.hamzetsaa.uberprojectservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hamzetsaa.uberprojectservice.entities.Evaluation;

public interface EvaluationRepository extends JpaRepository<Evaluation, Integer> {

}
