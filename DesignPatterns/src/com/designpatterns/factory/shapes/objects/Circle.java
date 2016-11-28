package com.designpattern.factory.shapes.objects;

import com.designpattern.factory.interfaces.Shape;

public class Circle implements Shape {
	@Override
	public void draw(){
		System.out.println("Inside Circle::draw() method.");
	}
}
