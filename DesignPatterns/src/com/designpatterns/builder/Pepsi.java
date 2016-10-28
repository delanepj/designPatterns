package com.designpatterns.builder;

import com.designpatterns.builder.abstractobjects.ColdDrink;

public class Pepsi extends ColdDrink {
	
	@Override
	public float price(){
		return 35.0f;
	}
	
	@Override
	public String name(){
		return "Pepsi";
	}
	
}
