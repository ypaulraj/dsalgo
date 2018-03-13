package com.yesu.sorting;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int[] a = { 22, 2, 12, 2, 1, 12,3334, 22,1,23,4,5,2, 6,5,4,33};
		
		for(int i=0; i< a.length ; i++)
			for(int j=i; j< a.length; j++) {
				if(a[i] > a[j]) {
					int temp = 0;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		
		
		for(int k= 0; k < a.length; k++) {
			System.out.print(a[k] + "  ");
		}
	}

}
