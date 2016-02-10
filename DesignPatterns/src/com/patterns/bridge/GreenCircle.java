package com.patterns.bridge;

public class GreenCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Green Circle:"+radius+","+x+
				","+y);		
	}

}
