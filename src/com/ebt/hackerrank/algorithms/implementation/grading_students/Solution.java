package com.ebt.hackerrank.algorithms.implementation.grading_students;

import java.util.Scanner;

public class Solution {
	static int[] solve(int[] grades) {
		for (int i = 0; i < grades.length; i++) {
			int grade = grades[i];
			int complement = 5 - grade % 5;
			if (grade > 35 && (complement < 3))
				grades[i] = grade + complement;
		}
		return grades;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] grades = new int[n];
		for (int grades_i = 0; grades_i < n; grades_i++) {
			grades[grades_i] = in.nextInt();
		}
		int[] result = solve(grades);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		in.close();
	}
}
