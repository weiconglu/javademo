package com.example.demo.designpattern.singleton;

public class SingletonTest {

	public static void main(String[] args) {

		SingleObject singleObject1 = SingleObject.getInstance();
		System.out.println(singleObject1);

		SingleObject singleObject2 = SingleObject.getInstance();
		System.out.println(singleObject2);

		// 验证这两个实例是不是同一个对象
		System.out.println(singleObject1.equals(singleObject2));
	}

}
