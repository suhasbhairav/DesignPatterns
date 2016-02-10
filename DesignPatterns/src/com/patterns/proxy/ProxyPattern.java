package com.patterns.proxy;

public class ProxyPattern {

	public static void main(String[] args){
		Image image = new ProxyImage("a.jpg");
		image.display();
		
		image.display();
	}
}
