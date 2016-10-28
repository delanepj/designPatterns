package com.designpatterns.builder.objects;

import com.designpatterns.builder.interfaces.Packing;

public class Bottle implements Packing {
	
	@Override
	public String pack(){
		return "Bottle";
	}
}
