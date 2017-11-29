package com.java.designpattern.adaptor;
/**
 * 
 */

/**
 * @author chowdappa.m
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		AdvanceMediaPlayer adopter = new MediaAdopter();
		adopter.sendToPlayer("mp4");
		adopter.sendToPlayer("vlc");

	}

}

interface MediaPlayer {

	void play();

}

class VLCPlayer implements MediaPlayer {

	@Override
	public void play() {
		System.out.println("vlc player");
	}

}

class MP4Player implements MediaPlayer {

	@Override
	public void play() {
		System.out.println("MP4 Player");
	}

}

interface AdvanceMediaPlayer {

	void sendToPlayer(String type);

}

class MediaAdopter implements AdvanceMediaPlayer {
	private MediaPlayer mediaPlayer;


	@Override
	public void sendToPlayer(String type) {
		if (type.equals("vlc")) {
			mediaPlayer = new VLCPlayer();
		} else {
			mediaPlayer = new MP4Player();
		}

		mediaPlayer.play();
	}

}