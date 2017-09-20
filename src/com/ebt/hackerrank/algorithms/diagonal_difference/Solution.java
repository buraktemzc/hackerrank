package com.ebt.hackerrank.algorithms.diagonal_difference;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[][] = new int[n][n];
		int primaryDiagonal = 0, secondaryDiagonal = 0, limit = n - 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = in.nextInt();
				if (i == j)
					primaryDiagonal += a[i][j];

				if (i + j == limit) {
					secondaryDiagonal += a[i][j];
				}
			}
		}
		System.out.println(Math.abs(primaryDiagonal - secondaryDiagonal));
	}
}
