package com.uber;

public class DotProductOfVector {

	public static void main(String[] args) {
	
		int[] v1 = { 1, 2, 3};
		int[] v2 = {10, 20, 30};
		
		int[] v3 = new int[v1.length];
		
		for(int i=0; i< v1.length; i++) {
			v3[i] = v1[i] * v2[i];
		}
		
		System.out.println(String.format("%d, %d, %d",  v3[0], v3[1], v3[2]));
	}
}
