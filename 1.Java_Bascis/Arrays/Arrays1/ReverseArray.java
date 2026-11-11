/* 10.Create a Java program to reverse the elements of an array of characters.  */


package com.te.arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int[] arr = new int[] {3,4,6,7,8};
		
		System.out.println("Original Array :" +Arrays.toString(arr));
		System.out.println("Reverse Array :" );
		for (int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i] +" ");
		}
	}

}


//package com.te.arrays;
//
//import java.util.Arrays;
//
//public class ReverseArray {
//	
//    public static void main(String[] args) {
//        
//        int[] arr = {3,4,65,67,6};   //reverse an array 
//        
//        int start = 0 ;
//        int end = arr.length -1;
//        
//        System.out.println("Original Array : " +Arrays.toString(arr));
//        
//        System.out.println("Reverse Array : ");
//        
//        while(start < end){
//        	
//            int temp = arr[start] ;
//           arr[start] = arr[end];
//           arr[end]  = temp;
//           start++;
//           end--;
//       
// }
//    for(int a : arr){
//       System.out.print(a + " ");
//    }
//    }
//}