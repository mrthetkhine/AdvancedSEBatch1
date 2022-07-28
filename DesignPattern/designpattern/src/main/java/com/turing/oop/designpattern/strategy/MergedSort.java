package com.turing.oop.designpattern.strategy;

public class MergedSort implements SortStrategy{

	@Override
	public void sort() {
		System.out.println("Mergered with selection sort");
	}

}
