/* 6. In the `Main` class, import both `Student` and `StaffMember` classes and demonstrate the
usage of these classes by creating objects and setting/retrieving their information.
Instructions: - Create packages `university`, `students`, and `staff`. - Define classes `Student`
in the `students` package and `StaffMember` in the `staff` package. - Each class should have
appropriate fields, constructors, and methods to set and get the information. - In the `Main`
class, import both `Student` and `StaffMember` classes. - Create objects of `Student` and
`StaffMember` classes, set their information, and display it.
Note: - Ensure that classes are organized in a proper package hierarchy. - Compile and run
the `Main` class to verify the output. */


package com.te.university;

import com.te.university.studnets.Student;
import com.te.university.staff.StaffMember;
public class MainClass {

	public static void main(String[] args) {

		Student student = new Student("Reeta", 51, 'A');
		student.read();
		
		StaffMember staffmem = new StaffMember("Reeta", 51, "Developer");
		staffmem.read();
	}

}
