package com.niveus;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new Student();

		s1.insertRecord(111, "Karan");
		s2.insertRecord(222, "Rahul");
		
		s1.displayInformation();
		s2.displayInformation();
	}

}
