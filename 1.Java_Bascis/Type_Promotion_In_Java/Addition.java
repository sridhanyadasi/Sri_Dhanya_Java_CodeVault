package com.te.typepromotion;

public class Addition {
	
	public static void sum(int a , int b) {
		System.out.println("sum(int , int)");
		System.out.println("The addition of 2 numbers is"+(a+b));
	}
	
	public static void sum(long a , long b) {
		System.out.println("sum(long , long)");
		System.out.println("The addition of 2 numbers is"+(a+b));
	}
	
//	public static void sum(double a , double b) {
//		System.out.println("sum(double , double)");
//		System.out.println("The addition of 2 numbers is"+(a+b));
//	}
	
	public static void sum(float a , float b) {
		System.out.println("sum(float , float)");
		System.out.println("The addition of 2 numbers is"+(a+b));
	}
	
	
	public static void main(String[] args) {
	
		//sum(10,20); //promoted to (long , float , double)
		sum(10l,20l);//can't be depromoted to int	
		//sum(10.0f,20.5f);//float value will get promoted to double
         //sum(20.0,30.0);//can't be depromoted
	}

}





/*

-> Type promotion : int - long - float - double 

->type promotion will happen but no depromotion will be there

*/