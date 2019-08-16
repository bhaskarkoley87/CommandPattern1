package com.bhk.business;

public class StereoWithCD implements Electronics, SoundSystem, CDPlayer {
	public static int STEREO_STATUS = 0;
	public static int STEREO_VOLUME = 1;
	
	@Override
	public void on() {		
		this.STEREO_STATUS = 1;
		System.out.println("The StereoWithCD is on.");
	}

	@Override
	public void off() {
		this.STEREO_STATUS = 0;
		System.out.println("The StereoWithCD is off.");		
	}

	@Override
	public void setCD() {
		System.out.println("The CD is loaded.");
	}

	@Override
	public void ejectCD() {
		System.out.println("The CD is unloaded.");		
	}

	@Override
	public void setVolume(int level) {
		this.STEREO_VOLUME = level;
		System.out.println("The vloume is "+level);		
	}

	@Override
	public void volumeUp() {
		this.STEREO_VOLUME++;
		System.out.println("The vloume is "+this.STEREO_VOLUME);	
	}

	@Override
	public void volumeDown() {
		this.STEREO_VOLUME--;
		System.out.println("The vloume is "+this.STEREO_VOLUME);
	}
}
