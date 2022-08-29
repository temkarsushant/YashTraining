package com.yash.exceptionhandling.example9;

public class Collar {

	double collerSize;
	double standardDaviation;

	public Collar(double collerSize, double standardDaviation) {
		super();
		this.collerSize = collerSize;
		this.standardDaviation = standardDaviation;
	}

	public double getCollerSize() {
		return collerSize;
	}

	public void setCollerSize(double collerSize) {
		this.collerSize = collerSize;
	}

	public double getStandardDaviation() {
		return standardDaviation;
	}

	public void setStandardDaviation(double standardDaviation) {
		this.standardDaviation = standardDaviation;
	}

	@Override
	public String toString() {
		return "Collar [collerSize=" + collerSize + ", standardDaviation=" + standardDaviation + "]";
	}

}
