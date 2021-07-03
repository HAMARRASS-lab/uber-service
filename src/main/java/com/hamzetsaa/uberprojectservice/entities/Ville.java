package com.hamzetsaa.uberprojectservice.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ville")
public class Ville {
	

	// define fields
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idVille ;
	
	private String nom;
	
	
	  public int getIdVille()
	  { 
		  return idVille;
	  } 
	  public void setIdVille(int idVille) 
	  {
		  this.idVille = idVille; 
		  } 
	  public String getNom() 
		  {
			  return nom; 
		  }
	  public void setNom(String nom) 
	  { 
		  this.nom = nom; 
	  } 
	  public Ville() {}
	  
	  @Override public String toString() { return "Ville [idVille=" + idVille +
	  ", nom=" + nom + "]"; }
	 
}
