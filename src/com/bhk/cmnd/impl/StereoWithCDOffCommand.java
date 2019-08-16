package com.bhk.cmnd.impl;

import com.bhk.business.StereoWithCD;
import com.bhk.cmnd.Command;

public class StereoWithCDOffCommand implements Command {
	StereoWithCD stereoWithCD;
	
	public StereoWithCDOffCommand(StereoWithCD stereoWithCD) {
		this.stereoWithCD = stereoWithCD;
	}

	@Override
	public void execute() {
		this.stereoWithCD.off();
	}

}
