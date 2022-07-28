package com.turing.oop.designpattern.flyweight;

public class DotNetPlatform implements Platform{

    public DotNetPlatform() {
        System.out.println("Create .net platform");
    }

    
    @Override
    public void execute(Code code) {
        System.out.println("Execute Code "+code.getCode()+" on DotNet ");
    }
    
}