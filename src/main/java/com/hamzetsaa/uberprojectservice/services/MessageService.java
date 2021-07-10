package com.hamzetsaa.uberprojectservice.services;

import java.util.List;
import java.util.Optional;

import com.hamzetsaa.uberprojectservice.entities.Message;

public interface MessageService {
	public  List<Message> findAll();
	
	public Optional  <Message> findById(int idMessage);
	
	public void save (Message theMessage);
	
	public void deleteById(int idMessage);
	
	

}
