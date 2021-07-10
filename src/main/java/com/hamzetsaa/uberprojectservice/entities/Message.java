package com.hamzetsaa.uberprojectservice.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="message")
public class Message {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMessage;
	
	private Date dateTime;
	
	private String contenu;
	
	private String type;
	
	
	public int getIdMessage() {
		return idMessage;
	}
	public void setIdMessage(int idMessage) {
		this.idMessage = idMessage;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Message() {
	
	}
	public Message(int idMessage, Date dateTime, String contenu, String type) {
		super();
		this.idMessage = idMessage;
		this.dateTime = dateTime;
		this.contenu = contenu;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Message [idMessage=" + idMessage + ", dateTime=" + dateTime + ", contenu=" + contenu + ", type=" + type
				+ "]";
	}
	
	
}
