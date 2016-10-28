/**
 * @author Patrick Delaney
 * Description: Adapted example from: https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm
 * Added additional functionality to test Factory Pattern.
 */
package com.designpattern.abstractfactory;

import com.designpattern.factory.interfaces.Color;
import com.designpattern.factory.interfaces.Shape;
import com.designpattern.factory.colors.objects.*;

public class ColorFactory extends AbstractFactory {
	
	@Override
	public Shape getShape(String shapeType){
		return null;

	} // end getShape

	@Override
	public Color getColor(String color) {
		switch(color.toLowerCase()){
		case "red":
			return new Red();
		case "green":
			return new Green();
		case "blue":
			return new Blue();
		default:
			return null;
		} // end switch
	} // end Color
	
	
} // end ShapeFactory
