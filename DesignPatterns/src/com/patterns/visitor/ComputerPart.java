package com.patterns.visitor;

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);

}
