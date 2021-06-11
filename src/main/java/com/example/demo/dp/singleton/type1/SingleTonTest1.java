package com.example.demo.dp.singleton.type1;

public class SingleTonTest1 {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton1);
		System.out.println(singleton2);
		System.out.println(singleton1.equals(singleton2));
	}
}

/**
 * 饿汉式（静态常量）
 * 优缺点说明：
 * 1）优点：这种写法比较简单，就是在类加载的时候完成实例化，避免了线程同步问题。
 * 2）缺点：在类装载的时候就完成实例化，没有做到懒加载。如果后期没有用到这个实例，就会造成内存的浪费。
 * 结论：这种试可用，但可能会造成内存浪费。
 * @author founder3829
 *
 */
class Singleton {

	private Singleton() {
	}

	private static final Singleton instance = new Singleton();

	public static Singleton getInstance() {
		return instance;
	}

}