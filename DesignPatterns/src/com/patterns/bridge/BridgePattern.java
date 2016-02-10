package com.patterns.bridge;

public class BridgePattern {

	public static void main(String[] args){
		Shape redCircle = new Circle(new RedCircle(), 100,20, 20 );
		Shape greenCircle = new Circle(new GreenCircle(), 200,40,50);
		
		redCircle.draw();
		greenCircle.draw();
	}
}
