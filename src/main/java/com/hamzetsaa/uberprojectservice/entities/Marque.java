
  package com.hamzetsaa.uberprojectservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="marque")
public class Marque {
  
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int idMarque;
  private String nom;
  
  
public Marque(int idMarque, String nom) {
	super();
	this.idMarque = idMarque;
	this.nom = nom;
}

public Marque(String nom) {
	super();
	this.nom = nom;
}

public Marque() {
	super();
}

public int getIdMarque() {
	return idMarque;
}
public void setIdMarque(int idMarque) {
	this.idMarque = idMarque;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}

@Override
public String toString() {
	return "Marque [idMarque=" + idMarque + ", nom=" + nom + "]";
}
 }
 