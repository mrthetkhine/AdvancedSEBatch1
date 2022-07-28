package com.turing.oop.designpattern.cor;

public class VicePresident extends PurchasePower{

    static final int ALLOW = BASE * 30;
    @Override
    void handleRequest(Command command) {
        
        System.out.println("Sale handled by Vice President");
        
    }
    
}

