package com.yesu.algo;

public class ReverseNumber {

	public static void main(String[] args) {
		int k  = -0;
		int r = reverse(k);
		System.out.println(r);
	}

	private static int reverse(int k) {
		int q = k >=0 ? k : -1*k;
		int r = 0;
		int val = 0;
		
		while(q > 0) {
			r = q%10;
			System.out.println("The value r is : " + r);

			q = q/10;
			System.out.println("The value q is : " + q);

			val = val*10 + r;
			System.out.println("The value is : " + val);
		}
		
		return k>0? val : -1*val;
	}
}
