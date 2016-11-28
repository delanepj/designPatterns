package com.designpatterns.prototype.objects;

import com.designpatterns.prototype.abstractobjects.Shape;

public class Circle extends Shape {

	public Circle(){
		this.type = "Circle";
	}
	
	@Override
	public void draw(){
		System.out.println("Inside Circle::draw() method.");
	}
	
}
