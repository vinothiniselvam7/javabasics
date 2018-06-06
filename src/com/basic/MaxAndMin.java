package com.basic;

public class MaxAndMin{
	public static void main(String[] agrs) {
		int array[]=new int[] {3,4,5,2,33,24,2};
		int max=array[0];
		int min=array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
				
				}
				
			if(array[i]<min){
				min=array[i];
				
			}
			
		}
   System.out.println("maximum value is:"+max);
   System.out.println("minimum value is "+min);
}
}
	