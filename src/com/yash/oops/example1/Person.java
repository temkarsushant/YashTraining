package com.yash.oops.example1;

public class Person {

	protected int id;
	protected String name;
	protected String address;
	protected String dob;

	public Person(int id, String name, String address, String dob) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return String.format("Person [id=%s, name=%s, address=%s, dob=%s]", id, name, address, dob);
	}

}
