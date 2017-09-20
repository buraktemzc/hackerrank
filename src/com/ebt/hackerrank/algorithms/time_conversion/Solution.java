package com.ebt.hackerrank.algorithms.time_conversion;

import java.util.Scanner;

public class Solution {
	static String timeConversion(String s) {
		try {
			String[] timeValues = s.split(":");
			int hours = 0, minutes = 0, seconds = 0;
			if (timeValues.length == 3) {
				hours = Integer.parseInt(timeValues[0]);
				minutes = Integer.parseInt(timeValues[1]);

				if (timeValues[2].toLowerCase().contains("am")) {
					seconds = Integer.parseInt((timeValues[2].toLowerCase().split("am"))[0]);

					if (hours == 12)
						hours = 0;
				} else if (timeValues[2].toLowerCase().contains("pm")) {
					seconds = Integer.parseInt((timeValues[2].toLowerCase().split("pm"))[0]);

					if (hours != 12)
						hours += 12;
				} else {
					return null;
				}
			} else if (timeValues.length == 2) {
				hours = Integer.parseInt(timeValues[0]);

				if (timeValues[1].toLowerCase().contains("am")) {
					minutes = Integer.parseInt((timeValues[2].toLowerCase().split("am"))[0]);

					if (hours == 12)
						hours = 0;
				} else if (timeValues[1].toLowerCase().contains("pm")) {
					minutes = Integer.parseInt((timeValues[2].toLowerCase().split("pm"))[0]);

					if (hours != 12)
						hours += 12;
				} else {
					return null;
				}
			} else if (timeValues.length == 1) {
				if (timeValues[0].toLowerCase().contains("am")) {
					hours = Integer.parseInt((timeValues[2].toLowerCase().split("am"))[0]);

					if (hours == 12)
						hours = 0;
				} else if (timeValues[0].toLowerCase().contains("pm")) {
					hours = Integer.parseInt((timeValues[2].toLowerCase().split("pm"))[0]);

					if (hours != 12)
						hours += 12;
				} else {
					return null;
				}
			}

			if (timeCheck(hours, minutes, seconds))
				return String.format("%02d:%02d:%02d", hours, minutes, seconds);
			else
				return null;
		} catch (Exception e) {
		}

		return null;
	}

	static boolean timeCheck(int hour, int minute, int second) {
		if ((hour >= 0 && hour < 24) && (minute >= 0 && minute <= 59) && (second >= 0 && second <= 59))
			return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String result = timeConversion(s);
		System.out.println(result == null ? "Time could not converted" : result);
		in.close();
	}
}
