package com.hamzetsaa.uberprojectservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="typeOperation")
public class TypeOperation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTypeOperation;
	private String description;
	public TypeOperation(int idTypeOperation, String description) {
		super();
		this.idTypeOperation = idTypeOperation;
		this.description = description;
	}
	public TypeOperation(String description) {
		super();
		this.description = description;
	}
	public TypeOperation() {
		super();
	}
	public int getIdTypeOperation() {
		return idTypeOperation;
	}
	public void setIdTypeOperation(int idTypeOperation) {
		this.idTypeOperation = idTypeOperation;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "TypeOperation [idTypeOperation=" + idTypeOperation + ", description=" + description + "]";
	}
	
}
