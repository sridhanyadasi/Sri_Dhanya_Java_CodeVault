/* 2.Create a class named student with main method
a)create three static blocks with a display message
b)compile and run the program and observe the ouput
Note:guess the order of execution of blocks. */


package com.te.BlocksAndPackages;

public class Student {

	int rollNum; 
	String name;
	
	static {          //Static Blocks
		System.out.println("First Static block");
	}
	static {
		System.out.println("Second Static block");
	}
	static {
		System.out.println("Third Static block");
	}
	public static void main(String[] args) {
		
		Student student = new Student();
		
        student.rollNum = 33;
        student.name = "Candy";
        System.out.println(student.rollNum+" "+ student.name);

	}

}

/*
 *  Flow of Execution : 
 First Static block
Second Static block
Third Static block
33 Candy
*/
