package com.hamzetsaa.uberprojectservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lieuFavori")
public class LieuFavori {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idLieuFavori;
	private String nom;
	private double lat;
	private double longue ;
	private int client;
	public LieuFavori() {
		super();
	}
	public LieuFavori(int idLieuFavori, String nom, double lat, double longue, int client) {
		super();
		this.idLieuFavori = idLieuFavori;
		this.nom = nom;
		this.lat = lat;
		this.longue = longue;
		this.client = client;
	}
	public LieuFavori(String nom, double lat, double longue, int client) {
		super();
		this.nom = nom;
		this.lat = lat;
		this.longue = longue;
		this.client = client;
	}
	public int getIdLieuFavori() {
		return idLieuFavori;
	}
	public void setIdLieuFavori(int idLieuFavori) {
		this.idLieuFavori = idLieuFavori;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLongue() {
		return longue;
	}
	public void setLongue(double longue) {
		this.longue = longue;
	}
	public int getClient() {
		return client;
	}
	public void setClient(int client) {
		this.client = client;
	}
	@Override
	public String toString() {
		return "LieuFavori [idLieuFavori=" + idLieuFavori + ", nom=" + nom + ", lat=" + lat + ", longue=" + longue
				+ ", client=" + client + "]";
	} 
	
	
}
