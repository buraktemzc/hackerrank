package com.ebt.hackerrank.algorithms.birthday_cake_candles;

import java.util.Scanner;

public class Solution {
	static int birthdayCakeCandles(int[] ar) {
		// Complete this function
		int max = 0, count = 0;
		for (int i = 0; i < ar.length; i++) {
			if (i == 0 || ar[i] > max) {
				max = ar[i];
				count = 1;
			} else if (ar[i] == max) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] heights = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			heights[ar_i] = in.nextInt();
		}
		int result = birthdayCakeCandles(heights);
		System.out.println(result);
		in.close();
	}
}
