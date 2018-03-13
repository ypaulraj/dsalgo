package com.uber;

public class A2I {

	public static void main(String[] args) {
		String s = "72973922";
		int num = 0;
		for(int i=0; i < s.length(); i++) {
			Character c = s.charAt(i);
			int n = c - '0';
			num = num*10 + n;
		}
		
		System.out.println(num);
	}
}
