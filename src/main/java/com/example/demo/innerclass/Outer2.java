package com.example.demo.innerclass;

public class Outer2 {

	private static String name;

	/**
	 * 静态内部类特点：它与类的静态成员变量一般，是不依赖于外部类的。<br>
	 * 外部类加载时只会加载静态域，不会加载静态内部类，<br>
	 * 所以静态内部类不能使用外部类的非静态变量与方法。
	 * 
	 * @author founder3829
	 *
	 */
	static class Inner2 {
		private String innerName; // <-- 静态内部类可以有非静态成员变量

		void showOutName() {
			System.out.println(name); // <-- 静态内部类无法使用外部类的非静态属性或方法
		}
	}

}
