package com.example.demo.designpattern.factory;

import com.example.demo.designpattern.factory.ShapFactory.ShapeEnum;

public class ShapeFactoryTest {

	public static void main(String[] args) {

		Shape circle = ShapFactory.getShape(ShapeEnum.CIRCLE);
		Shape rectangle = ShapFactory.getShape(ShapeEnum.RECTANGLE);
		Shape triangle = ShapFactory.getShape(ShapeEnum.TRIANGLE);

		circle.draw();
		rectangle.draw();
		triangle.draw();

	}

}
