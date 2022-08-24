package com.yash.oops.example1;

public class Employee extends Person {

	long salary;
	String dateofjoining;
	String baselocation;
	Department deptobj;
	int contactno;
	String emailid;

	public Employee(int id, String name, String address, String dob, long salary, String dateofjoining,
			String baselocation, Department deptobj, int contactno, String emailid) {
		super(id, name, address, dob);
		this.salary = salary;
		this.dateofjoining = dateofjoining;
		this.baselocation = baselocation;
		this.deptobj = deptobj;
		this.contactno = contactno;
		this.emailid = emailid;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getDateofjoining() {
		return dateofjoining;
	}

	public void setDateofjoining(String dateofjoining) {
		this.dateofjoining = dateofjoining;
	}

	public String getBaselocation() {
		return baselocation;
	}

	public void setBaselocation(String baselocation) {
		this.baselocation = baselocation;
	}

	public Department getDeptobj() {
		return deptobj;
	}

	public void setDeptobj(Department deptobj) {
		this.deptobj = deptobj;
	}

	public int getContactno() {
		return contactno;
	}

	public void setContactno(int contactno) {
		this.contactno = contactno;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	@Override
	public String toString() {
		return String.format(
				"Employee [salary=%s, dateofjoining=%s, baselocation=%s, deptobj=%s, contactno=%s, emailid=%s]", salary,
				dateofjoining, baselocation, deptobj, contactno, emailid);
	}

}
