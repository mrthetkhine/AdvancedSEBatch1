package com.turing.oop.designpattern.iterator;

public class Demo {
	public static void main(String[] args) {
        OurCollection coll = new OurCollection(new String[]{"1","2","3","4"});
        Iterator it = coll.createIterator();
        while(it.hasNext())
        {
            System.out.println("Next "+ it.next());
        }
        
    }
}
