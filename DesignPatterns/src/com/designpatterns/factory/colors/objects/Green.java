package com.designpattern.factory.colors.objects;

import com.designpattern.factory.interfaces.Color;

public class Green implements Color {
	@Override
	public void fill(){
		System.out.println("Inside Green::fill() method.");
	}
}
