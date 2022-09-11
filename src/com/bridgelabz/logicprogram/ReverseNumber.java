package com.bridgelabz.logicprogram;

import java.util.Scanner;

public class ReverseNumber {
	 public static void main(String[] args) {
	        int num1;

	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter number : ");
	        num1 = scanner.nextInt();

	        System.out.println("Reverse number : "+getRevNumber(num1));
	    }

	    static int getRevNumber(int x){
	        int rev = 0;
	        while(x > 0){
	            int remainder = x % 10;
	            rev = rev * 10 + remainder;
	            x = x / 10;
	        }
	        return rev;
	    }

}
