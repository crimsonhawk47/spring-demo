package com.luv2code.springdemo;

public class WrestlingCoach implements Coach {
	
	//Define a private field for dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public WrestlingCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "50 Squats a day";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
	
	@Override
	public String getItem() {
		return fortuneService.getItem();
	}

}
