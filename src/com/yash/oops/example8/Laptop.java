package com.yash.oops.example8;

public class Laptop extends Electornics{
	int id;
	String semiconductorType;
	String dateOfManufacturing;
	public Laptop(int id, String semiconductorType, String dateOfManufacturing) {
		super(id,semiconductorType,dateOfManufacturing);
		this.id = id;
		this.semiconductorType = semiconductorType;
		this.dateOfManufacturing = dateOfManufacturing;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSemiconductorType() {
		return semiconductorType;
	}
	public void setSemiconductorType(String semiconductorType) {
		this.semiconductorType = semiconductorType;
	}
	public String getDateOfManufacturing() {
		return dateOfManufacturing;
	}
	public void setDateOfManufacturing(String dateOfManufacturing) {
		this.dateOfManufacturing = dateOfManufacturing;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", semiconductorType=" + semiconductorType + ", dateOfManufacturing="
				+ dateOfManufacturing + "]";
	}
	
	
}
