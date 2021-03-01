package com.way2learnoline;

public class Address {

	private int addressId;
	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	private String city;
	private String country;
	
	public Address(){
		
	}
	
	public Address(int id,String city, String country) {
		super();
		this.addressId=id;
		this.city = city;
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
