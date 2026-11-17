/*3.Create a class named student with main method
a)create three instance blocks with a display message
b)create an object to the student class and compile and run the program
Note:guess the order of execution of blocks. */


package com.te.BlocksAndPackages;

public class Student1 {

	int age;
	String name;
	{
		System.out.println("Instance Block 1"); //Instance Blocks
	}
	{
		System.out.println("Instance Block 2");
	}
	{
		System.out.println("Instance Block 3");
	}
	
	public static void main(String[] args) {
		Student1 student = new Student1();
		student.age = 10;
		student.name = "Sri";
		System.out.println(student.age+"" +student.name );
	}

}

/*Flow of Execution : 
Instance Block 1
Instance Block 2
Instance Block 3
10Sri  */
