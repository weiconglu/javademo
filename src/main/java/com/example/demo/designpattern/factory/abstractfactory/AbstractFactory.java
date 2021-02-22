package com.example.demo.designpattern.factory.abstractfactory;

import com.example.demo.designpattern.factory.ShapFactory.ShapeEnum;
import com.example.demo.designpattern.factory.Shape;
import com.example.demo.designpattern.factory.abstractfactory.ColorFactory.ColorEnum;

/**
 * 抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。<br>
 * 在抽象工厂模式中，接口是负责创建一个相关对象的工厂，不需要显式指定它们的类。每个生成的工厂都能按照工厂模式提供对象。
 * 
 * @author founder3829
 *
 */
public abstract class AbstractFactory {
	abstract Shape getShape(ShapeEnum shapeEnum);

	abstract Color getColor(ColorEnum colorEnum);
}
