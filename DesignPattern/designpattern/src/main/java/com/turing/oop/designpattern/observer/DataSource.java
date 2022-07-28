package com.turing.oop.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class DataSource implements Publisher {

    List<Subscriber> subscriberList = new ArrayList<Subscriber>();
    
    @Override
    public void attach(Subscriber subscriber) {
        
        subscriberList.add(subscriber);
    }

    @Override
    public void change(String message) {
        System.out.println("Publisher Change "+message);
        for(Subscriber sub : subscriberList)
        {
            sub.update(message);
        }
    }

	@Override
	public void deattach(Subscriber subscriber) {
		this.subscriberList.remove(subscriber);
		
	}
    
}
