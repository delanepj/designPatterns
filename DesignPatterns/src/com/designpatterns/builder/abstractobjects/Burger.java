package com.designpatterns.builder.abstractobjects;

import com.designpatterns.builder.interfaces.*;
import com.designpatterns.builder.objects.Wrapper;

public abstract class Burger implements Item {

	@Override
	public Packing packing(){
		return new Wrapper();
	}
	@Override
	public abstract float price();
}
