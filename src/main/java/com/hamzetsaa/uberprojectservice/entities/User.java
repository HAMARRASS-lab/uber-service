package com.hamzetsaa.uberprojectservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
 @Table(name="user")
public class User {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private  int idUser;
	private String username;
	private String password;
	private String status;
	private  String type;
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public User() {
	}
	public User(int idUser, String username, String password, String status, String type) {
		super();
		this.idUser = idUser;
		this.username = username;
		this.password = password;
		this.status = status;
		this.type = type;
	}
	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", username=" + username + ", password=" + password + ", status=" + status
				+ ", type=" + type + "]";
	}


}
