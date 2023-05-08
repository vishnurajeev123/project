package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class LoginModel {
	@Id
	@Column(name="id")
	@GeneratedValue
	private int id;
	@Column(name="email")
	private String email;
	@Column(name="pass")
    private String pass;
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public LoginModel() {
		super();
	}
	public LoginModel(int id, String email, String pass) {
		super();
		this.id = id;
		this.email = email;
		this.pass = pass;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}