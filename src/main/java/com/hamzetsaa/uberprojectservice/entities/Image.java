
  package com.hamzetsaa.uberprojectservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="image")
public class Image {
  
	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  private int idImage;
	  private String vehicule;
	  private String url ;
	    
	public Image(int idImage, String vehicule, String url) {
		super();
		this.idImage = idImage;
		this.vehicule = vehicule;
		this.url = url;
	}
	
	public Image(String vehicule, String url) {
		super();
		this.vehicule = vehicule;
		this.url = url;
	}

	
	public Image() {
		super();
	}

	public int getIdImage() {
		return idImage;
	}
	public void setIdImage(int idImage) {
		this.idImage = idImage;
	}
	public String getVehicule() {
		return vehicule;
	}
	public void setVehicule(String vehicule) {
		this.vehicule = vehicule;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Image [idImage=" + idImage + ", vehicule=" + vehicule + ", url=" + url + "]";
	}
	  
	 
  }
 