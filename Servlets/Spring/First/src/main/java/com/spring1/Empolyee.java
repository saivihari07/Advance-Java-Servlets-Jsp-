package com.spring1;

public class Empolyee {

	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Empolyee() {
		super();
	}

	public Empolyee(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Empoylee " +address;
	}

}
