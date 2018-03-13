package com.uber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberInEnglish {
	public static void main(String[] args) {
		
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		map.put(6, "six");
		map.put(7, "seven");
		map.put(8, "eight");
		map.put(9, "nine");
		map.put(10, "ten");
		
		map.put(11, "eleven");
		map.put(12, "twelve");
		map.put(13, "thirteen");
		map.put(14, "fourteen");
		map.put(15, "fifteen");
		map.put(16, "sixteen");
		map.put(17, "seventeen");
		map.put(18, "eighteen");
		map.put(19, "nineteen");
		map.put(20, "twenty");

		map.put(30, "thirty");
		map.put(40, "forty");
		map.put(50, "fifty");
		map.put(60, "sixty");
		map.put(70, "seventy");
		map.put(80, "eighty");
		map.put(90, "ninety");
		
		Map<Integer, String> mMap = new HashMap<>();
		mMap.put(0, "");
		mMap.put(1, "thousand ");
		mMap.put(2, "million ");
		mMap.put(3, "billion ");
		mMap.put(4, "trillion ");
		
		
		
		int k = 673999123;
		List<Integer> a = new ArrayList<>();
		StringBuilder sb = new StringBuilder();

		break3(k, a);
		for(int i=0; i < a.size(); i++) {
			if(a.get(i) > 0) {
				 sb.append(getStr(a.get(i)));
				 sb.append(" "+ mMap.get(a.size() -i -1) + " ");
			}
		}
		
		System.out.println(sb.toString());
	}

	private static void break3(int k, List<Integer> list) {
		
		if(k == 0) {
			return;
		}
		
		break3(k/1000, list);
		list.add(k%1000);
	}

	private static StringBuilder getStr(int k) {
		int hundredth = k/100;
		int tenth = (k%100)/10;
		int ones = (k%10)/1;
		int lastTwo = tenth*10 + ones;
		
		StringBuilder sb = new StringBuilder();
		if(hundredth > 0) {
			sb.append(map.get(hundredth) + " hundred");
		}
		
		if(lastTwo == 0) {
			//none
		} else if  (lastTwo <= 20) {
			sb.append (" " + map.get(lastTwo));
		} else {
			sb.append(" " + map.get(tenth*10));
			if(ones > 0) {
				sb.append(" " + map.get(ones));
			}
		}
		return sb;
	}
	
	private static final Map<Integer, String> map = new HashMap<>();

}
