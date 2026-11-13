/* 2. Create a class named MainMethodOverloading:
a)1st method:create a parameterized method[Ex:main(String args[])] with a
print statement.
b)2nd method:create a parameterized method[Ex:main(String args)] with a
print statement.
c)3rd method:create a parameterized method[Ex:main(String arg1,String arg2)] with a
print statement.
Note:Call 2nd and 3rd methods in 1st method
Run and observe the ouput and all methods are public */

package com.te.polymorphism;

public class MainMethodOverLoading {

	public static void main(String[] args) {

		System.out.println("1st Method");
		
		main(" 1 ");
		main(" ", " ");
		System.out.println("Sum : " +main(2 , 3));
	}
	
	public static void main(String args) {

		System.out.println("2nd Method");
	}
	
	public static void main(String arg1, String arg2) {

		System.out.println("3rd Method");
	}
	public static int main(int a ,int b) {
		
		return a+ b;
	}
	
	

}
