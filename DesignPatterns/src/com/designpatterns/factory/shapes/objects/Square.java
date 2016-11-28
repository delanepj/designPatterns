package com.designpattern.factory.shapes.objects;

import com.designpattern.factory.interfaces.Shape;

public class Square implements Shape {
	@Override
	public void draw(){
		System.out.println("Inside Square::draw() method.");
	}
}
