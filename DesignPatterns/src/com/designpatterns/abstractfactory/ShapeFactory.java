/**
 * @author Patrick Delaney
 * Description: Adapted example from: https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm
 * Added additional functionality to test Factory Pattern.
 */
package com.designpattern.abstractfactory;

import com.designpattern.factory.interfaces.Color;
import com.designpattern.factory.interfaces.Shape;
import com.designpattern.factory.shapes.objects.*;

public class ShapeFactory extends AbstractFactory {
	
	@Override
	public Shape getShape(String shapeType){
		
		switch(shapeType.toLowerCase()){
		case "circle":
			return new Circle();
		case "square":
			return new Square();
		case "rectangle":
			return new Rectangle();
		default:
			return null;
		} // end switch
			
		
	} // end getShape

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
} // end ShapeFactory
