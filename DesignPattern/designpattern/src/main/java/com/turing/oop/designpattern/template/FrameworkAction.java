package com.turing.oop.designpattern.template;

public abstract class FrameworkAction {
	private void auth()
    {
        System.out.println("Authentication");
    }
    private void logging()
    {
        System.out.println("Logging");
    }
    protected abstract void businessLogic();
    
    public final void process()
    {
        this.auth();
        this.businessLogic();
        this.logging();
    }
}
