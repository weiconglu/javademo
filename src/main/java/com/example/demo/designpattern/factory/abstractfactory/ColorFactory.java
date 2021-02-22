package com.example.demo.designpattern.factory.abstractfactory;

import com.example.demo.designpattern.factory.ShapFactory.ShapeEnum;
import com.example.demo.designpattern.factory.Shape;

public class ColorFactory extends AbstractFactory {

	public enum ColorEnum {
		RED, GREEN, BLUE
	}

	@Override
	Color getColor(ColorEnum colorEnum) {
		if (colorEnum.equals(ColorEnum.RED)) {
			return new Red();
		}
		if (colorEnum.equals(ColorEnum.GREEN)) {
			return new Green();
		}
		if (colorEnum.equals(ColorEnum.BLUE)) {
			return new Blue();
		}
		return null;
	}

	@Override
	Shape getShape(ShapeEnum shapeEnum) {
		return null;
	}

}
