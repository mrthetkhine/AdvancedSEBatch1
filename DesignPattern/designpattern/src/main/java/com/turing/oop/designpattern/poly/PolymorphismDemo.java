package com.turing.oop.designpattern.poly;

public class PolymorphismDemo {
	public static void main(String[]args)
	{
		Human h = new Doctor();
		h.work();
		
		h = new Teacher();
		h.work();
	}
}
