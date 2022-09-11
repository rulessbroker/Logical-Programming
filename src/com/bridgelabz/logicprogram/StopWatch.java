package com.bridgelabz.logicprogram;

public class StopWatch {
	 public static void main(String[] args) throws InterruptedException {
	        long startTime, endTime, elapsedTime;

	        startTime = System.currentTimeMillis();
	        System.out.println("start time : "+startTime);

	        Thread.sleep(3000);

	        endTime = System.currentTimeMillis();
	        System.out.println("end time : "+endTime);

	        elapsedTime = endTime - startTime;
	        System.out.println("elapsed time = "+elapsedTime);
	    }
}
