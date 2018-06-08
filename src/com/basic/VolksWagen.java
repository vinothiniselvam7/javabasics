package com.basic;

public class VolksWagen {
	String model;
	double speed;                

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	

public static void main(String args[])
{
	VolksWagen volkswagen=new VolksWagen();
	volkswagen.setSpeed(100);
	System.out.println(volkswagen.getSpeed());
	
	
}

}