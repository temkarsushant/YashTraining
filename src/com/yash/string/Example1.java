package com.yash.string;

import java.util.Scanner;

public class Example1 {
public static void main(String[] args) {
	
	
	System.out.println("Enter First String");
	Scanner sc1=new Scanner(System.in);
	String str1=sc1.next();
	
	System.out.println("Enter Second String");
	String str2=sc1.next();
	
	System.out.println("Please insert the index posing in String 1 where you want to insert String 2");
	int position=sc1.nextInt();
	
	StringBuilder temp=new StringBuilder(str1);
	temp=temp.insert(position, str2);
	
	System.out.println(temp);
	
	
	
}
}
