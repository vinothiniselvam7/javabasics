package com.basic;

public class Date {
	int day;
	int month;
	int year;
	public Date() {
		
	}
	public Date(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void DisplayDate(){
		System.out.println(month+"/"+day+"/"+year);	
	}


    public static void main(String agrs[]) {
    	Date d1=new Date();
    	d1.setDay(19);
    	d1.setMonth(10);
    	d1.setYear(1998);
    	d1.DisplayDate();
    }
}
