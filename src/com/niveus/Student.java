package com.niveus;

public class Student {
	
	int rollNo;
	String name;
	
	void insertRecord(int r, String n) {
		this.rollNo = r;
		this.name = n;
	}
	
	void displayInformation() {
		System.out.println(this.rollNo+" ---- "+this.name);
	}

}
