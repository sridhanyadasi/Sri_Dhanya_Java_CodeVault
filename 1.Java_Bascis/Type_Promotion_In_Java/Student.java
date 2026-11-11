package com.te.typepromotion;

public class Student {
     
	int id;
	String name;
	String gender;
	int className;
	
	
	public Student(int id) {
		this.id = id;
	}
		
	public Student(int id , String name) {
		//this.id = id ;
		this(id);
		this.name = name;
	}
	
	public Student(int id, String name , String gender) {
//		this.id = id ;
//		this.name = name;
		this.gender = gender;
	//	this(id,name); // constructor call must be in the first line
		
	}
	
	public Student(String name , String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public Student(int id, String name , String gender , int className) {
		this(id);
		//this(name,gender);
		this.className = className;
		
	}
}


/*

->calling same class constructor with this() and calling parent class constructor using super() is known as Constructor chaining

->constructor call must be in the first line and also will be done only once

->chaining helps in maintaining the code in organized way without duplication or repetition of code

*/