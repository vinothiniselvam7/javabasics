package com.basic;

public class isperfect {
 public static void main(String args[]) {
	 isperfect i1= new isperfect();
	 System.out.println(i1.number(6));
 }
 public boolean number(int number)
 {
	 int sum=0;
	 for(int i=1;i<=number/2;i++)
	 {
		 if(number%i==0)
		 {
			 sum=sum+i;
		 }}
		 if(sum==number) {
			 return true;
		 }
		 else {
			 return false;
		 
	 }
	 
 }
 
}
