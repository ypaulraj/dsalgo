package com.uber;

public class SecondLargest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] a = { 34, 44, 76, 22, 13, 49};
		
		int h1 = a[0] > a[1] ? a[0] : a[1];
		int h2 = a[0] > a[1] ? a[1] : a[0];
		
		for(int i = 2; i< a.length ; i++) {
			if( a[i] > h1) {
				h2 = h1;
				h1 = a[i];
			}else if(a[i] > h2) {
				h2 = a[i];
			} 
		}
		
		System.out.println(h2);
		
	}

}
