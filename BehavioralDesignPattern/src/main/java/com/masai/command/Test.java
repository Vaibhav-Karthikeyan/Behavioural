package com.masai.command;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Light light=new Light();
		LightOnCommand on=new LightOnCommand(light);
		LightOffCommand off=new LightOffCommand(light);
		RemoteControl control=new RemoteControl();
		control.setCommand(on);
		control.buttonPress();
		control.setCommand(off);
		control.buttonPress();
	}

}
