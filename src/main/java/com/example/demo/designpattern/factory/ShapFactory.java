package com.example.demo.designpattern.factory;

/**
 * 工厂模式（Factory Pattern）是 Java 中最常用的设计模式之一。
 * 这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。<br>
 * 在工厂模式中，我们在创建对象时不会对客户端暴露创建逻辑， 并且是通过使用一个共同的接口来接收新创建的对象。<br>
 * <br>
 * 
 * 注意事项：复杂对象适合使用工厂模式，而简单对象， 特别是只需要通过 new 就可以完成创建的对象，无需使用工厂模式。<br>
 * 如果使用工厂模式，就需要引入一个工厂类，会增加系统的复杂度。
 * 
 * @author founder3829
 *
 */
public class ShapFactory {

	public enum ShapeEnum {
		CIRCLE, RECTANGLE, TRIANGLE
	}

	public static Shape getShape(ShapeEnum shapeEnum) {
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

}
