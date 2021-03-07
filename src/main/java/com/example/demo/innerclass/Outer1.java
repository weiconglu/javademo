package com.example.demo.innerclass;

public class Outer1 {
	
	private static String name;
	
	// 成员内部类：非静态的内部类，在外部类加载的时候，并不会加载它，所以它里面不能有静态变量或者静态方法
	class Inner1 {
		public String innerName;
		void showOutName() {
			System.out.println(name);
		}
	}

}
