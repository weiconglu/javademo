package com.example.demo.designpattern.factory.abstractfactory;

/**
 * 优点：当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。<br>
 * 缺点：产品族扩展非常困难，要增加一个系列的某一产品，既要在抽象的 Creator 里加代码，又要在具体的里面加代码。<br>
 * 注意事项：产品族难扩展，产品等级易扩展。
 * 
 * @author founder3829
 *
 */
public class FactoryProducer {

	public enum ChoiceEnum {
		SHAPE, COLOR
	}

	public static AbstractFactory getAbstractFactory(ChoiceEnum choiceEnum) {

		if (choiceEnum.equals(ChoiceEnum.SHAPE)) {
			return new ShapeFactory();
		}
		if (choiceEnum.equals(ChoiceEnum.COLOR)) {
			return new ColorFactory();
		}

		return null;
	}
}
