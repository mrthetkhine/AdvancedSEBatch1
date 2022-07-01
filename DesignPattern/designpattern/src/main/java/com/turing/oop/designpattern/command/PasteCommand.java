package com.turing.oop.designpattern.command;

public class PasteCommand implements Command{

	@Override
	public void execute() {
		System.out.println("Paste");
		
	}

}
