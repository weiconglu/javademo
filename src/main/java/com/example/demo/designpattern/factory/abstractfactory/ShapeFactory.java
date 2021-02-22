package com.example.demo.designpattern.factory.abstractfactory;

import com.example.demo.designpattern.factory.Circle;
import com.example.demo.designpattern.factory.Rectangle;
import com.example.demo.designpattern.factory.ShapFactory.ShapeEnum;
import com.example.demo.designpattern.factory.Shape;
import com.example.demo.designpattern.factory.Triangle;
import com.example.demo.designpattern.factory.abstractfactory.ColorFactory.ColorEnum;

public class ShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(ShapeEnum shapeEnum) {
		if (shapeEnum.equals(ShapeEnum.CIRCLE)) {
			return new Circle();
		}
		if (shapeEnum.equals(ShapeEnum.RECTANGLE)) {
			return new Rectangle();
		}
		if (shapeEnum.equals(ShapeEnum.TRIANGLE)) {
			return new Triangle();
		}
		return null;
	}

	@Override
	Color getColor(ColorEnum colorEnum) {
		return null;
	}

}
