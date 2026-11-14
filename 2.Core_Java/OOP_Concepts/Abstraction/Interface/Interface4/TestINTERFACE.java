package com.te.interface4;

public class TestINTERFACE {

	public static void main(String[] args) {

		CompleteDetailsOfINTERFACE test = new SubClassOfInterface();
		
		test.defaultMethod();
		
		test.publicMethodConcrete();
		
		CompleteDetailsOfINTERFACE.staticMethod();
		test.defaultAbstractMehtod();
		test.abstractMethod();
	}

}
