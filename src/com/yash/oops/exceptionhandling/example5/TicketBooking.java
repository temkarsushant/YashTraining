package com.yash.oops.exceptionhandling.example5;

public class TicketBooking {

	int ticketNo;
	String passangerName;
	boolean tatkal;
	int age;

	public TicketBooking(int ticketNo, String passangerName, boolean tatkal, int age) {
		super();
		this.ticketNo = ticketNo;
		this.passangerName = passangerName;
		this.tatkal = tatkal;
		this.age = age;
	}

	public int getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}

	public String getPassangerName() {
		return passangerName;
	}

	public void setPassangerName(String passangerName) {
		this.passangerName = passangerName;
	}

	public boolean isTatkal() {
		return tatkal;
	}

	public void setTatkal(boolean tatkal) {
		this.tatkal = tatkal;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "TicketBooking [ticketNo=" + ticketNo + ", passangerName=" + passangerName + ", tatkal=" + tatkal
				+ ", age=" + age + "]";
	}

}
