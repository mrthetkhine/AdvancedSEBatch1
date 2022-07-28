package com.turing.oop.designpattern.bridge;

public class Rectangle extends Shape{

	Rectangle(DrawingAPI api) {
		super(api);
	}

	@Override
	void draw() {
		this.api.drawRectangle();
	}

}
