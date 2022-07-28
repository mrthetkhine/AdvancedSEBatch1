package com.turing.oop.designpattern.flyweight;

public class JavaPlatform implements Platform{

    public JavaPlatform() {
        System.out.println("Create Java Platform");
    }

    
    @Override
    public void execute(Code code) {
        System.out.println("Execcute "+code.getCode()+" On Java");
    }
    
}

