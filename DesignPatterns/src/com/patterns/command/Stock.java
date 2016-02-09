package com.patterns.command;

public class Stock {

	private String name = "Google";
	private int quantity = 10;
	
	public void buy(){
		System.out.println("Buy - "+name +":"+quantity);
		
	}
	
	public void sell(){
		System.out.println("Sell - "+name + ":"+quantity);
	}
}
