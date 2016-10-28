package com.designpattern.mains;

import com.designpattern.abstractfactory.*;
import com.designpattern.abstractfactory.FactoryProducer;
import com.designpattern.factory.interfaces.Color;
import com.designpattern.factory.interfaces.Shape;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instantiate Shape Factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		
		// Create a circle object
		Shape circle = shapeFactory.getShape("circle");
		circle.draw();
		
		// Create a rectangle object
		Shape rectangle = shapeFactory.getShape("rectangle");
		rectangle.draw();
		
		// Instantiate Color Factory
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		
		// Create a red object
		Color red = colorFactory.getColor("RED");
		red.fill();
		
		// Create a green object
		Color green = colorFactory.getColor("Green");
		green.fill();
		
		// Create a blue object
		Color blue = colorFactory.getColor("Blue");
		blue.fill();
		
		
	}

}
