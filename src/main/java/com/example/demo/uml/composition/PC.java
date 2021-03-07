package com.example.demo.uml.composition;

public class PC {

	private Keyboard keyboard = new Keyboard(); // Keyboard不能和PC分离
	private Mouse mouse = new Mouse(); // Mouse不能和PC分离

}
