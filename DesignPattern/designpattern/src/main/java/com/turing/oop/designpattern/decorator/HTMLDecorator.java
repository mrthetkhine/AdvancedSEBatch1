package com.turing.oop.designpattern.decorator;

public class HTMLDecorator implements Logger{

    Logger logger;

    public HTMLDecorator(Logger logger) {
        this.logger = logger;
    }
    
    @Override
    public String log(String msg) {
        return "<html>"+ logger.log(msg) +"</html>";
    }
    
}