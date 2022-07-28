package com.turing.oop.designpattern.jdkproxy;

import java.lang.reflect.Proxy;
public class JDKProxyDemo {
	 public static void main(String[] args) {
	        BusinessLogic foo = (BusinessLogic)Proxy.newProxyInstance(JDKProxyDemo.class.getClassLoader(),
	                                         new Class[] { BusinessLogic.class },new MyDynamicProxy(new SaleBusiness()));
	        foo.doAction();
	        foo.anotherAction();
	    }
}
