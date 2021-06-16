package com.naren.rest.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CenterData {
	@JsonProperty("center_id")
	private int center_id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("address")
	private String address;
	@JsonProperty("state_name")
	private String state_name;
	@JsonProperty("district_name")
	private String district_name;
	@JsonProperty("block_name")
	private String block_name;
	@JsonProperty("pincode")
	private int pincode;
	@JsonProperty("from")
	private String from;
	@JsonProperty("to")
	private String to;
	@JsonProperty("lat")
	private int lat;
	@JsonProperty("long")
	private int longi;
	@JsonProperty("fee_type")
	private String fee_type;
	@JsonProperty("session_id")
	private String session_id;
	@JsonProperty("date")
	private String date;
	@JsonProperty("available_capacity")
	private String available_capacity;
	@JsonProperty("available_capacity_dose1")
	private String available_capacity_dose1;
	@JsonProperty("available_capacity_dose2")
	private String available_capacity_dose2;
	@JsonProperty("fee")
	private String fee;
	@JsonProperty("min_age_limit")
	private int min_age_limit;
	@JsonProperty("vaccine")
	private String vaccine;
	@JsonProperty("slots")
	private List<String> slots;

	public int getCenter_id() {
		return center_id;
	}

	public void setCenter_id(int center_id) {
		this.center_id = center_id;
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

	public String getState_name() {
		return state_name;
	}

	public void setState_name(String state_name) {
		this.state_name = state_name;
	}

	public String getDistrict_name() {
		return district_name;
	}

	public void setDistrict_name(String district_name) {
		this.district_name = district_name;
	}

	public String getBlock_name() {
		return block_name;
	}

	public void setBlock_name(String block_name) {
		this.block_name = block_name;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public int getLat() {
		return lat;
	}

	public void setLat(int lat) {
		this.lat = lat;
	}

	public int getLongi() {
		return longi;
	}

	public void setLongi(int longi) {
		this.longi = longi;
	}

	public String getFee_type() {
		return fee_type;
	}

	public void setFee_type(String fee_type) {
		this.fee_type = fee_type;
	}

	public String getSession_id() {
		return session_id;
	}

	public void setSession_id(String session_id) {
		this.session_id = session_id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAvailable_capacity() {
		return available_capacity;
	}

	public void setAvailable_capacity(String available_capacity) {
		this.available_capacity = available_capacity;
	}

	public String getAvailable_capacity_dose1() {
		return available_capacity_dose1;
	}

	public void setAvailable_capacity_dose1(String available_capacity_dose1) {
		this.available_capacity_dose1 = available_capacity_dose1;
	}

	public String getAvailable_capacity_dose2() {
		return available_capacity_dose2;
	}

	public void setAvailable_capacity_dose2(String available_capacity_dose2) {
		this.available_capacity_dose2 = available_capacity_dose2;
	}

	public String getFee() {
		return fee;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}

	public int getMin_age_limit() {
		return min_age_limit;
	}

	public void setMin_age_limit(int min_age_limit) {
		this.min_age_limit = min_age_limit;
	}

	public String getVaccine() {
		return vaccine;
	}

	public void setVaccine(String vaccine) {
		this.vaccine = vaccine;
	}

	public List<String> getSlots() {
		return slots;
	}

	public void setSlots(List<String> slots) {
		this.slots = slots;
	}

	/**
	 * "center_id": 14463, "name": "Bothi SC", "address": "Bothi", "state_name":
	 * "Maharashtra", "district_name": "Latur", "block_name": "Chakur", "pincode":
	 * 413513, "from": "10:00:00", "to": "17:00:00", "lat": 1, "long": 1,
	 * "fee_type": "Free", "session_id": "2f36883b-177f-4c8b-a432-8fdb72a3e46c",
	 * "date": "17-06-2021", "available_capacity": 0, "available_capacity_dose1": 0,
	 * "available_capacity_dose2": 0, "fee": "0", "min_age_limit": 45, "vaccine":
	 * "COVISHIELD", "slots": [ "10:00AM-12:00PM", "12:00PM-02:00PM",
	 * "02:00PM-04:00PM", "04:00PM-05:00PM" ]
	 */

}
