package com.te.interface4;

public interface CompleteDetailsOfINTERFACE {
		
		private void eat() {  // how to access this method means you should call this method in public method
			System.out.println("Private Method was called...");
		}	
		
		//private void sleep() ; // we will definitely give implementation to this method
		
//		public void sleep() {   //if we give implementation to public methods means it will show error
//		                        //so definitely you should want to declare public method means it's like concrete method only
//		}
		
		public void publicMethodConcrete(); // it will accept like this // it's treated like public abstract method
		
		default void defaultMethod() {  // must and should we need to give implementation to default and static methods
			eat();  //like this we will called that private method
		System.out.println("It's a Default method");
		}
		
		static void staticMethod() {     //static void sleeep() ; if you give like his means it will show error
			System.out.println("It's a Static method");
		}
		
//		abstract void abstractMethod() {  //for abstract method there is no implementation  in interface
//			
//		}
		
		abstract void abstractMethod(); //so don't give implementation to abstract methods , because there no implementation for abstract methods

		void defaultAbstractMehtod(); // so it's a Default Abstract method , i.e., without using 
	}