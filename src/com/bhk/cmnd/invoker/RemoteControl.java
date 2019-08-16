package com.bhk.cmnd.invoker;

import com.bhk.cmnd.Command;
import com.bhk.cmnd.impl.NoCommand;

public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		
		Command noCommand = new NoCommand();
		for(int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		this.onCommands[slot] = onCommand;
		this.offCommands[slot] = offCommand;		
	}
	
	public void onButtonWasPushed(int slot) {
		this.onCommands[slot].execute();
	}
	
	public void offButtonWasPushed(int slot) {
		this.offCommands[slot].execute();
	}
	
	public String toString() {
		StringBuffer strBufr = new StringBuffer();
		strBufr.append("\n---------------------------- Remote Control ----------------\n");
		for(int i = 0; i < onCommands.length ; i++) {
			strBufr.append("[slot "+i+"] "+ onCommands[i].getClass().getName()+ "   " + offCommands[i].getClass().getName()+"\n");
		}
		return strBufr.toString();
	}

}
