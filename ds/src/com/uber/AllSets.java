package com.uber;

public abstract class AllSets {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };

		int n = 1 << a.length;
		for (int i = 0; i < n; i++) {
			System.out.print("{");

			for (int j = 0; j < n; j++) 
				if ((i & (1 << j)) > 0)
					System.out.print(a[j] + " ");

			System.out.println("}");
		}
	}

}
