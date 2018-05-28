package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "phone_table")
@Entity
public class Phone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PHONE_ID")
	private Long phoneID;
	
	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;
	
	@Column(name = "TYPE")
	private String type;
	/*
	@OneToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_address",
	        joinColumns = {
	                @JoinColumn(name = "USER_ID",
	                        nullable = false,
	                        updatable = false) },
	        inverseJoinColumns = {
	                @JoinColumn(name = "ADDRESS_ID",
	                        nullable = false,
	                        updatable = false) }
	        )
	private User user;*/
	public Long getPhoneID() {
		return phoneID;
	}
	public void setPhoneID(Long phoneID) {
		this.phoneID = phoneID;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	/*
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}*/
	@Override
	public String toString() {
		return "Phone [phoneID=" + phoneID + ", phoneNumber=" + phoneNumber + ", type=" + type + ", user="  + "]";
	}
	
	
}
