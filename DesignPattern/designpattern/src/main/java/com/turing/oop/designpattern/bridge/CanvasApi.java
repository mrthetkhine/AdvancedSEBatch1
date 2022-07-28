package com.turing.oop.designpattern.bridge;

public class CanvasApi implements DrawingAPI{

	@Override
	public void drawCircle() {
		System.out.println("Canvas draw Circle");
		
	}

	@Override
	public void drawRectangle() {
		System.out.println("Canvas draw Rectangle");
		
	}

}
