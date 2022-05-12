package com.turing.oop.designpattern.interfacedemo;
interface Flyable
{
	void fly();
}
class Bird implements Flyable
{
	public void fly()
	{
		System.out.println("Bird fly");
	}
}
class Aeroplane implements Flyable
{
	public void fly()
	{
		System.out.println("Aeroplane fly");
	}
}
public class InterfaceDemo {
	public static void main(String[]args)
	{
		Flyable flyable = new Bird();
		flyable.fly();
		
		flyable = new Aeroplane();
		flyable.fly();
	}
}
