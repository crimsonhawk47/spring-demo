package com.luv2code.springdemo;

public class HappyFortuneService implements FortuneService {
	
	ItemFinder itemFinder;
	
	public HappyFortuneService(ItemFinder theItemFinder) {
		itemFinder = theItemFinder;
	}

	@Override
	public String getFortune() {

		return "Today is your lucky day!";
	}
	
	@Override
	public String getItem() {
		return itemFinder.FindItem();
	}

}
