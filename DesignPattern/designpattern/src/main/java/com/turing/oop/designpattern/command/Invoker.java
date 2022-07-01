package com.turing.oop.designpattern.command;

import java.util.ArrayList;

public class Invoker {
	  	ArrayList<Command> history = new ArrayList<Command>();
	    
	    public void invoke(Command command)
	    {
	        history.add(command);
	        command.execute();
	    }
	    public void undo()
	    {
	        int len = this.history.size()-1;
	        Command command = history.get( len );
	        history.remove(len);
	        System.out.println("Undo ");
	        command.execute();
	    }
}
