package com.patterns.proxy;

public class RealImage implements Image{

	private String filename;
	public RealImage(String filename){
		this.filename = filename;
		loadFromDisk(this.filename);
	}
	
	public void loadFromDisk(String filename){
		System.out.println("Loading .."+ filename);
	}
	@Override
	public void display() {
		System.out.println("Displaying .."+filename);
		
	}

}
