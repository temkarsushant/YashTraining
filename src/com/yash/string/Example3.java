package com.yash.string;

public class Example3 {
	public static void main(String[] args) {

		String vowels="aeiou";
		
		String check="Sushant";
		String temp=new String();
		char[] ch=check.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(!vowels.contains(Character.toString(ch[i]))) {
				temp=temp+ch[i];
			}
		}
		System.out.println(temp);
	}
}
