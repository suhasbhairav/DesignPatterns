package com.patterns.builder;

public class SpicyPizzaBuilder extends PizzaBuilder {

	@Override
	public void buildDough() {
		// TODO Auto-generated method stub
		System.out.println("Adding pan baked dough");
		pizza.setDough("pan baked");
	}

	@Override
	public void buildSauce() {
		// TODO Auto-generated method stub
		System.out.println("Adding chilli sauce");
		pizza.setSauce("chilli");
	}

	@Override
	public void buildTopping() {
		// TODO Auto-generated method stub
		System.out.println("Adding pepperoni+salami topping");
		pizza.setTopping("pepperoni+salami");
	}

}
