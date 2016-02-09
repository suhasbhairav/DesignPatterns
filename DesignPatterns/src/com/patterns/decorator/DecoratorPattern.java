package com.patterns.decorator;

public class DecoratorPattern {

	public static void main(String[] args) {
		Shape shape = new Circle();
		shape.draw();
		
		shape = new Rectangle();
		shape.draw();
		
		Shape redShape = new RedShapeDecorator(shape);
		redShape.draw();

	}

}
