package com.ebt.hackerrank.algorithms.implementation.apple_and_orange;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int t = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int m = in.nextInt();
		int n = in.nextInt();
		int[] apple = new int[m];
		for (int apple_i = 0; apple_i < m; apple_i++)
			apple[apple_i] = in.nextInt();

		int[] appleFallingPositions = calculateFallingPositions(apple, a);
		int[] orange = new int[n];
		for (int orange_i = 0; orange_i < n; orange_i++)
			orange[orange_i] = in.nextInt();
		int[] orangeFallingPositions = calculateFallingPositions(orange, b);

		System.out.println(calculateNumberOfFallingFruitsInTheRegion(appleFallingPositions, s, t));
		System.out.println(calculateNumberOfFallingFruitsInTheRegion(orangeFallingPositions, s, t));
		in.close();
	}

	public static int calculateNumberOfFallingFruitsInTheRegion(int[] fruits, int minRange, int maxRange) {
		int count = 0;
		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i] >= minRange && fruits[i] <= maxRange)
				count++;
		}
		return count;
	}

	public static int[] calculateFallingPositions(int[] fruitPositions, int respectiveValue) {
		int[] fallingPosition = new int[fruitPositions.length];
		for (int i = 0; i < fruitPositions.length; i++)
			fallingPosition[i] = respectiveValue + fruitPositions[i];

		return fallingPosition;
	}
}
