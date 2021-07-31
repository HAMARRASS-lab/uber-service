package com.hamzetsaa.uberprojectservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="client")
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClient;
	private String nom;
	private String prenom;
	private String email;
	private String status;
    private int wallet;
    private double evaluation;
    private String image;
    private int user;
    private String codePrainage;
    private int numeroClient;
	public Client() {
		super();
	}
	public Client(int idClient, String nom, String prenom, String email, String status, int wallet, double evaluation,
			String image, int user, String codePrainage, int numeroClient) {
		super();
		this.idClient = idClient;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.status = status;
		this.wallet = wallet;
		this.evaluation = evaluation;
		this.image = image;
		this.user = user;
		this.codePrainage = codePrainage;
		this.numeroClient = numeroClient;
	}
	public Client(String nom, String prenom, String email, String status, int wallet, double evaluation, String image,
			int user, String codePrainage, int numeroClient) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.status = status;
		this.wallet = wallet;
		this.evaluation = evaluation;
		this.image = image;
		this.user = user;
		this.codePrainage = codePrainage;
		this.numeroClient = numeroClient;
	}
	public int getIdClient() {
		return idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getWallet() {
		return wallet;
	}
	public void setWallet(int wallet) {
		this.wallet = wallet;
	}
	public double getEvaluation() {
		return evaluation;
	}
	public void setEvaluation(double evaluation) {
		this.evaluation = evaluation;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getUser() {
		return user;
	}
	public void setUser(int user) {
		this.user = user;
	}
	public String getCodePrainage() {
		return codePrainage;
	}
	public void setCodePrainage(String codePrainage) {
		this.codePrainage = codePrainage;
	}
	public int getNumeroClient() {
		return numeroClient;
	}
	public void setNumeroClient(int numeroClient) {
		this.numeroClient = numeroClient;
	}
	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", status="
				+ status + ", wallet=" + wallet + ", evaluation=" + evaluation + ", image=" + image + ", user=" + user
				+ ", codePrainage=" + codePrainage + ", numeroClient=" + numeroClient + "]";
	}
    
	
	
}
