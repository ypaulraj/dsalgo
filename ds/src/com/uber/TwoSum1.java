package com.uber;

public class TwoSum1 {
	
	public static void main(String[] args) {
		
		int[] a = { 1, 13, 20, 30, 2, 4, 3, 8, 22, 34, 345, 22};
		int sum = 11;
		
		for(int i=0; i< a.length; i++) {
			for(int j=0; j < a.length; j++) {
				if(a[i] + a[j] == sum) {
					System.out.println(a[i] + ", " + a[j]);
					return;
				}
			}
		}
	}

}
