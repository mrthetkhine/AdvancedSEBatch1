package com.turing.oop.designpattern.cor;

abstract class PurchasePower {
	   static final int BASE = 10;
	   
	   PurchasePower successor;
	   
	   abstract void handleRequest(Command command);

	    public PurchasePower getSuccessor() {
	        return successor;
	    }

	    public void setSuccessor(PurchasePower successor) {
	        this.successor = successor;
	    }
	   
	}