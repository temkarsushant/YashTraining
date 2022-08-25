package com.yash.oops.example3;

public class CustomerAccountStatement {

	int CAID;
	Customer CustId;
	int amount;
	int deposit_withdrawl;
	String deposit_date;

	public CustomerAccountStatement() {
		super();
	}

	public CustomerAccountStatement(int cAID, Customer custId, int amount, int deposit_withdrawl, String deposit_date) {
		super();
		CAID = cAID;
		CustId = custId;
		this.amount = amount;
		this.deposit_withdrawl = deposit_withdrawl;
		this.deposit_date = deposit_date;
	}

	public int getCAID() {
		return CAID;
	}

	public void setCAID(int cAID) {
		CAID = cAID;
	}

	public Customer getCustId() {
		return CustId;
	}

	public void setCustId(Customer custId) {
		CustId = custId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getDeposit_withdrawl() {
		return deposit_withdrawl;
	}

	public void setDeposit_withdrawl(int deposit_withdrawl) {
		this.deposit_withdrawl = deposit_withdrawl;
	}

	public String getDeposit_date() {
		return deposit_date;
	}

	public void setDeposit_date(String deposit_date) {
		this.deposit_date = deposit_date;
	}

	@Override
	public String toString() {
		return "CustomerAccountStatement [CAID=" + CAID + ", CustId=" + CustId + ", amount=" + amount
				+ ", deposit_withdrawl=" + deposit_withdrawl + ", deposit_date=" + deposit_date + "]";
	}

}
