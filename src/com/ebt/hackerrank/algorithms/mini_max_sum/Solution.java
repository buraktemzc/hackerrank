package com.ebt.hackerrank.algorithms.mini_max_sum;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[5];
		int max = 0, min = 0;
		long total = 0;
		for (int i = 0; i < 5; i++) {
			arr[i] = in.nextInt();
			total += arr[i];

			if (i == 0) {
				max = arr[i];
				min = arr[i];
			} else if (arr[i] > max)
				max = arr[i];
			else if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println((total - max) + " " + (total - min));
	}
}
