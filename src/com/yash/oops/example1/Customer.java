package com.yash.oops.example1;

public class Customer extends Person {
	int registration;
	String deliveryaddress;
	int contactno;
	String email_id;

	public Customer(int id, String name, String address, String dob, int registration, String deliveryaddress,
			int contactno, String email_id) {
		super(id, name, address, dob);
		this.registration = registration;
		this.deliveryaddress = deliveryaddress;
		this.contactno = contactno;
		this.email_id = email_id;
	}

	public int getRegistration() {
		return registration;
	}

	public void setRegistration(int registration) {
		this.registration = registration;
	}

	public String getDeliveryaddress() {
		return deliveryaddress;
	}

	public void setDeliveryaddress(String deliveryaddress) {
		this.deliveryaddress = deliveryaddress;
	}

	public int getContactno() {
		return contactno;
	}

	public void setContactno(int contactno) {
		this.contactno = contactno;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	@Override
	public String toString() {
		return String.format("Customer [registration=%s, deliveryaddress=%s, contactno=%s, email_id=%s]", registration,
				deliveryaddress, contactno, email_id);
	}

}
