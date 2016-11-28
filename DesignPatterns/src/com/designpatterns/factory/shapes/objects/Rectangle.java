package com.designpattern.factory.shapes.objects;

import com.designpattern.factory.interfaces.Shape;

public class Rectangle implements Shape {
	@Override
	public void draw(){
		System.out.println("Inside Rectangle::draw() method.");
	}
}
