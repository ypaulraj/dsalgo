package com.yesu.algo;

public class RecursiveIJ {

	public static void main(String[] args){
		
		recursivePrint(3, 5);
		
	}

	private static void recursivePrint(int i, int j) {
		
		if(i<= 1) {
			return;
		}
		if(j <=0) {
			return;
		}
		recursivePrint(i, --j);
		recursivePrint(--i, j);
		
	}
}
