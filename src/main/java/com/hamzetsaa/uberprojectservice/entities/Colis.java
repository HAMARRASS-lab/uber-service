package com.hamzetsaa.uberprojectservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name="colis")
public class Colis {
	
	@Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int  idColis;
	private  String description;
	private String status;
	private String image1 ;
	private String image2;
	private String image3;
	public int getIdColis() {
		return idColis;
	}
	public void setIdColis(int idColis) {
		this.idColis = idColis;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getImage1() {
		return image1;
	}
	public void setImage1(String image1) {
		this.image1 = image1;
	}
	public String getImage2() {
		return image2;
	}
	public void setImage2(String image2) {
		this.image2 = image2;
	}
	public String getImage3() {
		return image3;
	}
	public void setImage3(String image3) {
		this.image3 = image3;
	}
	public Colis() {
		
	}
	public Colis(int idColis, String description, String status, String image1, String image2, String image3) {
		super();
		this.idColis = idColis;
		this.description = description;
		this.status = status;
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
	}
	@Override
	public String toString() {
		return "Colis [idColis=" + idColis + ", description=" + description + ", status=" + status + ", image1="
				+ image1 + ", image2=" + image2 + ", image3=" + image3 + "]";
	}

	
}
