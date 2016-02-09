package com.patterns.visitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor{

	@Override
	public void visit(Keyboard keyboard) {
		// TODO Auto-generated method stub
		System.out.println("Keyboard...");
	}

	@Override
	public void visit(Mouse mouse) {
		// TODO Auto-generated method stub
		System.out.println("Mouse...");
	}

	@Override
	public void visit(Monitor monitor) {
		// TODO Auto-generated method stub
		System.out.println("Monitor...");
	}

}
