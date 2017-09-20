package com.ebt.hackerrank.algorithms.plus_minus;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		int totalPositiveNumber = 0, totalNegativeNumber = 0, totalZeroNumber = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();

			if (arr[i] == 0) {
				totalZeroNumber++;
			} else if (arr[i] > 0) {
				totalPositiveNumber++;
			} else {
				totalNegativeNumber++;
			}
		}

		System.out.println((float) totalPositiveNumber / n);
		System.out.println((float) totalNegativeNumber / n);
		System.out.println((float) totalZeroNumber / n);
	}
}
