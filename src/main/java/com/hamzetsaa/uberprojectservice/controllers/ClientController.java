package com.hamzetsaa.uberprojectservice.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hamzetsaa.uberprojectservice.entities.Chauffeur;
import com.hamzetsaa.uberprojectservice.entities.Client;
import com.hamzetsaa.uberprojectservice.services.ClientService;

@RestController
@RequestMapping(value = "/api")
public class ClientController {
	private ClientService clientService;

	@Autowired
	public ClientController(ClientService theClientService) {

		clientService = theClientService;
	}

	@GetMapping(value = "/clients")
	public List<Client> findAll() {

		return clientService.findAll();
	}
	@GetMapping(value = "/clients/{idClient}")
	public Optional<Client> getClient(@PathVariable int idClient) {

		Optional<Client> theClient = clientService.findById(idClient);

		if (theClient == null) {

			throw new RuntimeException(" the Client is not found " + idClient);

		}
		return theClient;
	}
	@PostMapping("/clients")
	public Client addClient(@RequestBody Client theClient) {

		/* theVille.setIdVille(0); */
		clientService.save(theClient);

		return theClient;
	}
	@PutMapping("/clients")
	public Client updateClient(@RequestBody Client theClient) {

		clientService.save(theClient);

		return theClient;
	}
	@DeleteMapping(value = "/clients/{idClient}")
	public String deleteClient(@PathVariable int idClient) {

		Optional<Client> theClient = clientService.findById(idClient);

		if (theClient == null) {

			throw new RuntimeException(" the id of Chauffeur is not found " + idClient);
		}
		clientService.deleteById(idClient);

		return " the Client was deleted " + idClient;

	}
}
