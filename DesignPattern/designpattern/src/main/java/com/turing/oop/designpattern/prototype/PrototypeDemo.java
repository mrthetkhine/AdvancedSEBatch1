package com.turing.oop.designpattern.prototype;

public class PrototypeDemo {
	public static void main(String[]args)
	{
		Prototype heavy = new HeavyClass();
		try {
			Prototype another = heavy.reproduce();
			
			System.out.println("Another "+another);
			System.out.println("Heavy ==another "+(heavy==another));
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
