package com.turing.oop.designpattern.command;

public class CommandDemo {
	public static void main(String[]args)
	{
		Invoker invoker = new Invoker();
		Command copy = new CopyCommand();
		invoker.invoke(copy);
		
		Command edit = new EditCommand();
		invoker.invoke(edit);
		
		Command paste = new PasteCommand();
		invoker.invoke(paste);
		
		invoker.undo();
	}
}
