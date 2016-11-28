package com.designpatterns.prototype.cache;

import java.util.HashMap;

import com.designpatterns.prototype.abstractobjects.Shape;
import com.designpatterns.prototype.objects.Circle;
import com.designpatterns.prototype.objects.Rectangle;
import com.designpatterns.prototype.objects.Square;

public class ShapeCache {

	private static HashMap<String, Shape> shapeMap = new HashMap<String,Shape>();
	
	public static Shape getShape(String shapeId){
		Shape cachedShape = shapeMap.get(shapeId);
		return (Shape) cachedShape.clone();
	} // end getShape
	
	public static void loadCache(){
		
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);
		
		Square square = new Square();
		square.setId("2");
		shapeMap.put(square.getId(), square);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		shapeMap.put(rectangle.getId(), rectangle);
		
		
	} // end loadCache
	
}
