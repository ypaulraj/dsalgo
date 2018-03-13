package com.yesu.ds;

import java.util.HashMap;
import java.util.LinkedList;



public class LRU {
	

	public static void main(String[] args) {
		LRU lru = new LRU(2);
		
		lru.put("One", 1);
		lru.put("Two", 2);
		
		System.out.println(lru.get("One"));
		System.out.println(lru.get("Two"));

		System.out.println(lru.get("Three"));
		
		lru.put("Three", 3);
		System.out.println(lru.get("Three"));
		System.out.println(lru.get("One"));

	}
	
	private HashMap<String, Integer> cache = new HashMap<>();
	LinkedList<String> list = new LinkedList<>();
	int size;
	
	public LRU(int size) {
		this.size = size;
	}
	
	public void put(String key, Integer val) {
		
		if(list.contains(key)) {
			list.remove(key);
			list.addFirst(key);
		} else {
			list.addFirst(key);
		}

		removeOldValues();
		
		cache.put(key, val);		
	}

	
	public Integer get(String key) {
		
		if(cache.containsKey(key)) {
			list.remove(key);
			list.addFirst(key);
		} 

		
		return cache.get(key);
	}
	

	private void removeOldValues() {
		if(list.size() > size) {
			String lastKey = list.getLast();
			list.removeLast();
			cache.remove(lastKey);
		}
	}
	
}
