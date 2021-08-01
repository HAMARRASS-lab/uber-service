package com.hamzetsaa.uberprojectservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RaisonAnnulation")
public class RaisonAnnulation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRaisonAnnulation;
	private String description;
	public RaisonAnnulation() {
		super();
	}
	public RaisonAnnulation(int idRaisonAnnulation, String description) {
		super();
		this.idRaisonAnnulation = idRaisonAnnulation;
		this.description = description;
	}
	public RaisonAnnulation(String description) {
		super();
		this.description = description;
	}
	public int getIdRaisonAnnulation() {
		return idRaisonAnnulation;
	}
	public void setIdRaisonAnnulation(int idRaisonAnnulation) {
		this.idRaisonAnnulation = idRaisonAnnulation;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "RaisonAnnulation [idRaisonAnnulation=" + idRaisonAnnulation + ", description=" + description + "]";
	}
	
	
}
