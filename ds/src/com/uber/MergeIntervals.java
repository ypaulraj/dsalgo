package com.uber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class MergeIntervals {

	public static void main(String[] args) {

		Interval i1 = new Interval(1,4);
		Interval i2 = new Interval(0,4);
		
		List<Interval> intervals = new ArrayList<>();
		intervals.add(i1);
		intervals.add(i2);
		
		List<Interval> result = merge(intervals);
		
		
	}

	private static List<Interval> merge(List<Interval> intervals) {

		if (intervals == null || intervals.isEmpty()) {
			return Collections.EMPTY_LIST;
		}



		Collections.sort(intervals, new Comparator<Interval>() {
			public int compare(Interval i1, Interval i2) {
				return i1.start - i2.start;
			}
		});
		
		Stack<Interval> stack = new Stack<>();
		stack.push(intervals.get(0));

		for (int i = 1; i < intervals.size(); i++) {

			Interval i1 = stack.pop();
			Interval i2 = intervals.get(i);
			if (doesOverlap(i1, i2)) {
				Interval merged = mergeIntervals(i1, i2);
				stack.push(merged);
			} else {
				stack.push(i1);
				stack.push(i2);
			}

		}

		return new ArrayList<Interval>(stack);

	}

	private static boolean doesOverlap(Interval i1, Interval i2) {
		return i2.start <= i1.end;

	}

	private static Interval mergeIntervals(Interval i1, Interval i2) {
		Interval i = new Interval();
		i.start = (i1.start < i2.start) ? i1.start : i2.start;
		i.end = (i1.end > i2.end) ? i1.end : i2.end;

		return i;
	}

}

class Interval {
	int start;
	int end;

	Interval() {
		start = 0;
		end = 0;
	}

	Interval(int s, int e) {
		start = s;
		end = e;
	}
}