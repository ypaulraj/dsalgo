package com.uber;

import java.util.HashMap;

public class TwoSum2 {
	public static void main(String[] args) {
		
		int[] a = { 12, 323, 44, 32,344, 233, 4433, 333, 3344, 333,3, 34};
		int sum = 336;
		
		HashMap<Integer, Integer> map = new HashMap();
		
		for(int i=0; i< a.length; i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+ 1);
			} else {
				map.put(a[i], 1);
			}
		}
		
		for(int i=0; i< a.length; i++) {
			if(map.containsKey(sum - a[i])) {
				int count = map.get(sum - a[i]);
				if((count > 1 && a[i] == sum- a[i]) || count > 0 ) {
					System.out.println(a[i] + ", " +  (sum - a[i]));
					return;
				}
			}
		}
		
	}

}
