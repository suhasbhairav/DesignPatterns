package com.patterns.adapter;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String filename) {
		//No code
		
	}

	@Override
	public void playMp4(String filename) {
		System.out.println("Playing mp4."+filename);
		
	}

}
