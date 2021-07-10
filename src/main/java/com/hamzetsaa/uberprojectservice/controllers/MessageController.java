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
import com.hamzetsaa.uberprojectservice.entities.Message;
import com.hamzetsaa.uberprojectservice.services.MessageService;

@RestController
@RequestMapping(value="/api")
public class MessageController {
	// inject message service
	
	MessageService messageService;
	@Autowired
	public MessageController(MessageService theMessageService) {
		messageService = theMessageService;
	}

	// create a mapping to get all messages 
	
	@GetMapping(value ="/messages")
	public List <Message> findAll(){
		return messageService.findAll();
	}
	
	// create a mapping to get  a  message  with primary key
	@GetMapping(value="/messages/{idMessage}")
	public Optional <Message> getMessage(@PathVariable int idMessage){
		Optional <Message>  theMessage = messageService.findById(idMessage);
		if ( theMessage == null) {
			throw new RuntimeException(" the id of message is not found " + idMessage);
		}
		
		return messageService.findById(idMessage);
	}
	
	// create a mapping to save a message
	@PostMapping( value ="/messages")
	public Message addMessage (@RequestBody Message theMessage) {
	 messageService.save(theMessage);
		return theMessage;
	}
	
	// create a mapping to update an existing message
	@PutMapping(value="/messages/{idMessage}")
	public  Message updateMessage(@RequestBody Message theMessage) {
		
		 messageService.save(theMessage);
		return theMessage;
	}
			
	// create a mapping to delete a existing message
	@DeleteMapping(value="/messages/{idMessage}")
	public String deleteMessage (@PathVariable int idMessage){
		
		Optional <Message>  theMessage = messageService.findById(idMessage);
		if ( theMessage == null) {
			throw new RuntimeException(" the id of message is not found " + idMessage);
		}
		messageService.deleteById(idMessage);
		
		return "the message was deleted " + idMessage;

}
}
