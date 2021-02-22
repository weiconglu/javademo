package com.example.demo.designpattern.builder;

public class BuilderPatternTest {

	public static void main(String[] args) {
		MealBuiler mealBuiler = new MealBuiler();

		Meal vegMeal = mealBuiler.prepareVegMeal();
		vegMeal.showItems();
		System.out.println("共计：" + vegMeal.getCost());

		Meal meatMeal = mealBuiler.prepareMeatMeal();
		meatMeal.showItems();
		System.out.println("共计：" + meatMeal.getCost());

	}

}
