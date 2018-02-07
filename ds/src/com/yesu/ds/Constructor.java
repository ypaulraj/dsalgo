package com.yesu.ds;

public class Constructor {
	
	static String str;
	public void Constuctor() {
		System.out.println("In Constructor");
		str = "Hello World";
	}
	
	public static void main(String[] args) {
		Constructor c = new Constructor();
		System.out.println(str);
	}

}
