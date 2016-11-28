package com.designpatterns.prototype.objects;

import com.designpatterns.prototype.abstractobjects.Shape;

public class Rectangle extends Shape {

	public Rectangle(){
		this.type = "Rectangle";
	}
	
	@Override
	public void draw(){
		System.out.println("Inside Rectangle::draw() method.");
	}
}
