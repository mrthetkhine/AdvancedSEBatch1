package com.turing.oop.designpattern.memento;

public class Memento {
	String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getSavedState() {
        return this.state;
    }
}
