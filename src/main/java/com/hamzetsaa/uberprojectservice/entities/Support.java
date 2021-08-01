package com.hamzetsaa.uberprojectservice.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="support")
public class Support {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSupport;
	private Date date; 
	private int user;
	private String contenu;
	public Support(int idSupport, Date date, int user, String contenu) {
		super();
		this.idSupport = idSupport;
		this.date = date;
		this.user = user;
		this.contenu = contenu;
	}
	public Support(Date date, int user, String contenu) {
		super();
		this.date = date;
		this.user = user;
		this.contenu = contenu;
	}
	public Support() {
		super();
	}
	public int getIdSupport() {
		return idSupport;
	}
	public void setIdSupport(int idSupport) {
		this.idSupport = idSupport;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getUser() {
		return user;
	}
	public void setUser(int user) {
		this.user = user;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	@Override
	public String toString() {
		return "Support [idSupport=" + idSupport + ", date=" + date + ", user=" + user + ", contenu=" + contenu + "]";
	}
	
}
