package com.patterns.template;

public class Cricket extends Game{

	@Override
	void init() {
		// TODO Auto-generated method stub
		System.out.println("Cricket begins...");
	}

	@Override
	void startPlay() {
		// TODO Auto-generated method stub
		System.out.println("Cricket game started..");
	}

	@Override
	void endPlay() {
		// TODO Auto-generated method stub
		System.out.println("Cricket game ended..");
	}

}
