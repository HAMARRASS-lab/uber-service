package com.hamzetsaa.uberprojectservice.entities;
import java.awt.Image;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "permis")
public class Permis {
	
	
	// create fildes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPermis;
	private Date dateDebut;
	private Date dateFin;
	//private Image imageRecto;
	//private Image imageVerso;
	
	@ManyToOne(fetch = FetchType.EAGER)
	/* private Chauffeur idChauffeur; */
	@JoinColumn(name="idChauffeur")
	private Chauffeur Chauffeur;
	
	
	public int getIdPermis() {
		return idPermis;
	}
	public void setIdPermis(int idPermis) {
		this.idPermis = idPermis;
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
	public Chauffeur getChauffeur() {
		return Chauffeur;
	}
	public void setChauffeur(Chauffeur chauffeur) {
		Chauffeur = chauffeur;
	}
	// cpnstroctor
	public Permis() {
		super();
	}
	
	public Permis(int idPermis, Date dateDebut, Date dateFin, Image imageRecto, Image imageVerso) {
		super();
		this.idPermis = idPermis;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;	
	}
	public Permis(int idPermis, Date dateDebut, Date dateFin,
			com.hamzetsaa.uberprojectservice.entities.Chauffeur chauffeur) {
		super();
		this.idPermis = idPermis;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		Chauffeur = chauffeur;
	}
	public Permis(int idPermis, Date dateDebut, Date dateFin) {
		super();
		this.idPermis = idPermis;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	@Override
	public String toString() {
		return "Permis [idPermis=" + idPermis + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", Chauffeur="
				+ Chauffeur + "]";
	}

	
}
