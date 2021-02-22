package com.example.demo.designpattern.factory.abstractfactory;

import com.example.demo.designpattern.factory.ShapFactory.ShapeEnum;
import com.example.demo.designpattern.factory.Shape;
import com.example.demo.designpattern.factory.abstractfactory.ColorFactory.ColorEnum;
import com.example.demo.designpattern.factory.abstractfactory.FactoryProducer.ChoiceEnum;

public class AbstractFactoryTest {

	public static void main(String[] args) {

		AbstractFactory shapeFactory = FactoryProducer.getAbstractFactory(ChoiceEnum.SHAPE);

		Shape circle = shapeFactory.getShape(ShapeEnum.CIRCLE);
		circle.draw();
		Shape rectangle = shapeFactory.getShape(ShapeEnum.RECTANGLE);
		rectangle.draw();
		Shape triangle = shapeFactory.getShape(ShapeEnum.TRIANGLE);
		triangle.draw();

		AbstractFactory colorFactory = FactoryProducer.getAbstractFactory(ChoiceEnum.COLOR);

		Color red = colorFactory.getColor(ColorEnum.RED);
		red.fill();

		Color green = colorFactory.getColor(ColorEnum.GREEN);
		green.fill();

		Color blue = colorFactory.getColor(ColorEnum.BLUE);
		blue.fill();

	}

}
