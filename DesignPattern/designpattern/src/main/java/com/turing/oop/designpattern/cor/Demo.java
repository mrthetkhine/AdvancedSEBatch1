package com.turing.oop.designpattern.cor;

public class Demo {
	 public static void main(String[] args) {
	        
	        PurchasePower manager = new ManagerPower();
	        PurchasePower director = new DirectorPower();
	        PurchasePower vice = new VicePresident();
	        
	        manager.setSuccessor(director);
	        director.setSuccessor(vice);
	        Command command = new Command(10);
	        
	        manager.handleRequest(command);
	        manager.handleRequest(new Command(1020));
	        manager.handleRequest(new Command(200));
	        manager.handleRequest(new Command(600));
	    }
}
