package com.te.interface1;


public class VarArgs {


	public static void sum(int a , long length ) {
		System.out.println("Hello");
	}
	
	public static void sum(long length , int a) {
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {

		int a = 5;
		long length = 10;
		sum(5, 10l);
		sum(10l ,5);
		
	}

}
