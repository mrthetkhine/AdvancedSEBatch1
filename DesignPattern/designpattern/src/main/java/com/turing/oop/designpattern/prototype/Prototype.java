package com.turing.oop.designpattern.prototype;

public interface Prototype extends Cloneable {
	Prototype reproduce()throws CloneNotSupportedException;
}
