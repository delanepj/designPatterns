package com.designpattern.abstractfactory;

import com.designpattern.factory.interfaces.*;

public abstract class AbstractFactory {
	public abstract Color getColor(String color);
	public abstract Shape getShape(String shape);
}
