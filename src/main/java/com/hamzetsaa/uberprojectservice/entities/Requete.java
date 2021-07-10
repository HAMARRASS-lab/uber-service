package com.hamzetsaa.uberprojectservice.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="requete")
public class Requete {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRequete;
	private Date dateCreation ;
	private String discription;
	private String status ;
	private Date dateModification;
	private  String type;
	public int getIdRequete() {
		return idRequete;
	}
	public void setIdRequete(int idRequete) {
		this.idRequete = idRequete;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDateModification() {
		return dateModification;
	}
	public void setDateModification(Date dateModification) {
		this.dateModification = dateModification;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Requete() {
		
	}
	public Requete(int idRequete, Date dateCreation, String discription, String status, Date dateModification,
			String type) {
		super();
		this.idRequete = idRequete;
		this.dateCreation = dateCreation;
		this.discription = discription;
		this.status = status;
		this.dateModification = dateModification;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Requete [idRequete=" + idRequete + ", dateCreation=" + dateCreation + ", discription=" + discription
				+ ", status=" + status + ", dateModification=" + dateModification + ", type=" + type + "]";
	}
	
	
	
}
