package com.turing.oop.designpattern.cor;

public class DirectorPower extends PurchasePower{

    static final int ALLOW = BASE * 20;
    @Override
    void handleRequest(Command command) {
        if(command.amount <= ALLOW )
        {
            System.out.println("Sale handled by Director");
        }
        else
        {
            if(this.getSuccessor()!=null)
            {
                successor.handleRequest(command);
            }
            
        }
    }
    
}