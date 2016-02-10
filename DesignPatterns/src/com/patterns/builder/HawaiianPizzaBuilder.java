package com.patterns.builder;

public class HawaiianPizzaBuilder extends PizzaBuilder {

	@Override
	public void buildDough() {
		// TODO Auto-generated method stub
		System.out.println("Adding cross dough");
		pizza.setDough("cross");
	}

	@Override
	public void buildSauce() {
		// TODO Auto-generated method stub
		System.out.println("Adding hot sauce");
		pizza.setSauce("hot");
	}

	@Override
	public void buildTopping() {
		// TODO Auto-generated method stub
		System.out.println("Adding ham+pineapple topping");
		pizza.setTopping("ham+pineapple");
	}

}
