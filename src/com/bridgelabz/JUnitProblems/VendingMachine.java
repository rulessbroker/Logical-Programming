package com.bridgelabz.JUnitProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> noteList = new ArrayList<Integer>();

		int[] notes = new int[] { 1000, 500, 100, 50, 10, 5, 2, 1 };

		System.out.println("Enter the Change in Rs to be returned :");
		int changeAmount = scanner.nextInt();

		for (int i = 0; i < notes.length; i++) {
			while (changeAmount >= notes[i]) {
				noteList.add(notes[i]);
				changeAmount = changeAmount - notes[i];
			}
		}
		System.out.println("minimum notes required = " + noteList.size());
		System.out.println(noteList);

	}
}
