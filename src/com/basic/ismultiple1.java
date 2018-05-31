package com.basic;

public class ismultiple1 {
	
		public static void main(String args[]) {
			
					isMultiple t1=new isMultiple();
				    System.out.print(t1.isMultiple1(2,3));
				}
			public boolean  isMultiple1 (int one,int two)
			{
				return two%one==0?true:false;
			}
			
}
