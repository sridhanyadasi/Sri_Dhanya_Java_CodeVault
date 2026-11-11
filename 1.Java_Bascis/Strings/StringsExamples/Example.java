package com.te.strings;

public class Example {

	    public static void main(String[] args) {
	        String s1 = "Hello";
	        String s2 = "World";
	        int count =0;
		    String rev = " ";

	       String result = " ";
	       String result1 = " ";


//	        for (int i = 0; i < s1.length(); i++) {
//	            result += s1.charAt(i);
//	        }
//	        for (int i = 0; i < s2.length(); i++) {
//	            result += s2.charAt(i);
//	        }

		    //concatenation of two strings : 
	        System.out.println("Concatenated String: " + s1 +s2);
	        
	        //String length count :
	        for(int i=0 ; i< s1.length();i++) {
	        	count++;
	        	System.out.println(count);
	        }
	        
	        //Character at index :
	        System.out.println("character at index : " +s1.charAt(4));
        	System.out.println("count of a string : "+count);

        	// Reverse of a string : 
        	for(int i=s1.length() -1 ;i>=0;i--) {
        		rev  += s1.charAt(i);
        		//System.out.println(rev);	
        	}
    		System.out.println("Reverse of a string : " +rev);

    		//Lower case
    		
    		for(int i=0 ; i<s1.length(); i++) {
    			
    			char ch = s1.charAt(i);
    			
    			if(ch >= 'A' && ch <= 'Z') {
    			
    				result += (char) (ch +32);
    			}else {
    				result += ch;
    			}
    		}
    		System.out.println("Convert string into lower case : " +result);
    		
    		
    		//Upper case
    		for(int i=0 ; i<s1.length(); i++) {
    			char ch = s1.charAt(i);
    			
    			if(ch >= 'a' && ch <= 'z') {
    				result1 += (char) (ch-32);
    			}else {
    				result1 += ch;
    			}
    		}
    		System.out.println("Convert string into Upper case : " +result1);
	    }
	}


