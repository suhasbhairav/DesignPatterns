package com.patterns.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String filename) {
		System.out.println("Playing vlc."+filename);
		
	}

	@Override
	public void playMp4(String filename) {
		//No code
		
	}

}
