package com.bhk.cmnd.impl;

import com.bhk.business.Light;
import com.bhk.cmnd.Command;

public class NoCommand implements Command {
	
	public NoCommand() {
		
	}

	@Override
	public void execute() {
		System.out.println("No Command.");
	}

}
