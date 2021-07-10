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
@Table(name="chauffeur")

public class Chauffeur {
	
	// create fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idChauffeur;
	
	private String nom;
	private String prenom;
	private String email;
	private String cin;
	private String status;
	private Double evaluation;
	private int  numeroChauffeur;
	
	 @OneToMany(mappedBy = "Chauffeur",fetch = FetchType.EAGER)
	 private Collection <Permis> permis;
	
	// generate getters and setters
	public int getIdChauffeur() {
		return idChauffeur;
	}
	public void setIdChauffeur(int idChauffeur) {
		this.idChauffeur = idChauffeur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getEvaluation() {
		return evaluation;
	}
	public void setEvaluation(Double evaluation) {
		this.evaluation = evaluation;
	}
	public int getNumeroChauffeur() {
		return numeroChauffeur;
	}
	public void setNumeroChauffeur(int numeroChauffeur) {
		this.numeroChauffeur = numeroChauffeur;
	}

	// constroctor
	public Chauffeur() {
		super();
	}
	
	public Chauffeur(int idChauffeur, String nom, String prenom, String email, String cin, String status,
			Double evaluation, int numeroChauffeur) {
		super();
		this.idChauffeur = idChauffeur;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.cin = cin;
		this.status = status;
		this.evaluation = evaluation;
		this.numeroChauffeur = numeroChauffeur;
	}
	@Override
	public String toString() {
		return "Chauffeur [idChauffeur=" + idChauffeur + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email
				+ ", cin=" + cin + ", status=" + status + ", evaluation=" + evaluation + ", numeroChauffeur="
				+ numeroChauffeur + "]";
	}
}