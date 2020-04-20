package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAppConstructorArgs {

	public static void main(String[] args) {
		
		//Load spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("constructorArgs-applicationContext.xml");
		
		//Retrieve bean from spring container

		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getItem());
		
		context.close();
	}

}
