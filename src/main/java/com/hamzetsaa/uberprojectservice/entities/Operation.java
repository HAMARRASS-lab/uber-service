package com.hamzetsaa.uberprojectservice.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="opperation")
public class Operation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idOperation;
	private Date date ;
	private int type ;
	private double montant ;
	private int wallet;
	private String status;
	public Operation() {
		super();
	}
	public Operation(int idOperation, Date date, int type, double montant, int wallet, String status) {
		super();
		this.idOperation = idOperation;
		this.date = date;
		this.type = type;
		this.montant = montant;
		this.wallet = wallet;
		this.status = status;
	}
	public Operation(Date date, int type, double montant, int wallet, String status) {
		super();
		this.date = date;
		this.type = type;
		this.montant = montant;
		this.wallet = wallet;
		this.status = status;
	}
	public int getIdOperation() {
		return idOperation;
	}
	public void setIdOperation(int idOperation) {
		this.idOperation = idOperation;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public int getWallet() {
		return wallet;
	}
	public void setWallet(int wallet) {
		this.wallet = wallet;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Operation [idOperation=" + idOperation + ", date=" + date + ", type=" + type + ", montant=" + montant
				+ ", wallet=" + wallet + ", status=" + status + "]";
	}
	
}