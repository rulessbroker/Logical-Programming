package com.bridgelabz.JUnitProblems;

import java.util.Scanner;

public class MonthlyPayment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle amount : ");
		double p = sc.nextDouble();
		System.out.println("Enter no of  years : ");
		double y = sc.nextDouble();
		System.out.println("Enter Rate of Intrest : ");
		double r = sc.nextDouble();
		monthlyPaymentExcecution(p, y, r);
	}

	public static void monthlyPaymentExcecution(double p, double y, double r) {
		double n, R;
		double payment;
		n = 12 * y;
		R = (r / 12) * 100;
		payment = (p * R) / 1 - (Math.pow((1 + R), (-n)));
		System.out.println("The payment that has to be done will be: " + payment);
	}
}
