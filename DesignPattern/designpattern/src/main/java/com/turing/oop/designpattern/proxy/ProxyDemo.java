package com.turing.oop.designpattern.proxy;

public class ProxyDemo {
	  public static void main(String[] args) throws Exception {
	        CommandExecutor command = new CommandExecutorProxy("admin", "admin");
	        command.runCommand("notepad.exe");
	        
	        command = new CommandExecutorProxy("admin", "admin1");
	        command.runCommand("rm");
	        
	    }
}
