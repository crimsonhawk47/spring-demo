package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {


		FortuneService theFortune = new HappyFortuneService();
		Coach theCoach = new WrestlingCoach(theFortune);

		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());

		
	}

}
