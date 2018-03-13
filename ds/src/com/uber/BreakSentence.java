package com.uber;

public class BreakSentence {
	
	public static void main(String[] args) {
		
		String s = "Second interview was a coding question which was not too difficult however "
				+ "they do require writing runnable code, which seemed to work however "
				+ "they also had a suite of unit tests, and one of the tests was failing due to an edge case scenario that "
				+ "I did not take into consideration initially. I didn't have time to fix it, and seeing as "
				+ "I never heard from them I think I failed the interview. So I guess they require perfect code "
				+ "which passes all their unit tests and that describes their standards.";

		int k = 20;
		int spaceIndex = -1;
		
		for(int i=0; i < s.length(); i++) {
		
			if(s.charAt(i) == ' ') {
				spaceIndex = i;
			} 
			
			System.out.print(s.charAt(i));
			
		}
		
		
	}

}
