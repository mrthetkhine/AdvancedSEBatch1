package com.turing.oop.designpattern.flyweight;

public class WrapperDemo {
	public static void main(String[]args)
	{
		Integer i = 128;
		Integer j = 128;
		
		System.out.println("i==j "+ (i==j));
		
		i = new Integer(127);
		j = new Integer(127);
		
		System.out.println("i==j "+ (i==j));
	}
}
