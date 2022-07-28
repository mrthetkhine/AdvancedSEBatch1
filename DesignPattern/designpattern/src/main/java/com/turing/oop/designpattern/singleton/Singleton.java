package com.turing.oop.designpattern.singleton;

public class Singleton {

	private String instanceOne="Hello";
	private static Singleton instance;
	private Singleton()
	{
		System.out.println("Singleton created");
	}
	public synchronized static Singleton getSingleton()
	{
		
		if(instance == null)
		{
			instance = new Singleton();
		}
		return instance;
	}
	public void api()
	{
		System.out.println("Singleton API "+instanceOne);
	}
}
