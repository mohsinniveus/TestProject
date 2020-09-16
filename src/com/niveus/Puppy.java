package com.niveus;

public class Puppy {
	
	int puppyAge;
	
	public int getPuppyAge() {
		return puppyAge;
	}
	
	public void setPuppyAge(int age) {
		this.puppyAge = age;
	}
	
	public Puppy() {
		System.out.println(" default constructor");
	}
	
	public Puppy(String name) {
		System.out.println(" one arg constructor .."+name);
	}
	
	public static void main(String args[]) {
		Puppy myPuppy = new Puppy("Tiger");
		myPuppy.setPuppyAge(10);
		int age = myPuppy.getPuppyAge();
		System.out.println(" Age --- "+age);
	}
}
