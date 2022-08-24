package com.yash.string;

public class Example6 {
public static void main(String[] args) {
	
	String s1=new String("Sushant");
	String s2=new String("Sushant");
	
	System.out.println("Check in Heap Memory and checks address");
	System.out.println(s1==s2);
	
	System.out.println("Check in String Pool and check content");
	System.out.println(s1.equals(s2));
}
}
