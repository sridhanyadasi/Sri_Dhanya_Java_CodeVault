/* 7.Write a Java program that defines a method to take an integer array as a parameter and returns the 
sum of all elements in the array. Then, call this method from the main method with an array of 
integers {1, 2, 3, 4, 5}.  */


package com.te.arrays;


public class SumOfElements {
	
	int sum =0;

	public  int  add(int[] arr) {
		for (int i=0 ; i<5 ; i++) {
			sum += arr[i];
		}
		return sum;
	}	


public static void main(String[] args) {

	SumOfElements Sum = new SumOfElements();
	
	int[] arr = {1,2,3,4,5};
	
	System.out.println("Sum of elements in an Array : " +Sum.add(arr));
}

}

//public class SumOfElements {	
//	int sum = 0;	
//	int[] arr = new int[] {1,2,3,4,5} 	
//	for (int i=0 ; i< 5 ; i++) {
//		 sum += arr[i];
//	}
//}
