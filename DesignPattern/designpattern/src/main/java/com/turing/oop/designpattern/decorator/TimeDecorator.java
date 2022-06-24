package com.turing.oop.designpattern.decorator;

import java.util.Date;

public class TimeDecorator implements Logger{

    Logger logger;

    public TimeDecorator(Logger logger) {
        this.logger = logger;
    }
    
    
    @Override
    public String log(String msg) {
        Date date =new Date();
        return date.toString() +" "+ logger.log(msg);
    }
    
}
