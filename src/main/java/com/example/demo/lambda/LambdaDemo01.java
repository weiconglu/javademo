package com.example.demo.lambda;

public class LambdaDemo01 {

	public static void main(String[] args) {
		/*
		 * 函数式接口(只有一个方法的接口)可以写成lambda表达式
		 * public interface Runnable
		 */
		Runnable runnable = () -> System.out.println("Hello lambda");
		
		Thread thread = new Thread(runnable);
		
		thread.start();

	}

}
