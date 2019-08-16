package com.bhk.business;

public class Light implements Electronics{
	public static int LIGHT_STATUS = 0;

	@Override
	public void on() {		
		this.LIGHT_STATUS = 1;
		System.out.println("The Light is on.");
	}

	@Override
	public void off() {
		this.LIGHT_STATUS = 0;
		System.out.println("The Light is off.");		
	}
	 
}
