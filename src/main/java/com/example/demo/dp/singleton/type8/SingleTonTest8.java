package com.example.demo.dp.singleton.type8;

public class SingleTonTest8 {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.INSTANCE;
		Singleton singleton2 = Singleton.INSTANCE;
		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());
	}
}

enum Singleton {
	INSTANCE
}