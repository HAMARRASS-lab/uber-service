package com.hamzetsaa.uberprojectservice.services;

import java.util.List;
import java.util.Optional;

import com.hamzetsaa.uberprojectservice.entities.Client;

public interface ClientService {

	public List <Client> findAll();

	public Optional<Client> findById(int idClient);

	public void save(Client theClient);

	public void deleteById ( int idClient);
}
