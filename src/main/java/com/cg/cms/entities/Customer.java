package com.cg.cms.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cust_id")
public class Customer {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;

private String firstName;
private String lastName;
private String email;
private String address;
private long mobile;
public Customer()
{
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
@Override
public String toString() {
	return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
			+ ", address=" + address + ", mobile=" + mobile + "]";
}

}
