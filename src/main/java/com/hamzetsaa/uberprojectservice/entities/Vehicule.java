package com.hamzetsaa.uberprojectservice.entities;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="vehicule")

public class Vehicule{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int idVehicule;
	private String nom;
	private String immatriculation;
	private String carteGriseRecto;
	private String carteGriseVerso;
	private String nbPlace;
	private int typeVehicule;
	private int marque;
	private String couleur;
	private String chauffeur;
	private String status;
	
	public Vehicule(String nom, String immatriculation, String carteGriseRecto, String carteGriseVerso, String nbPlace,
			int typeVehicule, int marque, String couleur, String chauffeur, String status) {
		super();
		this.nom = nom;
		this.immatriculation = immatriculation;
		this.carteGriseRecto = carteGriseRecto;
		this.carteGriseVerso = carteGriseVerso;
		this.nbPlace = nbPlace;
		this.typeVehicule = typeVehicule;
		this.marque = marque;
		this.couleur = couleur;
		this.chauffeur = chauffeur;
		this.status = status;
	}
	
	public Vehicule(int idVehicule, String nom, String immatriculation, String carteGriseRecto, String carteGriseVerso,
			String nbPlace, int typeVehicule, int marque, String couleur, String chauffeur, String status) {
		super();
		this.idVehicule = idVehicule;
		this.nom = nom;
		this.immatriculation = immatriculation;
		this.carteGriseRecto = carteGriseRecto;
		this.carteGriseVerso = carteGriseVerso;
		this.nbPlace = nbPlace;
		this.typeVehicule = typeVehicule;
		this.marque = marque;
		this.couleur = couleur;
		this.chauffeur = chauffeur;
		this.status = status;
	}

	public Vehicule() {
		super();
	}

	public int getIdVehicule() {
		return idVehicule;
	}
	public void setIdVehicule(int idVehicule) {
		this.idVehicule = idVehicule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getImmatriculation() {
		return immatriculation;
	}
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	public String getCarteGriseRecto() {
		return carteGriseRecto;
	}
	public void setCarteGriseRecto(String carteGriseRecto) {
		this.carteGriseRecto = carteGriseRecto;
	}
	public String getCarteGriseVerso() {
		return carteGriseVerso;
	}
	public void setCarteGriseVerso(String carteGriseVerso) {
		this.carteGriseVerso = carteGriseVerso;
	}
	public String getNbPlace() {
		return nbPlace;
	}
	public void setNbPlace(String nbPlace) {
		this.nbPlace = nbPlace;
	}
	public int getTypeVehicule() {
		return typeVehicule;
	}
	public void setTypeVehicule(int typeVehicule) {
		this.typeVehicule = typeVehicule;
	}
	public int getMarque() {
		return marque;
	}
	public void setMarque(int marque) {
		this.marque = marque;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public String getChauffeur() {
		return chauffeur;
	}
	public void setChauffeur(String chauffeur) {
		this.chauffeur = chauffeur;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Vehicule [idVehicule=" + idVehicule + ", nom=" + nom + ", immatriculation=" + immatriculation
				+ ", carteGriseRecto=" + carteGriseRecto + ", carteGriseVerso=" + carteGriseVerso + ", nbPlace="
				+ nbPlace + ", typeVehicule=" + typeVehicule + ", marque=" + marque + ", couleur=" + couleur
				+ ", chauffeur=" + chauffeur + ", status=" + status + "]";
	}
	
}