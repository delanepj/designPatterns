package com.designpattern.factory.colors.objects;

import com.designpattern.factory.interfaces.Color;

public class Red implements Color {
	@Override
	public void fill(){
		System.out.println("Inside Red::fill() method.");
	}
}
