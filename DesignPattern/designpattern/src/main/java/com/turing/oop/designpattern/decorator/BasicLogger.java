package com.turing.oop.designpattern.decorator;

public class BasicLogger implements Logger{

	@Override
	public String log(String msg) {
		return msg;
	}

}
