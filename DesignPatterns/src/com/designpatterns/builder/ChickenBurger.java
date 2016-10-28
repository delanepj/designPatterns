package com.designpatterns.builder;

import com.designpatterns.builder.abstractobjects.Burger;

public class ChickenBurger extends Burger {
	
	@Override
	public float price(){
		return 50.5f;
	}
	
	@Override
	public String name(){
		return "Chicken Burger";
	}
	
}
