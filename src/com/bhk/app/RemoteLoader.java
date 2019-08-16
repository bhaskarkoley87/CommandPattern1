package com.bhk.app;

import com.bhk.business.Light;
import com.bhk.business.StereoWithCD;
import com.bhk.cmnd.impl.LightOffCommand;
import com.bhk.cmnd.impl.LightOnCommand;
import com.bhk.cmnd.impl.StereoWithCDOffCommand;
import com.bhk.cmnd.impl.StereoWithCDOnCommand;
import com.bhk.cmnd.invoker.RemoteControl;

public class RemoteLoader {

	public static void main(String[] arg) {
		RemoteControl remote = new RemoteControl();
		
		Light livingRoomLight = new Light();
		Light kitchenRoomLight = new Light();
		StereoWithCD stereo = new StereoWithCD();
		
		LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
		
		LightOnCommand kitchenRoomLightOnCommand = new LightOnCommand(kitchenRoomLight);
		LightOffCommand kitchenRoomLightOffCommand = new LightOffCommand(kitchenRoomLight);
		
		StereoWithCDOnCommand stereoOnCommand = new StereoWithCDOnCommand(stereo);
		StereoWithCDOffCommand stereoOffCommand = new StereoWithCDOffCommand(stereo);
		
		remote.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
		remote.setCommand(1, kitchenRoomLightOnCommand, kitchenRoomLightOffCommand);
		remote.setCommand(2, stereoOnCommand, stereoOffCommand);
		
		System.out.println(remote);
		
		remote.onButtonWasPushed(0);
		remote.onButtonWasPushed(1);
		remote.onButtonWasPushed(2);
		remote.onButtonWasPushed(3);
		
		remote.offButtonWasPushed(0);
		remote.offButtonWasPushed(1);
		remote.offButtonWasPushed(2);
		remote.offButtonWasPushed(3);
		
	}
}
