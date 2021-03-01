package com.way2learnoline;

public class Address {

	private String city;
	private String country;
	private int addressId;
	
	public Address(){
		
	}
	
	public Address(String city, String country, int addressId) {
		super();
		this.city = city;
		this.country = country;
		this.addressId=addressId;
	}
	public String getCity() {
		return city;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", addressId=" + addressId + "]";
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

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
}
