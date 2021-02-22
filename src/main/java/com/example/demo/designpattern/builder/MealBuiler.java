package com.example.demo.designpattern.builder;

/**
 * 建造者模式（Builder Pattern）使用多个简单的对象一步一步构建成一个复杂的对象。 <br>
 * 一个 Builder 类会一步一步构造最终的对象。该 Builder 类是独立于其他对象的。
 * 
 * @author founder3829
 *
 */
public class MealBuiler {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Cola());
		return meal;
	}

	public Meal prepareMeatMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Juice());
		return meal;
	}

}
