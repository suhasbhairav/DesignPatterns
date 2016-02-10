package com.patterns.adapter;

public class AdapterPattern {

	public static void main(String[] args){
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "a.mp3");
		audioPlayer.play("mp4", "b.mp3");
		audioPlayer.play("vlc", "c.vlc");
		audioPlayer.play("avi", "e.avi");
	}
}
