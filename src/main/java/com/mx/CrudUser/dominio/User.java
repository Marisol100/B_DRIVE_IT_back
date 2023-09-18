package com.mx.CrudUser.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "USERS")
public class User {

	/*
	 * CREATE TABLE USERS( user_id NUMBER PRIMARY KEY NOT NULL, username
	 * NVARCHAR2(20) NOT NULL, password NVARCHAR2(100) NOT NULL, first_name
	 * NVARCHAR2(30) NOT NULL, middle_name NVARCHAR2(30) NOT NULL, last_name
	 * NVARCHAR2(30) NOT NULL, email NVARCHAR2(50) );f
	 */
	@Id
	private int user_id;
	private String username;
	private String password;
	private String first_name;
	private String middle_name;
	private String last_name;
	private String email;

	public User() {
	}

	public User(int user_id) {
		this.user_id = user_id;
	}

	public User(int user_id, String username, String password, String first_name, String middle_name, String last_name,
			String email) {
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", username=" + username + ", password=" + password + ", first_name="
				+ first_name + ", middle_name=" + middle_name + ", last_name=" + last_name + ", email=" + email + "]/n";
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
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

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
