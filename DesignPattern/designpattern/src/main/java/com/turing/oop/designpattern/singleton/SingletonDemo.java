package com.turing.oop.designpattern.singleton;

import java.awt.Toolkit;

public class SingletonDemo {
	public static void main(String args[])
	{
		Singleton singleton = Singleton.getSingleton();
		singleton.api();
		
		Singleton sing2 =  Singleton.getSingleton();
		System.out.println("Sin "+(singleton== sing2));
		sing2.api();
		
		/*
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Toolkit toolkit2 = Toolkit.getDefaultToolkit();
		
		System.out.println("Toolkit "+(toolkit==toolkit2));
		*/
	}
}
