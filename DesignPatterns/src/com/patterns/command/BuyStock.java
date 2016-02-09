package com.patterns.command;

public class BuyStock implements Order{

	private Stock googleStock;
	public BuyStock(Stock googleStock){
		this.googleStock = googleStock;
	}
	
	@Override
	public void execute() {
		googleStock.buy();
		
	}	

}
