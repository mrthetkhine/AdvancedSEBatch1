package com.turing.oop.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class ViewGroup extends UIWidget{
	List<UIWidget> children = new ArrayList<UIWidget>();
    
    public ViewGroup(String id) {
        super(id);
    }
    public void add(UIWidget child)
    {
        this.children.add(child);
    }
    
    @Override
    void paint() {
        System.out.println("Paint "+this.id);
        for(UIWidget child : this.children)
        {
            child.paint();
        }
    }
}
