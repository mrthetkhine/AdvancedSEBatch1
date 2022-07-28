package com.turing.oop.designpattern.observer;

public class View implements Subscriber{

    String viewName;

    public View(String viewName) {
        this.viewName = viewName;
    }
    
    
    @Override
    public void update(String message) {
        System.out.println("View "+viewName+" Update to "+message);
    }
    
}