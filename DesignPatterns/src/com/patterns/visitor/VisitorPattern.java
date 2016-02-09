package com.patterns.visitor;

public class VisitorPattern {

	public static void main(String[] args) {
		ComputerPart computerPart = new Keyboard();
		computerPart.accept(new ComputerPartDisplayVisitor());
		computerPart = new Monitor();
		computerPart.accept(new ComputerPartDisplayVisitor());
		computerPart = new Mouse();
		computerPart.accept(new ComputerPartDisplayVisitor());

	}

}
