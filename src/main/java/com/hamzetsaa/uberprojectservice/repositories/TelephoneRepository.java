package com.hamzetsaa.uberprojectservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hamzetsaa.uberprojectservice.entities.Telephone;

public interface TelephoneRepository extends JpaRepository<Telephone, Integer> {

}
