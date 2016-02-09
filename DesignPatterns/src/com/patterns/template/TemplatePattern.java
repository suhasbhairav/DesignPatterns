package com.patterns.template;

public class TemplatePattern {

	
	public static void main(String[] args){
		Game game = new Cricket();
		game.templateMethodPlay();
		game = new Football();
		game.templateMethodPlay();
	}
}
