package com.turing.oop.designpattern.iterator;

public class OurCollection implements Iterable{

    String[] strArr ;
   
    
    OurCollection(String []str)
    {
        strArr = str;
    }
    @Override
    public Iterator createIterator() {
        return new OurCollectionIterator();
    }
    class OurCollectionIterator implements Iterator
    {
        int counter =0;
        @Override
        public boolean hasNext() {
            return counter < strArr.length;
        }

        @Override
        public Object next() {
            return strArr[counter ++];
        }
    }
    
}
