package com.masai.command;

public class RemoteControl {
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}

	public void buttonPress() {
		this.command.execute();
	}
	
}
