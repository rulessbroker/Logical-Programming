package com.bridgelabz.JUnitProblems;

import java.util.Scanner;

public class DayOfWeek {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the month: ");
		int m = scan.nextInt();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter date: ");
		int d = sc.nextInt();
		Scanner sn = new Scanner(System.in);
		System.out.print("Enter The Year: ");
		int y = sn.nextInt();
		inmplementedDayofweek(m, d, y);

	}

	public static void inmplementedDayofweek(int m, int d, int y) {
		int tempY, tempM, tempD, x;
		tempY = y - (14 - m) / 12;
		x = tempY + tempY / 4 - tempY / 100 + tempY / 400;
		tempM = m + 12 * ((14 - m) / 12) - 2;
		tempD = (d + x + 31 * tempM / 12) % 7;
		System.out.println("Day of the week is ->" + tempD + "\nSunday = 0\nMonday = 1\nTuesday = 2\nWednesday = 3\n"
				+ "Thursday = 4\nFriday = 5\nSaturday = 6");
	}
}
