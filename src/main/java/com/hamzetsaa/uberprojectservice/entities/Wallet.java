package com.hamzetsaa.uberprojectservice.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wallet")
public class Wallet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idWallet;
	private double solde;
	private Date dateCreation;
	private Date dateModification;
	public Wallet() {
		super();
	}
	public Wallet(int idWallet, double solde, Date dateCreation, Date dateModification) {
		super();
		this.idWallet = idWallet;
		this.solde = solde;
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
	}
	public Wallet(double solde, Date dateCreation, Date dateModification) {
		super();
		this.solde = solde;
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
	}
	public int getIdWallet() {
		return idWallet;
	}
	public void setIdWallet(int idWallet) {
		this.idWallet = idWallet;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Date getDateModification() {
		return dateModification;
	}
	public void setDateModification(Date dateModification) {
		this.dateModification = dateModification;
	}
	@Override
	public String toString() {
		return "Wallet [idWallet=" + idWallet + ", solde=" + solde + ", dateCreation=" + dateCreation
				+ ", dateModification=" + dateModification + "]";
	}
	
}
