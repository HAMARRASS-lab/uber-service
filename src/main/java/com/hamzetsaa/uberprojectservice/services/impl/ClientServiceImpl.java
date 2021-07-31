package com.hamzetsaa.uberprojectservice.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hamzetsaa.uberprojectservice.entities.Client;
import com.hamzetsaa.uberprojectservice.repositories.ClientRepository;
import com.hamzetsaa.uberprojectservice.services.ClientService;

@Service
public class ClientServiceImpl implements ClientService{

	private ClientRepository clientRepository;
	@Autowired
	public void  ClientServiceImpl(ClientRepository theClientRepository) {
		clientRepository= theClientRepository;
	}
	
	@Override
	public List<Client> findAll() {
		// TODO Auto-generated method stub
		return clientRepository.findAll();
	}

	@Override
	public Optional<Client> findById(int idClient) {
		return clientRepository.findById(idClient);
	}

	@Override
	public void save(Client theClient) {
		clientRepository.save(theClient);
		
	}

	@Override
	public void deleteById(int idClient) {
		clientRepository.deleteById(idClient);
		
	}

}
