package com.uber;

public class MaxContiguosSubArray {
	
	public static void main(String[] args) {
		
		int a[] = {-2,1,-3,4,-1,2,1,-5,4};
		
		int lastStartIndex =0;
		int lastEndIndex = 0;

		int startIndex =0;
		int endIndex = 0;
		
		int max = 0;
		int lastMax = Integer.MIN_VALUE;
		for(int i=0; i< a.length; i++) {
			
			if(max < 0) {
				max = 0;
				startIndex = i;
				endIndex = i;
				
			}
			else if(max > max + a[i] ) {
				max = max + a[i];
				endIndex = endIndex + 1;
			} else {
				if(lastMax < max ) {
					lastMax = max;
					lastStartIndex = startIndex;
					lastEndIndex = endIndex;
				}
				max = 0;
				startIndex = i;
				endIndex = i;
				
			}
		}
		
		if(max > lastMax) {
			lastMax = max;
			lastStartIndex = startIndex;
			lastEndIndex = endIndex;
		}
		
		System.out.println(String.format("%d, %d, %d", lastMax, lastStartIndex, lastEndIndex));
	}

}
