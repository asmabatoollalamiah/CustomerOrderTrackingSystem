package com.pace.cots.VO;

import java.util.List;

public class Customer {
	
	
  private Integer customerId;
  
  private String firstName;
  
  private String lastName;
  
  private String address;
  
  private String city;
  
  private String state;
  
  private String zip;
  
  private String country;
  
  private String phoneNumber;
  
  private String email;
  
  private List<Order> ordersList;

/**
 * @return the customerId
 */
public Integer getCustomerId() {
	return customerId;
}

/**
 * @param customerId the customerId to set
 */
public void setCustomerId(Integer customerId) {
	this.customerId = customerId;
}

/**
 * @return the firstName
 */
public String getFirstName() {
	return firstName;
}

/**
 * @param firstName the firstName to set
 */
public void setFirstName(String firstName) {
	this.firstName = firstName;
}

/**
 * @return the lastName
 */
public String getLastName() {
	return lastName;
}

/**
 * @param lastName the lastName to set
 */
public void setLastName(String lastName) {
	this.lastName = lastName;
}

/**
 * @return the address
 */
public String getAddress() {
	return address;
}

/**
 * @param address the address to set
 */
public void setAddress(String address) {
	this.address = address;
}

/**
 * @return the city
 */
public String getCity() {
	return city;
}

/**
 * @param city the city to set
 */
public void setCity(String city) {
	this.city = city;
}

/**
 * @return the state
 */
public String getState() {
	return state;
}

/**
 * @param state the state to set
 */
public void setState(String state) {
	this.state = state;
}

/**
 * @return the zip
 */
public String getZip() {
	return zip;
}

/**
 * @param zip the zip to set
 */
public void setZip(String zip) {
	this.zip = zip;
}

/**
 * @return the country
 */
public String getCountry() {
	return country;
}

/**
 * @param country the country to set
 */
public void setCountry(String country) {
	this.country = country;
}

/**
 * @return the phoneNumber
 */
public String getPhoneNumber() {
	return phoneNumber;
}

/**
 * @param phoneNumber the phoneNumber to set
 */
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

/**
 * @return the email
 */
public String getEmail() {
	return email;
}

/**
 * @param email the email to set
 */
public void setEmail(String email) {
	this.email = email;
}

/**
 * @return the ordersList
 */
public List<Order> getOrdersList() {
	return ordersList;
}

/**
 * @param ordersList the ordersList to set
 */
public void setOrdersList(List<Order> ordersList) {
	this.ordersList = ordersList;
}

}
