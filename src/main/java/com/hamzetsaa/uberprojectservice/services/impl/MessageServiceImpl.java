package com.hamzetsaa.uberprojectservice.services.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hamzetsaa.uberprojectservice.entities.Message;
import com.hamzetsaa.uberprojectservice.repositories.MessageRepository;
import com.hamzetsaa.uberprojectservice.services.MessageService;
@Service
public class MessageServiceImpl implements MessageService {

	// inject message repository
	MessageRepository messageRepository; 
	
	@Autowired
	public MessageServiceImpl(MessageRepository theMessageRepository) {
		messageRepository = theMessageRepository;
	}
	@Override
	public List<Message> findAll() {
		
		return  messageRepository.findAll();
	}

	@Override
	public Optional<Message> findById(int idMessage) {
		
		return messageRepository.findById(idMessage);
	}

	@Override
	public void save(Message theMessage) {
		 messageRepository.save(theMessage);
		
	}

	@Override
	public void deleteById(int idMessage) {
		
		messageRepository.deleteById(idMessage);
	}

}
