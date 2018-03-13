package com.uber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
	
	public static void main(String[] args) {
		
		int h = hammingDistance(1, 4);
		System.out.println(h);
	}
	
    public static int hammingDistance(int x, int y) {
        
        List<Integer> xBits = new ArrayList<>();
        List<Integer> yBits = new ArrayList<>();
        
        getBits(x, xBits);
        getBits(y, yBits);
        
        Collections.reverse(xBits);
        Collections.reverse(yBits);

        
        List<Integer> longBits = (xBits.size() >= yBits.size() ? xBits : yBits);
        List<Integer> shortBits = (xBits.size() <  yBits.size() ? xBits : yBits);
        

        int diff = Math.abs(longBits.size() - shortBits.size());
        for(int i=0; i< diff; i++) {
        	shortBits.add(i, 0);
        }
        
        int res = 0;
        
        for(int i= 0; i < shortBits.size(); i++) {
            if(longBits.get(i) != shortBits.get(i)) {
                res++;
            }
        }
        
        return res;
        
    }
    
    private static void getBits(int x, List<Integer> list) {
        
        if(x == 0) {
            return;
        }
        list.add(x%2);
        getBits(x/2, list);
        
    }
}