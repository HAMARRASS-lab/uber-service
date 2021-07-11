package com.hamzetsaa.uberprojectservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="chauffeur")
public class TypeVehicule {


    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
	private int idTypeVehicule;
	private String type;
	private String icone;
	
	
	
	public TypeVehicule(int idTypeVehicule, String type, String icone) {
		super();
		this.idTypeVehicule = idTypeVehicule;
		this.type = type;
		this.icone = icone;
	}
	
	public TypeVehicule(String type, String icone) {
		super();
		this.type = type;
		this.icone = icone;
	}

	public TypeVehicule() {
		super();
	}

	public int getIdTypeVehicule() {
		return idTypeVehicule;
	}
	public void setIdTypeVehicule(int idTypeVehicule) {
		this.idTypeVehicule = idTypeVehicule;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getIcone() {
		return icone;
	}
	public void setIcone(String icone) {
		this.icone = icone;
	}

	@Override
	public String toString() {
		return "TypeVehicule [idTypeVehicule=" + idTypeVehicule + ", type=" + type + ", icone=" + icone + "]";
	}
	
}
