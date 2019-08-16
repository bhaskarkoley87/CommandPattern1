package com.bhk.cmnd.impl;

import com.bhk.business.StereoWithCD;
import com.bhk.cmnd.Command;

public class StereoWithCDOnCommand implements Command {
	StereoWithCD stereoWithCD;
	
	public StereoWithCDOnCommand(StereoWithCD stereoWithCD) {
		this.stereoWithCD = stereoWithCD;
	}

	@Override
	public void execute() {
		this.stereoWithCD.on();
	}

}
