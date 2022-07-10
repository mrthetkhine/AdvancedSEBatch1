package com.turing.oop.designpattern.meditator;

import java.util.ArrayList;
import java.util.List;

public class ChatMedaitorImpl implements ChatMediator{
    List<User> users = new ArrayList<User>();
    
    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(User user, String message) {
        //System.out.println("In Mediator broadcast");
        for (User u : this.users) {
            //System.out.println("User "+ u);
            if(u != user)
            {
                u.receiveMessage(message);
            }
        }
    }
    
}
