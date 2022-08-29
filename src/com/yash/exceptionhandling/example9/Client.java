package com.yash.exceptionhandling.example9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Client {
	public static void main(String[] args) throws CollarStandardDeviateException {
		Collar cc = new Collar(30, 1);
		Collar cc1 = new Collar(33, 2);
		Collar cc2 = new Collar(32, 3);
		Collar cc3 = new Collar(34, 2);
		Collar cc4 = new Collar(34, 2);
		Collar cc5 = new Collar(34, 2);
		Collar cc6 = new Collar(34, 4);
		Collar cc7 = new Collar(34, 4);
		Collar cc8 = new Collar(34, 4);
		Collar cc9 = new Collar(34, 4);

		int count = 0;

		ArrayList<Collar> al=new ArrayList<>();
		
		al.add(cc);
		al.add(cc1);
		al.add(cc2);
		al.add(cc3);
		al.add(cc4);
		al.add(cc5);
		al.add(cc6);
		al.add(cc7);
		al.add(cc8);
		al.add(cc9);

		for(Collar cl:al) {
			if(cl.getStandardDaviation()>2) {
				count++;
			}
		}
		
		if(count>5) {
			throw new CollarStandardDeviateException("Collar deviation is more than expected");
		}else {
			System.out.println("Everything is good");
		}
	}
}
