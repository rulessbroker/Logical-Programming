package com.bridgelabz.logicprogram;

public class PrimeNumber {
	 public static void main(String[] args) {

	        for (int i = 2; i < 50; i++) {
	            boolean isPrime = checkPrime(i);
	            if (isPrime) {
	                System.out.println(i);
	            }
	        }
	    }
	    static boolean checkPrime(int n){
	        boolean prime=true;

	        for (int i = 2; i < n; i++) {
	            if (n % i == 0) {
	                prime=false;
	                break;
	            }
	        }
	        return prime;
	    }
}
