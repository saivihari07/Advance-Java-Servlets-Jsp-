package com.spring.First;

public class Address {
	private String streetline, city, state, country;

	public Address(String streetline, String city, String state, String country) {
		super();
		this.streetline = streetline;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [streetline=" + streetline + ", city=" + city + ", state=" + state + ", country=" + country
				+ "]";
	}

}
