package com.example.cms.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class signup {
	@Id
	public String email;
	public String name;
	public String password;
	public String contact;
	
	public signup(String email, String name, String password, String contact) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
		this.contact = contact;
	}

	public signup() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "signup [email=" + email + ", name=" + name + ", password=" + password + ", contact=" + contact + "]";
	}
	
}

