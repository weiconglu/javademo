package com.example.demo.dp.singleton.type7;

public class SingleTonTest7 {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton1);
		System.out.println(singleton2);
	}
}

/**
 * 懒汉式（静态内部类）
 * JVM类加载机制
 * ①外部类加载时，静态内部类不会立即加载；<br>
 * ②内部类加载是线程安全的
 * 结论：推荐使用
 * @author founder3829
 *
 */
class Singleton {

	private Singleton() {
	}

	static class SingletonInstance {
		private static final Singleton INSTANCE = new Singleton();
	}

	public static Singleton getInstance() {
		return SingletonInstance.INSTANCE;
	}

}