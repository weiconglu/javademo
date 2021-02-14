package com.example.demo.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo01 {

	/*
	 * java中每个被JVM加载的类在JVM内部都有且只有一个类对象(Class的实例)与之对应
	 * 通过某个类的类对象可以得到这个类的信息(有哪些方法，哪些属性等信息)， 并且可以进行实例化操作
	 * 
	 * 获取类对象的方式：
	 * 1、类名.class
	 * 		每个类都有一个静态属性：class，可以直接获取这个类的类对象，当我们明确需要获取某个类的类对象时，
	 * 		可以使用这种方式
	 * 2、通过Class的静态方法：forName
	 * 		这种方式我们可以指定想加载的类的名字获取该类的类对象
	 * 3、通过类加载器ClassLoader
	 */

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException {
		// 1、获取User类的类对象
//		Class userClass = User.class;
		Class<?> userClass = Class.forName("com.example.demo.entity.User");
//		System.out.println(userClass.getName());

//		Method[] methods = userClass.getMethods();
//		Method[] methods = userClass.getDeclaredMethods();
//		for (Method method : methods) {
//			System.out.println(method.getName());
//		}

		// 2、得到User类的一个实例
		Object object = userClass.newInstance(); // <------ 调用的是无参构造器
		System.out.println(object);

		// 3、通过类对象获取类中定义的方法
		Method method1 = userClass.getMethod("setId", Integer.class);
		Method method2 = userClass.getMethod("toString");

		// 4、调用该方法
		method1.invoke(object, 1);
		method2.invoke(object);

	}

}
