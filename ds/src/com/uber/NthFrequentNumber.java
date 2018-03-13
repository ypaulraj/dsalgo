package com.uber;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class NthFrequentNumber {

	public static void main(String[] args) {
		
		int[] arr = {10, 1, 8, 3, 2, 6,3, 3,5,3 ,4,5,9,2,9,2,7,3,6,4,8,3,2,6,4,9,3,6,3,9};
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i: arr) {
			int freq = 0;
			if(map.containsKey(i)) {
				freq = map.get(i);
			}
			map.put(i, freq + 1);
		}
				
		
		PriorityQueue<Entry> heap = new PriorityQueue<>();
		
		for(Map.Entry<Integer, Integer> e: map.entrySet()) {
			
			Entry entry = new Entry();
			entry.num = e.getKey();
			entry.freq = e.getValue();
			
			heap.offer(entry);
		}
		
		int j = 0;
		
		while(j <= 1) {
			j++;
			Entry entry = heap.poll();
			System.out.println(entry.num + ", " + entry.freq);
		}
		
		System.out.println("-------------------------");
		Entry entry = heap.poll();
		System.out.println(entry.num + ", " + entry.freq);
		
		

	}
	

}

class Entry implements Comparable<Entry> {
	
	int num;
	int freq;

	@Override
	public int compareTo(Entry entry) {
		return entry.freq  - freq;
	}
	
}
