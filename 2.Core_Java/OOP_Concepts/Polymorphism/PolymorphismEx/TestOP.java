package com.te.PolyMorphismEx;

public class TestOP {

	public static void main(String[] args) {


		SumOperation sumOp = new SumOperation();
	
		System.out.println("Sum of two Integers : " +sumOp.sum(2, 4));
		
		sumOp.sum(1, 2, 5);
	}
	
	

}
