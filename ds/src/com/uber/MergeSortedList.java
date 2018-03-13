package com.uber;

public class MergeSortedList {

	public static void main(String[] args) {
		
		int[] a = { 10, 20, 30, 40, 50, 60, 100};
		int[] b = { 1, 11, 21,22,23, 41, 50, 59, 69, 70};
		
		int length = a.length + b.length;
		
		int[] res = new int[length];
		
		int k = 0;
		
		int i = 0;
		int j = 0;
		
		while( i < a.length && j < b.length) {
			if(a[i] <= b[j]) {
				res[k++] = a[i++];
			} else if (a[i] > b[j]) {
				res[k++] = b[j++];
			}
		}

		for(; i< a.length; i++)
				res[k++] = a[i];
		
		for(; j< b.length; j++)
				res[k++] = b[j];
		
		for(int m=0; m < res.length; m++) {
			System.out.print(res[m] + "  ");
		}

	}
}
