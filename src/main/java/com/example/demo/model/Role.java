package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Role implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2975877849722398826L;

	@Id
	@GeneratedValue
	private long id;
	private String role;
	
	public Role() {
	}
	public Role(String role) {
		this.role = role;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
