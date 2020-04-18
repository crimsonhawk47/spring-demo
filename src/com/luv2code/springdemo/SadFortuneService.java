package com.luv2code.springdemo;

public class SadFortuneService implements FortuneService {
	
	ItemFinder itemFinder;
	
	public SadFortuneService(ItemFinder theItemFinder) {
		this.itemFinder = theItemFinder;
	}

	@Override
	public String getFortune() {
		return "What a bad day for you!";
	}

	@Override
	public String getItem() {
		return itemFinder.FindItem();
	}

}
