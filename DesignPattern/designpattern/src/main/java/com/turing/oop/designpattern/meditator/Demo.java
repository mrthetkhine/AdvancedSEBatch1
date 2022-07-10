package com.turing.oop.designpattern.meditator;

public class Demo {
	public static void main(String[] args) {
        ChatMedaitorImpl chatMedator = new ChatMedaitorImpl();
        User user1 = new ChatUser(chatMedator, "User1");
        User user2 = new ChatUser(chatMedator, "User2");
        User user3 = new ChatUser(chatMedator, "User3");
        User user4 = new ChatUser(chatMedator, "User4");
        
        user3.sendMessage("Hi");
        
        
    }
}
