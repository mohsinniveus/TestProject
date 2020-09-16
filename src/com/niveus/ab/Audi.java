package com.niveus.ab;

public class Audi implements ParentCar {
	
	int speed =0;
	int gear=1;
	
	public void changeGear( int value) {
		this.gear = value;
	}
	
	public void speedUp(int inrement) {
		this.speed= this.speed +inrement;
	}
	
	public void applyBrakes(int decrement) {
		this.speed = this.speed- decrement;
	}
	
	public void printStates() {
		System.out.println("Speed: "+speed+" gear "+gear);
	}
	
	public static void main(String args[]) {
		Audi A6 = new Audi();
		A6.speedUp(50);
		A6.printStates();
		A6.changeGear(4);
		A6.speedUp(100);
		A6.printStates();
	}
}
