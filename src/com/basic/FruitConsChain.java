package com.basic;

public class FruitConsChain {


	
		public FruitConsChain(){ 
			this(2);
	System.out.println("empty cons");
	}
		
		public   FruitConsChain(int price){
			   this(2,"sweet");
				System.out.println("one arg cons");
			}
		
		
		public  FruitConsChain(int i,String taste){
			this(5,"sour","yellow");
			System.out.println("two arg cons");
			}
		
		
		
		public  FruitConsChain(int i,String taste,String color){
			
			System.out.println("three arg cons");
			}

		
			
		public static void main(String a[]) {
			 FruitConsChain one=new  FruitConsChain();
		}
			
			
				
	}
		


