package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {

		ItemFinder theQuarterFinder = new QuarterItemFinder();
		FortuneService theFortune = new HappyFortuneService(theQuarterFinder);
		Coach theCoach = new WrestlingCoach(theFortune);

		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getItem());

		
	}

}
