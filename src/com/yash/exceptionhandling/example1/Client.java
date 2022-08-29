package com.yash.exceptionhandling.example1;

public class Client {

	public static void main(String[] args) throws ResultException {
		Client c=new Client();
		StudentResult sr = new StudentResult(35, 45, 45, 45, 45);
		Student st = new Student(1, "Ramu", "Pune", sr);
		
		c.checkResult(st);
	}

	private void checkResult(Student st) throws ResultException {

		
		StudentResult sr=st.getSrobj();
		double subject1=sr.getSubject1();
		double subject2=sr.getSubject2();
		double subject3=sr.getSubject3();
		double subject4=sr.getSubject4();
		double subject5=sr.getSubject5();
		double totalMarks=subject1+subject2+subject3+subject4+subject5;
		double total=500;
		double percentage=totalMarks/total*100;
		if(percentage<40 || subject1<40 || subject2< 40 || subject3<40 || subject4< 40 || subject5< 40 ||
				subject1<0 ||
				subject2<0 ||
				subject3<0 ||
				subject4<0 ||
				subject5<0) {
			throw new ResultException("Student is failed");
		}else {
			System.out.println("Student is passed with "+percentage+"%");
		}
	}

}
