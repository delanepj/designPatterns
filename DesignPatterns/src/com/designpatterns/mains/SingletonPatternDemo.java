package com.designpattern.mains;

import com.designpattern.singleton.SingleObject;

public class SingletonPatternDemo {
	public static void main (String[] args){
		
		// Gives a compilation error.
		//SingleObject object = new SingleObject();
		
		//Get the only object available
		SingleObject object = SingleObject.getInstance();
		
		// Get Message
		object.showMessage();
	}
}
