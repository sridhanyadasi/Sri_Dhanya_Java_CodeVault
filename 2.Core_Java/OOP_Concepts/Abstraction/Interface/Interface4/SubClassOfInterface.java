package com.te.interface4;

public class SubClassOfInterface implements CompleteDetailsOfINTERFACE {

	@Override
	public void publicMethodConcrete() {

		System.out.println("Public concrete method");
	}

	@Override
	public void abstractMethod() {

		System.out.println("It's a Abstract method, So we will give implementation in child class");
	}

	@Override
	public void defaultAbstractMehtod() {

		System.out.println("It's a Default Abstract method it means we didn't use abstract keyword in this method, so by defalt jvm will provide abstract keyword");
	}

}
