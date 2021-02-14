package com.example.demo.inherited;

public class InheritedTest {

	public static void main(String[] args) {

		/*
		 * 父类对象强转为子类，报 java.lang.ClassCastException异常
		 */
//		Father father = new Father();
//		Son son = (Son) father;
//		System.out.println(son);

		/*
		 * 声明子类对象用父类接收，可将父类接收的对象强转为子类
		 * 我们查看这个对象的运行时的class就可以发现，这个对应是是子类对象
		 */
//		Father father = new Son();
//		System.out.println(father.getClass());
//		Son son = (Son) father;
//		System.out.println(son);

		/*
		 * 子类可以强转为父类
		 */
		Son son = new Son();
		Father father = (Father) son;
		System.out.println(father.getClass());
		System.out.println(father);

	}

}
