package com.turing.oop.designpattern.observer;

public class Demo {
	public static void main(String[]args)
	{
		Publisher dataSource = new DataSource();
        
        View view1 = new View("View1");
        View view2 = new View("View 2");
        View view3 = new View("View 3");
        
        dataSource.attach(view1);
        dataSource.attach(view2);
        dataSource.attach(view3);
        
        dataSource.change("Change1");
        
        dataSource.deattach(view2);
        dataSource.change("Chage 2");
       
	}
}
