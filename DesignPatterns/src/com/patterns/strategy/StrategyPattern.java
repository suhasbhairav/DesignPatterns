package com.patterns.strategy;

public class StrategyPattern {

	
	public static void main(String[] args){
		Context context = new Context(new OperationAdd());
		System.out.println(context.executeStrategy(100, 200));
		
		context = new Context(new OperationSubtract());
		System.out.println(context.executeStrategy(200, 100));
		
		context = new Context(new OperationMultiply());
		System.out.println(context.executeStrategy(100, 200));
	}
}
