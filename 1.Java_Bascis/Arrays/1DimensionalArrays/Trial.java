package com.te.oneDarrays;

import java.util.Arrays;

public class Trial {

		public static void main(String[] args) {
			
		   int[] array1 = new int[] {4,5,6,7,8};
		   int[] array2 = new int[array1.length];
		   
//		   System.out.println("Array 1: "+Arrays.toString(array1));
//		   System.out.println("Array 2: "+Arrays.toString(array2));
//		   
//		   array2 = array1;//direct assignment
//		   array2[3] = 9;
//		   System.out.println("After Modification: "+Arrays.toString(array1)); // Shallow copy
//		   System.out.println("After Modification: "+Arrays.toString(array2));
		   
		   
		   //element by element
		   
//		   for(int i = 0;i<array1.length;i++) {
//			   
//			   array2[i]=array1[i];
//			   
//		   }
//		   
//		   System.out.println("Array 1: "+Arrays.toString(array1));
//		   System.out.println("Array 2: "+Arrays.toString(array2));
//		   
//		   array1[0] = 20;
//		   
//		   System.out.println("After Modification: "+Arrays.toString(array1)); //deep copy
//		   System.out.println("After Modification: "+Arrays.toString(array2));
		   
		
		
		//clone method
		
//		array2 = array1.clone();
	//
//		System.out.println("Array 1: "+Arrays.toString(array1));
//		System.out.println("Array 2: "+Arrays.toString(array2));
	//	
//		array2[2] = 30;
	//	
//		System.out.println("After Modification: "+Arrays.toString(array1)); //deep copy
	//  System.out.println("After Modification: "+Arrays.toString(array2));
		   
	   //copyOf method
	    
	    array2 = Arrays.copyOf(array1, array1.length);
	    
	    System.out.println("Array 1: "+Arrays.toString(array1));
		System.out.println("Array 2: "+Arrays.toString(array2));
		
		array1[4] = 10;
		
		System.out.println("After Modification: "+Arrays.toString(array1)); //deep copy
	    System.out.println("After Modification: "+Arrays.toString(array2));
				
		}			
	}


