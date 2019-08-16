package com.bhk.cmnd.impl;

import com.bhk.business.Light;
import com.bhk.cmnd.Command;

public class LightOnCommand implements Command {
	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		this.light.on();
	}

}
