package com.te.polymorphism;

public class TestMath {

	public static void main(String[] args) {

		MathOperations math = new MathOperations();
		
		System.out.println("Mul of 2 integers : " +math.mul(2, 3));
	     math.mul(2, 3, 4);
		System.out.println("MUl of 4 integers : " +math.mul(2, 3, 2, 3));
	}

}
