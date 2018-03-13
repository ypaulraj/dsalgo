package com.uber;

public class IntervalInterSection {
	
	public static void main(String[] args) {
		
		int[] a = { 1, 3};
		int[] b = { 5, 4};
		
		
		if(a[0] < b[1] && a[1] > b[0]) {
			System.out.println("intersect");
		} else {
			System.out.println("does not intersect");
		}
	}

}
