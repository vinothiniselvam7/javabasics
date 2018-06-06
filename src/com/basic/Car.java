package com.basic;

public class Car {
	String model;
	double speed;

	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
		
	}

	public Car() {
		System.out.println("empty cons called in car ");

	}

	public Car(int i) {
		System.out.println("one arg cons in car called");
	}

	

	public void brake() {
		System.out.println("brake in car called");
		
		

	}

}
