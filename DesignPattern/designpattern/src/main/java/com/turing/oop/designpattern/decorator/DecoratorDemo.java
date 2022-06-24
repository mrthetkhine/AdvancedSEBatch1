package com.turing.oop.designpattern.decorator;

public class DecoratorDemo {
	public static void main(String[]args)
	{
		   //Logger lg = new HTMLDecorator(new TimeDecorator(new BasicLogger()));
	        Logger lg = new HTMLDecorator((new BasicLogger()));
	        String msg = lg.log("LogString");
	        System.out.println(msg);
	}
}
