package com.te.typepromotion;

public class TypePromotion {

	public static void main(String[] args) {
		int a = 5;
	
		long c = a; // type promotion
		float d = a;//type promotion
		double b = a;//type promotion
		
		long ab = 10l;
		//int i = ab; // type promotion will be there but it can't be depromoted
		float f = ab;
	}

}
