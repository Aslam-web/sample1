package com;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int[] inputArray = new int[n];
		for (int i = 0; i < n; i++) {
			inputArray[i] = s.nextInt();
		}
		int d = s.nextInt();

		int[] outputArray = new int[n];
		for (int i = 0; i < outputArray.length; i++) {
			if (i < d) {
				outputArray[n + i - d] = inputArray[i];
			} else {
				outputArray[i - d] = inputArray[i];
			}
		}

		System.out.print("{");
		for (int i = 0; i < n-1; i++) {
			System.out.print(i+",");
		}
		System.out.print(outputArray[n-1]+"}");
		
		s.close();
	}
}
