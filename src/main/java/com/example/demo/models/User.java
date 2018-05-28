package com.example.demo.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "user_table")
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID")
	private Long userID;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "MIDDLE_NAME")
	private String middleName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "DATE_OF_BIRTH")
	private Date dateOfBirth;
/*
	@ManyToOne(fetch = FetchType.LAZY)
	private List<Address> addresses = new ArrayList<>();
	
	@ManyToOne(fetch = FetchType.LAZY)
	private List<Phone> phones = new ArrayList<>();
*/
	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
/*
	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public List<Phone> getPhones() {
		return phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}
*/
	@Override
	public String toString() {
		String addressString = "";
		String phoneString = "";
	/*	for (Address address : this.addresses) {
			addressString = addressString + address.toString() + "\n";
		}
		for (Phone phone : this.phones) {
			phoneString = phoneString + phone.toString() + "\n";
		}*/
		String toString = " FirstName " + this.firstName + " MiddleName " + this.middleName + " LastName "
				+ this.lastName /*+ " Date of Birth " + this.dateOfBirth + " ADDRESSES " + addressString + "PHONES"
				+ phoneString*/;
		return toString;
	}

}
