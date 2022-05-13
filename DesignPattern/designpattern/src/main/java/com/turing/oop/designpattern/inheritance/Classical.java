package com.turing.oop.designpattern.inheritance;
class Parent
{
	String parentData;
}
class Child extends Parent
{
	String childData;
}
public class Classical {
	public static void main(String[]args)
	{
		Child obj1 = new Child();
		Child obj2 = new Child();
		
		obj1.parentData = "Obj1 Parent";
		obj2.parentData = "Obj2 Parent";
		
		System.out.println("Obj1 Parent "+obj1.parentData);
		System.out.println("Obj2 Parent "+obj2.parentData);
		
	}
}
