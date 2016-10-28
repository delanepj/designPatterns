package com.designpatterns.builder;

import com.designpatterns.builder.abstractobjects.ColdDrink;

public class Coke extends ColdDrink {
	
	@Override
	public float price(){
		return 30.5f;
	}
	
	@Override
	public String name(){
		return "Pepsi";
	}
	
}
