package com.turing.oop.designpattern.bridge;

public class BridgeDemo {
	public static void main(String[]args)
	{
		DrawingAPI api = new SvgApi();
		Shape shape  = new Rectangle(api);
		shape.draw();
		
		shape = new Circle(api);
		shape.draw();
	}
}
