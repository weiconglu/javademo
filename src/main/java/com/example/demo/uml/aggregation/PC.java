package com.example.demo.uml.aggregation;

public class PC {

	private Keyboard keyboard; // Keyboard可以和PC分离
	private Mouse mouse; // Mouse可以和PC分离

	public Keyboard getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(Keyboard keyboard) {
		this.keyboard = keyboard;
	}

	public Mouse getMouse() {
		return mouse;
	}

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}

}
