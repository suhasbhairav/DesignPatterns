package com.patterns.template;

public abstract class Game {

	abstract void init();
	abstract void startPlay();
	abstract void endPlay();
	
	public void templateMethodPlay(){
		init();
		startPlay();
		endPlay();
	}
}
