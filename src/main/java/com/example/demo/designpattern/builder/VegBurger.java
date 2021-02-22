package com.example.demo.designpattern.builder;

public class VegBurger extends Burger {

	@Override
	public String name() {
		return "Vegetable Burger";
	}

	@Override
	public float price() {
		return 12.5f;
	}

}
