package com.designpattern.singleton;

public class SingleObject {
	
	// Instantiate the Singleton Object
	private static SingleObject instance = new SingleObject();
	
	// Make Constructor Private so it can't be instantiated.
	private SingleObject(){}
	
	// Make Instance retrivable.
	public static SingleObject getInstance(){
		return instance;
	} // end getInstance
	
	public void showMessage(){
		System.out.println("Hello World!");
	} // end showMessage
	
}
