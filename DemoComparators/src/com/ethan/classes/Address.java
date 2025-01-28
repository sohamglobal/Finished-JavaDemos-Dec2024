package com.ethan.classes;

public class Address implements Comparable<Address> {
	private String street;
	private int pincode;
	
	public Address(String street, int pincode) {
		super();
		this.street = street;
		this.pincode = pincode;
	}

	public String getStreet() {
		return street;
	}

	public int getPincode() {
		return pincode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", pincode=" + pincode + "]";
	}

	@Override
	public int compareTo(Address o) {
		// TODO Auto-generated method stub
		return this.pincode-o.pincode;
	}


}
