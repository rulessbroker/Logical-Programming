package com.bridgelabz.logicprogram;

import java.util.Scanner;

public class StopWatch {
	static double start = 0, stop = 0;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter 1 to start");
		s.next();
		startTime();
		System.out.println("enter 2 to stop");
		s.next();
		stopTime();
		elapsedTime();
	}

	static void startTime() {
		start = System.currentTimeMillis();
		System.out.println("started at " + start);
	}

	static void stopTime() {
		stop = System.currentTimeMillis();
		System.out.println("stopped at " + stop);
	}

	static void elapsedTime() {
		System.out.println("elapsed time is " + (stop - start) / 1000);
	}
}
