package com.turing.oop.designpattern.meditator;

public abstract class User implements ChatClient{
 	String userName;
    ChatMediator mediator;
    
    public User(ChatMediator mediator,String userName) {
        this.mediator = mediator;
        this.userName = userName;
    }
    
    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message);
}
