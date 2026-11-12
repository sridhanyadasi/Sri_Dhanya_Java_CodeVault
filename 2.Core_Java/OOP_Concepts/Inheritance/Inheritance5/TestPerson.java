package com.te.inheritance4;

public class TestPerson {
	
public static void main(String[] args) {
   Manager manager = new Manager("Satya", 30, "Female", "HR", 70000);
   manager.calculateBonus(0.1);
   System.out.println("Manager Details:");
   manager.display();

   System.out.println();

   Worker worker = new Worker("Bobby", 30, "Male", 40000, 10);
   worker.calculateOvertimePay(200);
   System.out.println("Worker Details:");
   worker.display();
}
}

