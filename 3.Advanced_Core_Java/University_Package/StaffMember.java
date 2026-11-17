/* 5. Write a Java program that illustrates the concept of package hierarchy. Create multiple
packages and classes as follows:
1. Create a package named `com.te.university`.

2. Inside the `university` package, create two sub-packages: `com.te.university.students` and
`com.te.university.staff`.
3. Inside the `com.te.university.students` package, create a class named `Student` with fields
such as `name`, `rollNumber`, and `grade`. Include appropriate methods to set and get these
fields.
4. Inside the `com.te.university.staff` package, create a class named `StaffMember` with
fields such as `name`, `employeeID`, and `position`. Include appropriate methods to set and
get these fields.
5. Finally, create a `Main` class in the com.te.university package. */


package com.te.university.staff;

public class StaffMember {
	
	String name;
	int id;
	String position;

	public StaffMember (String name, int id, String position) {
		this.name = name;
		this.id = id;
		this.position = position;
	}
	
	public void read() {
		System.out.println("Name of the employee :" +name+ "\nId of the employee :" +id+ "\nPosition of the emplloyee :" +position);
	}
	
	public static void main(String[] args) {

		StaffMember staffmem = new StaffMember("Reeta", 51, "Developer");
		staffmem.read();
		
	}

}
