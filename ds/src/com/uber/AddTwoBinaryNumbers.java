package com.uber;

public class AddTwoBinaryNumbers {
	
	public static void main(String[] args) {
		
		String s1 = "10101";
		String s2 = "10111";
		
		System.out.println(Integer.parseInt(s1,2 ));
		System.out.println(Integer.parseInt(s2,2 ));
		
		System.out.println(Integer.parseInt(s1,2) + Integer.parseInt(s2,2));		
		
		int carry = 0;
		int localSum = 0;
		String result = "";
		for(int i=s1.length()-1; i >= 0; i--) {
			localSum = getInt(s1.charAt(i)) + getInt(s2.charAt(i)) + carry;
			int remainder =  (localSum % 2);
			result = "" + remainder  + result; 
			carry = (int) Math.floor(localSum/2);	
		}
		
		result = "" + carry + "" +  result;
		System.out.println(result);
		
		System.out.println(Integer.parseInt(result, 2));
		
		
	}
	
	public static int getInt(Character c) {
		if(c.equals('0')) {
			return 0;
		} else if (c.equals('1')) {
			return 1;
		} else 
			throw new RuntimeException("Input must be either '0' or '1' ");
	}

}
