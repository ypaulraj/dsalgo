package com.uber;

public class DivisionWithoutOper {
	public static void main(String[] args) {
		
		int a = 3;
		int b = 4;
		
		int temp = a;
		int coeff = 0;
				
		while(temp > b) {
			temp = temp - b;
			coeff = coeff + 1;
		}
		
		System.out.println(String.format("%d, %d", coeff, temp));
		
	}

}
