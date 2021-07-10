package com.hamzetsaa.uberprojectservice.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="evaluation")
public class Evaluation {
	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEvaluation;
	  
	private Date datetime;
	
	private int score;
	
	private String type;

	public int getIdEvaluation() {
		return idEvaluation;
	}

	public void setIdEvaluation(int idEvaluation) {
		this.idEvaluation = idEvaluation;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Evaluation() {
		
	}

	public Evaluation(int idEvaluation, Date datetime, int score, String type) {
		super();
		this.idEvaluation = idEvaluation;
		this.datetime = datetime;
		this.score = score;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Evaluation [idEvaluation=" + idEvaluation + ", datetime=" + datetime + ", score=" + score + ", type="
				+ type + "]";
	}
	
	
}
