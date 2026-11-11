/*  Dynamic Insert and Delete Menu
Create a menu-driven program for:
Inserting element at a given index
Deleting element at a given index
Displaying current array */

package com.te.oneDArrays1;

import java.util.Arrays;
import java.util.Scanner;

public class DynamicInsertAndDel {

	public static int[] inserting(int[] arr , int index , int element) {
		
		int[] newArr = new int[arr.length+1];
		
		for (int i=0; i<arr.length ; i++) {
			newArr[i] = arr[i];
		}
		
		newArr[index] = element;
		
		for (int i=index ; i<arr.length ; i++) {
			newArr[i+1]  = arr[i];
		}
		return newArr;
	}
	
	public static int[] deleting(int[] arr , int index , int element) {
		
		int[] newArr = new int[arr.length - 1];
		
		for (int i=0; i<index ; i++) {
			newArr[i] = arr[i];
		}
		
		newArr[index] = element;
		
		for (int i=index; i<newArr.length ; i++) {
			newArr[i] = arr[i+1];
		}
		
		return newArr;
	}
	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter size of an array : ");
		int size = scan.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter array of elemnts :");

		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}

		for (int i = 0; i < size; i++) {
			System.out.print(" " + arr[i]);
		}
		 while(true) {
		  System.out.println("Select below options :");
		  System.out.println(" 1. Inserting an element ");
		  System.out.println(" 2. Deleting an Element ");
		  System.out.println(" 3. Print an Elelment "); 
		  System.out.println(" 4. Exit");
		  
		  int choose = scan.nextInt();
		  
		  switch(choose) {
		  
		  case 1:
		  {
			  System.out.println("Enter an inserting element :");
			  int element = scan.nextInt();
			  
			  System.out.println("Enter an inserting index : ");
			  int index = scan.nextInt();
			  
			  if (index > 0 || index <arr.length) {
				  System.out.println("Invalid index was Entered!");
			  }
			  else {
				  arr = inserting(arr, index, element);
			  }
		  }
		  case 2:
		  {
			  System.out.println("Enter an deleting Element :");
			  int element = scan.nextInt();
			  
			  System.out.println("Enter an deleting index : ");
			  int index = scan.nextInt();
			  
			  if (index > 0 || index < arr.length) {
				  System.out.println("Invalid index");
			  }
			  else {
				  arr = deleting(arr, index, element);
			  }
		  }
		  
		  case 3 :
			  System.out.println("Printing the elements : " +Arrays.toString(arr));
		  
		  case 4 :
			  System.out.println("Your are entered invalid index so, you are exit from the menu ");
		  
		  
		  }	 
	}


	}
}
