package com.basic;

public class Mystery {
	public static void main(String agrs[])
	{
	int y;
	int x = 1;
	int total = 0;

	 while ( x <= 10 )
	 {
	 y = x * x;
	 System.out.println( y );
	 total+= y;
	 ++x;
	 } 
	 System.out.printf( "Total is %d\n", total );
	}


}
