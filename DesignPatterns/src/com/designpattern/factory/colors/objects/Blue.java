package com.designpattern.factory.colors.objects;

import com.designpattern.factory.interfaces.Color;

public class Blue implements Color {
	@Override
	public void fill(){
		System.out.println("Inside Blue::fill() method.");
	}
}
