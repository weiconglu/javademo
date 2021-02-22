package com.example.demo.designpattern.builder;

public class Cola extends Drink {

	@Override
	public String name() {
		return "CocaCola";
	}

	@Override
	public float price() {
		return 2.5f;
	}

}
