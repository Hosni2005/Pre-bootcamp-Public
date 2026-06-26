package com.axsosacademy.coffeapp.project;

public class Main {
	public static void main(String[] args) {
		CoffeApp kisok = new CoffeApp();
	
	kisok.addMenuItem(
			"Banana" ,
			2.00
			);
	kisok.addMenuItem(
			"coffee" ,
			1.50
			);
	kisok.addMenuItem(
			"latte" ,
			4.50
			);
	kisok.addMenuItem(
			"cappuccino" ,
			3.00
			);
	kisok.addMenuItem(
			"muffin" ,
			4.00
			);
	kisok.displayMenu();
	kisok.newOrder();
}
}
