package com.turing.oop.designpattern.meditator;

public interface ChatMediator {
	 public void addUser(User user);
	 public void sendMessage(User user,String message);
}
