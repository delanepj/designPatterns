package com.designpattern.mains;

import com.designpattern.factory.ShapeFactory;
import com.designpattern.factory.interfaces.Shape;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory = new ShapeFactory();
		
		// Create Circle Object
		Shape circle = shapeFactory.getShape("CIRCLE");
		
		// Call draw method. 
		circle.draw();
		
		// Test Case insensitivity
		Shape circle2 = shapeFactory.getShape("circle");
		circle2.draw();
		
		// Create Square Object
		Shape square = shapeFactory.getShape("square");
		square.draw();
		// Create Rectangle Object
		Shape rectangle = shapeFactory.getShape("rectangle");
		rectangle.draw();
		
	}

}
