package com.turing.oop.designpattern.meditator;

public class ChatUser extends User {
	public ChatUser(ChatMediator mediator, String userName) {
        super(mediator, userName);
        mediator.addUser(this);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("User "+this.userName+" send message to mediator "+ message);
        mediator.sendMessage(this, message);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("User "+this.userName+" receive message "+message);
        
    }

	
}
