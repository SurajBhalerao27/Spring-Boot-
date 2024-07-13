package com.anudip.springdemo;

public class Restaurant {

	HotDrink hotDrink;
	String welcomeNote;

	public Restaurant(HotDrink hotDrink) {
		super();
		this.hotDrink = hotDrink;
	}

	/*
	 * public Restaurant(HotDrink hotDrink, String welcomeNote) { super();
	 * this.hotDrink = hotDrink; this.welcomeNote = welcomeNote; }
	 */

	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}

	public void greetMessage() {
		System.out.println(welcomeNote);
	}

	public void prepareDrink() {
		hotDrink.prepareHotDrink();
	}
}
