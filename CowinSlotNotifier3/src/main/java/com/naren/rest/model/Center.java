package com.naren.rest.model;

public class Center {

	private int centerid;
	private String name;
	private String address;
	private int pincode;
	private String fee_type;
	private String date;
	private int available_capacity;
	private long fee;
	private byte min_age_limit;
	private String vaccine;

	public int getCenterid() {
		return centerid;
	}

	public void setCenterid(int centerid) {
		this.centerid = centerid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getFee_type() {
		return fee_type;
	}

	public void setFee_type(String fee_type) {
		this.fee_type = fee_type;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getAvailable_capacity() {
		return available_capacity;
	}

	public void setAvailable_capacity(int available_capacity) {
		this.available_capacity = available_capacity;
	}

	public long getFee() {
		return fee;
	}

	public void setFee(long fee) {
		this.fee = fee;
	}

	public byte getMin_age_limit() {
		return min_age_limit;
	}

	public void setMin_age_limit(byte min_age_limit) {
		this.min_age_limit = min_age_limit;
	}

	public String getVaccine() {
		return vaccine;
	}

	public void setVaccine(String vaccine) {
		this.vaccine = vaccine;
	}
}
