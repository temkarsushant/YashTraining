package com.yash.string;

public class Example5 {
	public static void main(String[] args) {
		 long startTime = System.currentTimeMillis();  
	        StringBuffer sb = new StringBuffer("Sushant");  
	        for (int i=0; i<100000; i++){  
	            sb.append("Temkar");  
	        }  
	        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
	        startTime = System.currentTimeMillis();  
	        StringBuilder sb2 = new StringBuilder("Sushant");  
	        for (int i=0; i<100000; i++){  
	            sb2.append("Temkar");  
	        }  
	        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
		

	}
}
