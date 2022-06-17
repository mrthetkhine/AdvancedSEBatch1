package com.turing.oop.designpattern.factorymethod;
interface Logger
{
	void log(String message);
}
class ConsoleLogger implements Logger
{
	public void log(String message)
	{
		System.out.println("Console-> "+message);
	}
}
class XMLLogger implements Logger
{
	public void log(String message)
	{
		System.out.println("XML-> "+message);
	}
}
abstract class LoggerFactory
{
	abstract Logger getLogger();
}
class ConsoleLogerFactory extends LoggerFactory
{
	public Logger getLogger()
	{
		return new ConsoleLogger();
	}
}
class XMLLogerFactory extends LoggerFactory
{
	public Logger getLogger()
	{
		return new XMLLogger();
	}
}
public class FactoryDemoWithClass {
	public static void main(String[]args)
	{
		LoggerFactory factory = new ConsoleLogerFactory();
		Logger logger = factory.getLogger();
		logger.log("Hello");
	}
}
