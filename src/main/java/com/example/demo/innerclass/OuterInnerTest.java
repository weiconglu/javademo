package com.example.demo.innerclass;

public class OuterInnerTest {

	public static void main(String[] args) {

//		new Outer(); // <--- 外部类加载时不会加载静态内部类
		new Outer.Inner(); // <--- 静态内部类加载时不会加载外部类

	}

}

class Outer {
	static {
		System.out.println("外部类加载了");
	}

	static class Inner {
		static {
			System.out.println("内部类加载了");
		}
	}
}