package com.ebt.hackerrank.algorithms.warmup.stair_case;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int limit = n - 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(j < limit ? " " : "#");
			}
			limit--;
			System.out.println();
		}
	}
}
