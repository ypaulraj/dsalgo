package com.yesu.ds;

import java.util.PriorityQueue;
public class Priorities {
	
	public static void main(String[] args) {
		
		PriorityQueue todo = new PriorityQueue();
		todo.add("dishes");
		todo.add("laundry");
		todo.add("bills");
		todo.add("bills");
		
		System.out.print(todo.size() + "  " + todo.poll());
		System.out.print("  " + todo.peek() + "  " + todo.poll());
		System.out.print("  " + todo.poll() + "  " + todo.poll());

		
	}

}
