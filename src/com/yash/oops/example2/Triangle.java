package com.yash.oops.example2;

public class Triangle implements Shape{
	private int a;
	private int b;
	private int c;
	
	private int x;
	private int y;

	public Triangle(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	

	@Override
	public int area(Object obj) {
		
		return 0;
	}

}
