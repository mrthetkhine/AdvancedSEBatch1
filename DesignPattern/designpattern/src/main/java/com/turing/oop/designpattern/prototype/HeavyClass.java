package com.turing.oop.designpattern.prototype;

public class HeavyClass implements Prototype {
	
	 	String propertyGetFromDB;
	    String computationalHungryProperty;

	   

	    static String getPropertyFromDB()
	    {
	    	System.out.println("Call DB");
	        return "PropertyFromDb";
	    }
	    static String getCompuationalHungryProperty()
	    {
	    	System.out.println("Compute heavy");
	        return "ComputationHungryProperty";
	    }
	    public HeavyClass() {
	        this.propertyGetFromDB = HeavyClass.getPropertyFromDB();
	        this.computationalHungryProperty = HeavyClass.getCompuationalHungryProperty();
	    }

	    
	public Prototype reproduce() throws CloneNotSupportedException
	{
		return (Prototype) (super.clone());
	}
	@Override
	public String toString() {
		return "HeavyClass [propertyGetFromDB=" + propertyGetFromDB + ", computationalHungryProperty="
				+ computationalHungryProperty + "]";
	}
	
}
