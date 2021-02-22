package com.example.demo.designpattern.builder;

public class ChickenBurger extends Burger {

	@Override
	public String name() {
		return "Chicken Burger";
	}

	@Override
	public float price() {
		return 22.5f;
	}

}
