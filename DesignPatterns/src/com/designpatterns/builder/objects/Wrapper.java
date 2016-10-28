package com.designpatterns.builder.objects;

import com.designpatterns.builder.interfaces.Packing;

public class Wrapper implements Packing {
	
	@Override
	public String pack(){
		return "Wrapper";
	}
}
