package com.turing.oop.designpattern.poly;
abstract class Gateway
{
	public abstract void process();
}
class KBZGateway extends Gateway
{

	@Override
	public void process() {
		System.out.println("KBZ Gateway");
	}
}
class YomaGateway extends Gateway
{

	@Override
	public void process() {
		System.out.println("Yoma Gateway");
	}
}
public class GatewayDemo {
	public static void main(String[]args)
	{
		Gateway gateway = new KBZGateway();
		gateway.process();
		
		gateway = new YomaGateway();
		gateway.process();
	}
}
