package de.teamzhang.model;

import java.math.BigInteger;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private BigInteger id;

	private String firstName;
	private String lastName;
	private String mail;
	private String password;
	private String username;
	private int role;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public Integer getRole() {
		return role;
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setRole(int role) {
		this.role = role;
	}

}
