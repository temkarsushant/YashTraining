package com.yash.oops.example3;

public class Customer {

	int CustId;
	int accountno;
	String custname;
	String cust_address;
	String cust_dob;
	String cust_account_opening_date;
	Branch branch_Obj;

	public Customer() {
		super();
	}

	public Customer(int custId, int accountno, String custname, String cust_address, String cust_dob,
			String cust_account_opening_date, Branch branch_Obj) {
		super();
		CustId = custId;
		this.accountno = accountno;
		this.custname = custname;
		this.cust_address = cust_address;
		this.cust_dob = cust_dob;
		this.cust_account_opening_date = cust_account_opening_date;
		this.branch_Obj = branch_Obj;
	}

	public int getCustId() {
		return CustId;
	}

	public void setCustId(int custId) {
		CustId = custId;
	}

	public int getAccountno() {
		return accountno;
	}

	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getCust_address() {
		return cust_address;
	}

	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}

	public String getCust_dob() {
		return cust_dob;
	}

	public void setCust_dob(String cust_dob) {
		this.cust_dob = cust_dob;
	}

	public String getCust_account_opening_date() {
		return cust_account_opening_date;
	}

	public void setCust_account_opening_date(String cust_account_opening_date) {
		this.cust_account_opening_date = cust_account_opening_date;
	}

	public Branch getBranch_Obj() {
		return branch_Obj;
	}

	public void setBranch_Obj(Branch branch_Obj) {
		this.branch_Obj = branch_Obj;
	}

	@Override
	public String toString() {
		return "Customer [CustId=" + CustId + ", accountno=" + accountno + ", custname=" + custname + ", cust_address="
				+ cust_address + ", cust_dob=" + cust_dob + ", cust_account_opening_date=" + cust_account_opening_date
				+ ", branch_Obj=" + branch_Obj + "]";
	}

}
