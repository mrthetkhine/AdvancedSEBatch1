package com.turing.oop.designpattern.factorymethod;

public class OracleConnection implements Connection
{

	public OracleConnection()
	{
		
	}
	public void open() {
		System.out.println("Oracle connection open");
		
	}

	public void close() {
		System.out.println("Oracle connection closed");
		
	}
}