package com.yash.oops.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

import com.yash.oops.pojo.JavaTraining;
import com.yash.oops.pojo.SpringTraining;
import com.yash.oops.utility.ChairNoComparator;

public class TrainingClient {
	static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(TrainingClient.class.getName());

	public static void main(String[] args) {

		JavaTraining jt = new JavaTraining();
		jt.setChairNo(1);
		jt.setBoard("Yes");
		jt.setProjector("Yes");
		jt.setStudentName("Sushant");
		jt.setTrainer("Yes");

		JavaTraining jt2 = new JavaTraining();
		jt2.setChairNo(2);
		jt2.setBoard("Yes");
		jt2.setProjector("Yes");
		jt2.setStudentName("Sushant");
		jt2.setTrainer("Yes");

//		JavaTraining jt3=new JavaTraining();
//		jt3.setAttribute(2, "Test",  "Test",  "Test",  "Test");
//		System.out.println("jt3  overloaded"+jt3);

		JavaTraining jt4 = new JavaTraining(5, "Test", "Test", "Test", "Test");

		System.out.println(jt4);

		System.out.println(jt.equals(jt2));

		System.out.println("jt = " + jt.hashCode());
		System.out.println("jt2 = " + jt2.hashCode());

		System.out.println("jt1 = " + jt);
		System.out.println("jt2 = " + jt2);

		System.out.println(jt.compareTo(jt2));

		ChairNoComparator cnc = new ChairNoComparator();
		System.out.println(cnc.compare(jt, jt2));
		JavaTraining t2 = null;
		try {
			t2 = (JavaTraining) jt.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Cloned Method = " + t2);

		System.out.println("get class methods = " + t2.getClass());

		// Create Array of size 5 for JavaTraining class
		JavaTraining[] jtArray = new JavaTraining[5];

		jtArray[0] = new JavaTraining(11, "Yes", "Yes", "Yes", "Sushant", "Yes", "Yes");
		jtArray[1] = new JavaTraining(12, "Yes", "Yes", "Yes", "Raju", "Yes", "Yes");
		jtArray[2] = new JavaTraining(13, "Yes", "Yes", "Yes", "Ramu", "Yes", "Yes");
		jtArray[3] = new JavaTraining(14, "Yes", "Yes", "Yes", "Harihar", "Yes", "Yes");
		jtArray[4] = new JavaTraining(15, "Yes", "Yes", "Yes", "Rajeshwar", "Yes", "Yes");

		for (int i = 0; i < jtArray.length; i++) {
			System.out.println(jtArray[i]);
		}

//		Check private data members are accessible outside the class through public method

		JavaTraining jtAccess = new JavaTraining();

		jtAccess.setAttribute(16, "Yes", "Yes", "Yes", "Sushant", "Yes", "Yes");

		System.out.println("Private datamembers using public method" + jtAccess);

//		System.out.println(JavaTraining.projector);

		SpringTraining st = new SpringTraining();
		st.setAttribute(101, "Test", "Test", "Test", "Test", "Test", "Test", "Test");

		System.out.println("Method Overriding : " + st);

		log.info("Log4J is working");

		try {
			System.out.println("Test Multicatch Exception");
		} catch (ArithmeticException | NumberFormatException e) {
			e.printStackTrace();
		}
		
		String path="C:\\Users\\sushant.temkar\\Desktop";
		try {
			readFirstLineFromFile(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

//		System.out.println("Super Keyword : ");
	}
	
	static String readFirstLineFromFile(String path) throws IOException {
	    try (FileReader fr = new FileReader(path);
	         BufferedReader br = new BufferedReader(fr)) {
	        return br.readLine();
	    }
	}
}
