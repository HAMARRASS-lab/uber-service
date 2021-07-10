package com.hamzetsaa.uberprojectservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="role")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int idRole;
	private String nom;
	public int getIdRole() {
		return idRole;
	}
	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Role() {
		
	}
	public Role(int idRole, String nom) {
		super();
		this.idRole = idRole;
		this.nom = nom;
	}
	@Override
	public String toString() {
		return "Role [idRole=" + idRole + ", nom=" + nom + "]";
	}

	
}
