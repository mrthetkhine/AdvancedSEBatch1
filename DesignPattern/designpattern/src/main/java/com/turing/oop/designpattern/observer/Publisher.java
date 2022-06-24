package com.turing.oop.designpattern.observer;

public interface Publisher {
	 public void attach(Subscriber subscriber);
	 public void deattach(Subscriber subscriber);
	 public void change(String message);
}
