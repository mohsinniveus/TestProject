package com.niveus.ab;

public abstract class Animal {
	
	public void displayInfo() {
		System.out.println("I am an animal");
	}
	
	public void eat() {
		System.out.println("I can eat");
	}
	
	abstract void makeSound();

}
