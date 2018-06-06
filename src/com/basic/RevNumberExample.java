package com.basic;

public class RevNumberExample {
	public static void main(String b[]) {
		int num=3698,temp=0;
		while(num!=0) {
			temp=temp*10;
			temp=temp+(num%10);
			num=num/10;
			
			
		}
		System.out.println(temp);
	}

}
