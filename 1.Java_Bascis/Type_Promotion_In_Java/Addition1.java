package com.te.typepromotion;

public class Addition1 {

	public static void sum(int a , long b) {
		System.out.println("sum(int,long)");
		System.out.println("The sum of numbers is "+(a+b));
	}
	
	public static void sum(float a , double b) {
		System.out.println("sum(float,double)");
		System.out.println("The sum of numbers is "+(a+b));
	}
	
	public static void sum(double a , float b) {
		System.out.println("sum(double,double)");
		System.out.println("The sum of numbers is "+(a+b));
	}
	
	public static void sum(long a, float b) {
		System.out.println("sum(long,float)");
		System.out.println("sum is "+(a+b));
	}
	
	public static void main(String[] args) {
		
		//sum(10,10);
		sum(20,10l);//ambiguity
       // sum(10.0,10.0f);
	}

}
