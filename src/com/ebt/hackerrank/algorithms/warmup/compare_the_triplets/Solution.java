package com.ebt.hackerrank.algorithms.warmup.compare_the_triplets;

import java.util.Scanner;

public class Solution {
	static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
		int alicePoint = 0;
		int bobPoint = 0;
		if (a0 > b0)
			alicePoint++;
		else if (a0 < b0) {
			bobPoint++;
		}

		if (a1 > b1)
			alicePoint++;
		else if (a1 < b1) {
			bobPoint++;
		}

		if (a2 > b2)
			alicePoint++;
		else if (a2 < b2) {
			bobPoint++;
		}

		int[] array = new int[2];
		array[0] = alicePoint;
		array[1] = bobPoint;

		return array;
	}

	public static void main(String[] args) {
		while (true) {
			Scanner in = new Scanner(System.in);
			try {
				int a0 = in.nextInt();
				int a1 = in.nextInt();
				int a2 = in.nextInt();
				int b0 = in.nextInt();
				int b1 = in.nextInt();
				int b2 = in.nextInt();
				int[] result = solve(a0, a1, a2, b0, b1, b2);
				for (int i = 0; i < result.length; i++) {
					System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
				}
				System.out.println("");
				return;
			} catch (Exception e) {
			}
		}
	}
}
