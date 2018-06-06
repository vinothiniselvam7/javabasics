package com.basic;

public class Passbyvalue {
	public static void main(String[] args) {
		Value obj=new Value();
		int d=obj.c(10, 12);
		System.out.println(d);
	}
		
	}
	class Value{
		public static int c(int a,int b) {
			int c=a+b;
			return(c);
		}
		
		
	}