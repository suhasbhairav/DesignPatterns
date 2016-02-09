package com.patterns.visitor;

public interface ComputerPartVisitor {
	public void visit(Keyboard keyboard);
	public void visit(Mouse mouse);
	public void visit(Monitor monitor);
}
