package com.bhk.cmnd.impl;

import com.bhk.business.Light;
import com.bhk.cmnd.Command;

public class LightOffCommand implements Command {
	Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		this.light.off();
	}

}
