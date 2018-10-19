package ie.gmit.studentmanager;

import java.io.Serializable;

public class Address implements Serializable{
	private int houseNumber;
	private String street;
	private String county;
	private String eircode;

	public Address(String eircode) {
		this.eircode = eircode;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public String getStreet() {
		return this.street;
	}

	public String getCounty() {
		return county;
	}

	public String getEircode() {
		return eircode;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public void setEircode(String eircode) {
		this.eircode = eircode;
	}

}
