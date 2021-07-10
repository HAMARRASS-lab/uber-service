package com.hamzetsaa.uberprojectservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hamzetsaa.uberprojectservice.entities.Message;

public interface MessageRepository extends JpaRepository<Message, Integer> {

}
