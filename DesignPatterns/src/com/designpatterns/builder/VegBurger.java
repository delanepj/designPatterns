package com.designpatterns.builder;

import com.designpatterns.builder.abstractobjects.Burger;

public class VegBurger extends Burger {
	
	@Override
	public float price(){
		return 25.0f;
	}
	
	@Override
	public String name(){
		return "Veg Burger";
	}
	
}
