package com.designpatterns.builder.abstractobjects;

import com.designpatterns.builder.interfaces.Item;
import com.designpatterns.builder.interfaces.Packing;
import com.designpatterns.builder.objects.Bottle;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing(){
		return new Bottle();
	}
	@Override
	public abstract float price();
}
