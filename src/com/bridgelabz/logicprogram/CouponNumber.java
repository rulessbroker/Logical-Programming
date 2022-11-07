package com.bridgelabz.logicprogram;

import java.util.Random;

public class CouponNumber {
	   public static void main(String[] args) {
	        int winnerCouponNo = 123450;
	        int couponNumber = 0;
	        int couponCount = 0;

	        while (couponNumber != winnerCouponNo){
	            couponNumber=generateCoupon();
	            couponCount++;
	            System.out.println(couponNumber);
	        }
	        System.out.println("winner coupon : " +couponNumber);
	        System.out.println("No of coupons to match winner:" +couponCount);
	    }

	    static int generateCoupon(){
	        int num = 0;
	        Random random = new Random();
	        while (num < 100000){
	            num = random.nextInt(999999);
	        }
	        return num;
	    }

}
