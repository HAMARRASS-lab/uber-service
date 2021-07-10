package com.hamzetsaa.uberprojectservice.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int idCourse;
	private Date  dateTime ;
	private  int positionA ;
	private int positionB;
	private String status;
	private Double distance ;
	private String remarque;
	public int getIdCourse() {
		return idCourse;
	}
	public void setIdCourse(int idCourse) {
		this.idCourse = idCourse;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public int getPositionA() {
		return positionA;
	}
	public void setPositionA(int positionA) {
		this.positionA = positionA;
	}
	public int getPositionB() {
		return positionB;
	}
	public void setPositionB(int positionB) {
		this.positionB = positionB;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getDistance() {
		return distance;
	}
	public void setDistance(Double distance) {
		this.distance = distance;
	}
	public String getRemarque() {
		return remarque;
	}
	public void setRemarque(String remarque) {
		this.remarque = remarque;
	}
	public Course() {
		
	}
	public Course(int idCourse, Date dateTime, int positionA, int positionB, String status, Double distance,
			String remarque) {
		super();
		this.idCourse = idCourse;
		this.dateTime = dateTime;
		this.positionA = positionA;
		this.positionB = positionB;
		this.status = status;
		this.distance = distance;
		this.remarque = remarque;
	}
	@Override
	public String toString() {
		return "Course [idCourse=" + idCourse + ", dateTime=" + dateTime + ", positionA=" + positionA + ", positionB="
				+ positionB + ", status=" + status + ", distance=" + distance + ", remarque=" + remarque + "]";
	}
	
	
}
