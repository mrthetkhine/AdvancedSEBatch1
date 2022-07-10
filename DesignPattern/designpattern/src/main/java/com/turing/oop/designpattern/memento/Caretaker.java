package com.turing.oop.designpattern.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
	public static void main(String[] args) {
        List<Memento> savedState = new ArrayList<Memento>();
        Originator originator = new Originator();
        
        originator.setState("State1");
        originator.setState("State2");
        originator.setState("State3");
        
        savedState.add( originator.saveToMemento());
        
        originator.setState("State4");
        originator.restoreFromMemento(savedState.get(0));
        System.out.println("Oringinal State "+ originator.state);
    }
    
}
