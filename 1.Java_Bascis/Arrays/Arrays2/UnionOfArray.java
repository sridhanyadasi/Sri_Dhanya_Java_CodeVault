/* 18.Create a program to find the union of two arrays (i.e., all distinct elements from both arrays). 
Input: array1: [1, 2, 3, 4, 5]      
array2: [4, 5, 6, 7, 8] Output: Union of arrays: [1, 2, 3, 4, 5, 6, 7, 8]  */

package com.te.arrays1;

import java.util.Arrays;

public class UnionOfArray {

	public static void main(String[] args) {

		int[] arr1 = {1,2,3,4,5,6,9,3,4};
		int[] arr2 = {1,5,6,7,8};
		
		int count=1;
		
		//duplicate elements
		for (int i=0; i<arr1.length ; i++) {
			for (int j=i+1; j<arr1.length ; j++) {
				if (arr1[i] == arr1[j]) {
					count++;
				}
			}
		}
		
		
		int[] union = new int[(arr1.length + arr2.length)-count];
		System.out.println("count : " +count);
		
		int index = 0;
		for(int i=0; i<arr1.length; i++) {
			
			boolean duplicate = false;
			
			for(int j=0 ; j<index ; j++) {
				
				if(union[j] == arr1[i]) {
					duplicate = true;
					break;
				}
			}
				
				if(!duplicate) {
					union[index++] = arr1[i];
				}
			
		}
				
				for(int  i=0; i<arr2.length; i++) {
					
					boolean duplicate = false;
					
					for(int j=0; j<index; j++) {
						
						if(union[j] == arr2[i]) {
							duplicate = true;
							break;
						}
					}
					
					if(!duplicate){
						union[index++] = arr2[i];
					
				}
				}
				
				int[] finalUnion = Arrays.copyOf(union, index);

		        System.out.println("\nUnion of arrays: " + Arrays.toString(finalUnion));		
		

		System.out.println("\nlength of the union : "+union.length);
		//System.out.println(Arrays.toString(union));
		
		
}
}



/*for(int  i=0; i<arr1.length ; i++) {
union[i] = arr1[i];
}
for (int j=0; j<arr2.length ; j++) {

union[arr1.length +j] =arr2[j]; 
}
System.out.println("Concatenation of Two Arrays : " +Arrays.toString(union)+" " );*/