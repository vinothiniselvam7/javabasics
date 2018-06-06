package com.basic;

public class Shape {
	double side;
	double length;
	double breadth;

	public Shape(double side)
	{
	this.side=side;
	}
   public Shape(double length,double breadth)
   {
	   if( length<20&&length>0&&breadth<20&&breadth>0)
	   {
		   this.length=length;
		   this.breadth=breadth;
	   }else
	   {
		 System.out.println("the values should be from 1 to 19");
	   }
   }
	public double findAreaofRec() {
		return length*breadth;
	}  
	public double findAreaofSquare() {
		return side*side;
	}
	public static void main(String args[]) {
		Shape e1=new Shape(21);
		Shape e2=new Shape(21,5);
		System.out.println(e1.findAreaofSquare());	
		System.out.println(e2.findAreaofRec());	
	}
}
