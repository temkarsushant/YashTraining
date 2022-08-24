package com.yash.oops.example1;

public class Department {

	int member;
	int deptid;
	String name;

	public Department(int member, int deptid, String name) {
		super();
		this.member = member;
		this.deptid = deptid;
		this.name = name;
	}

	public int getMember() {
		return member;
	}

	public void setMember(int member) {
		this.member = member;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("Department [member=%s, deptid=%s, name=%s]", member, deptid, name);
	}

}
