package com.example.demo.designpattern.builder;

public class Juice extends Drink {

	@Override
	public String name() {
		return "Orange Juice";
	}

	@Override
	public float price() {
		return 3.5f;
	}

}
