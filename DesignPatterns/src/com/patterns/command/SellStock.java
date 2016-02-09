package com.patterns.command;

public class SellStock implements Order {

	private Stock googleStock;
	
	public SellStock(Stock googleStock){
		this.googleStock = googleStock;
	}
	
	
	@Override
	public void execute() {
		googleStock.buy();
		
	}

}
