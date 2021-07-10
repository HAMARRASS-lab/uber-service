package com.hamzetsaa.uberprojectservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="telephone")
public class Telephone {
	@Id
	 @GeneratedValue (strategy = GenerationType.IDENTITY)
	private int idTelephone; 
	private String numTelephone; 
	private String imei; 
	private String marque; 
	private  String status;
	public int getIdTelephone() {
		return idTelephone;
	}
	public void setIdTelephone(int idTelephone) {
		this.idTelephone = idTelephone;
	}
	public String getNumTelephone() {
		return numTelephone;
	}
	public void setNumTelephone(String numTelephone) {
		this.numTelephone = numTelephone;
	}
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Telephone() {
		
	}
	public Telephone(int idTelephone, String numTelephone, String imei, String marque, String status) {
		super();
		this.idTelephone = idTelephone;
		this.numTelephone = numTelephone;
		this.imei = imei;
		this.marque = marque;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Telephone [idTelephone=" + idTelephone + ", numTelephone=" + numTelephone + ", imei=" + imei
				+ ", marque=" + marque + ", status=" + status + "]";
	} 
	

	
}
