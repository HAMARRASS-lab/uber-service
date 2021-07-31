package com.hamzetsaa.uberprojectservice.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="parainage")

public class Parainage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idParainage;
	private	String code;
	private int client;
	private String status;
	private Date dateGenaration;
	private String mail;
	public Parainage() {
		super();
	}
	public Parainage(int idParainage, String code, int client, String status, Date dateGenaration, String mail) {
		super();
		this.idParainage = idParainage;
		this.code = code;
		this.client = client;
		this.status = status;
		this.dateGenaration = dateGenaration;
		this.mail = mail;
	}
	public Parainage(String code, int client, String status, Date dateGenaration, String mail) {
		super();
		this.code = code;
		this.client = client;
		this.status = status;
		this.dateGenaration = dateGenaration;
		this.mail = mail;
	}
	public int getIdParainage() {
		return idParainage;
	}
	public void setIdParainage(int idParainage) {
		this.idParainage = idParainage;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getClient() {
		return client;
	}
	public void setClient(int client) {
		this.client = client;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDateGenaration() {
		return dateGenaration;
	}
	public void setDateGenaration(Date dateGenaration) {
		this.dateGenaration = dateGenaration;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Override
	public String toString() {
		return "Parainage [idParainage=" + idParainage + ", code=" + code + ", client=" + client + ", status=" + status
				+ ", dateGenaration=" + dateGenaration + ", mail=" + mail + "]";
	}
	
	
}
