package com.turing.oop.designpattern.memento;

public class Originator {
	String state;
    
    public void setState(String state)
    {
        System.out.println("Originator setting state "+state);
        this.state = state;
    }
     public Memento saveToMemento() {
        System.out.println("Originator: Saving to Memento.");
        return new Memento(this.state);
    }
 
    public void restoreFromMemento(Memento memento) {
        this.state = memento.getSavedState();
        System.out.println("Originator: State after restoring from Memento: " + state);
    }
}
