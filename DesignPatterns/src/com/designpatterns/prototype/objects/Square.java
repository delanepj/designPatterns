package com.designpatterns.prototype.objects;

import com.designpatterns.prototype.abstractobjects.Shape;

public class Square extends Shape {

	public Square(){
		this.type = "Square";
	}
	
	@Override
	public void draw(){
		System.out.println("Inside Square::draw() method.");
	}
	
}
