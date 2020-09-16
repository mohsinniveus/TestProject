package com.niveus.ol;

public class TestOverloading1 {
	public static void main(String[] args){  
		int x = Adder.add(1, 1);
		int y = Adder.add(2, 2);
		double z = Adder.add(1.1, 1.1);
		System.out.println(" x = "+x); 
		System.out.println(" Y "+y); 
		System.out.println(" Z "+z); 
	}
}
