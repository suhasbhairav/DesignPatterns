package com.patterns.builder;

public class BuilderPattern {

	public static void main(String[] args){
		Waiter waiter = new Waiter();
		PizzaBuilder pizzaBuilder = new HawaiianPizzaBuilder();
		waiter.setPizzaBuilder(pizzaBuilder);
		waiter.constructPizza();
		Pizza pizza = waiter.getPizza();
	}
}
