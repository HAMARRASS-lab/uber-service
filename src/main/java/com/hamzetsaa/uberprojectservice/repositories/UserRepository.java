package com.hamzetsaa.uberprojectservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hamzetsaa.uberprojectservice.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
