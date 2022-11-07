package com.bridgelabz.JUnitProblems;

import java.util.Scanner;

public class TemperaturConversion {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("choice:\n1. Celsius To Fahrenheit\n2. Fahrenheit To Celsius");
		System.out.println("Enter Choice = ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			celsiusToFahrenheit();
			break;
		case 2:
			fahrenheitToCelsius();
			break;
		default:
			System.out.println("Enter Valid Option");
		}
	}

	static void celsiusToFahrenheit() {
		System.out.println("Enter Temperature you want to convert : ");
		int tempValue = sc.nextInt();
		int conversion = (tempValue * 9 / 5) + 32;
		System.out.println("Celsius to Fahrenheit: " + conversion);

	}

	static void fahrenheitToCelsius() {
		System.out.println("Enter Temperature you want to convert : ");
		int tempValue = sc.nextInt();
		int conversion = (tempValue - 32) * 5 / 9;
		System.out.println("Fahrenheit to Celsius: " + conversion);

	}
}
