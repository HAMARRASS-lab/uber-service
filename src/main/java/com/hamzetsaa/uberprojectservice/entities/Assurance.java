package com.hamzetsaa.uberprojectservice.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="assurance")
public class Assurance {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAssurance ;
    private Date dateDebut ;
    private Date dateFin;
    private String image;
    private int vehicule ;
	public Assurance(int idAssurance, Date dateDebut, Date dateFin, String image, int vehicule) {
		super();
		this.idAssurance = idAssurance;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.image = image;
		this.vehicule = vehicule;
	}
	public Assurance(Date dateDebut, Date dateFin, String image, int vehicule) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.image = image;
		this.vehicule = vehicule;
	}
	public Assurance() {
		super();
	}
	public int getIdAssurance() {
		return idAssurance;
	}
	public void setIdAssurance(int idAssurance) {
		this.idAssurance = idAssurance;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getVehicule() {
		return vehicule;
	}
	public void setVehicule(int vehicule) {
		this.vehicule = vehicule;
	}
	@Override
	public String toString() {
		return "Assurance [idAssurance=" + idAssurance + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin
				+ ", image=" + image + ", vehicule=" + vehicule + "]";
	}
    
    
}
