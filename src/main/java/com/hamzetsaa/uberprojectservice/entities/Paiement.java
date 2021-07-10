package com.hamzetsaa.uberprojectservice.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="paiement")
public class Paiement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int idPaiement;
	private Double montant ;
	private Date dateTime;
	private String type;
	
	//geteres and setters
	
	public int getIdPaiement() {
		return idPaiement;
	}
	public void setIdPaiement(int idPaiement) {
		this.idPaiement = idPaiement;
	}
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	// controctors
	public Paiement() {
	}
	public Paiement(int idPaiement, Double montant, Date dateTime, String type) {
		super();
		this.idPaiement = idPaiement;
		this.montant = montant;
		this.dateTime = dateTime;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Paiement [idPaiement=" + idPaiement + ", montant=" + montant + ", dateTime=" + dateTime + ", type="
				+ type + "]";
	}
	

}
