package com.yesu.algo;
import java.util.ArrayList;
import java.util.List;

class Solution {
	
	static String firstRow = "QWERTYUIOP";
	static String secondRow = "ASDFGHJKL";
	static String thirdRow = "ZXCVBNM";

    public static boolean doesContain(String word, String row) {
            for(int i=0; i< word.length(); i++ ) {
                if(row.indexOf(word.charAt(i)) >=0) {
                    continue;
                } else {
                    return false;
                }
            }
        return true;        
    }
    
    public String[] findWords(String[] words) {
        List<String> list = new ArrayList();
    
        for(String word: words) {
            if(doesContain(word, firstRow) || doesContain(word, secondRow) || doesContain(word, thirdRow)) {
                list.add(word);
            }
        }
        
        return list.toArray(new String[0]);
    }
    
    public static void main(String[] args) {
    	Solution sol = new Solution();
    	String[] words = {"QWR", "YESU"};
    	String[] res = sol.findWords(words);
    	System.out.println(res);
    }
}