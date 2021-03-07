package com.example.demo.dp.singleton.type3;

public class SingleTonTest3 {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton1);
		System.out.println(singleton2);
	}
}

/**
 * 懒汉式（线程不安全）
 * 优缺点说明：
 * 1）优点：起到了懒加载的效果
 * 2）缺点：只能在单线程模式下使用
 * 结论：在实际开发中，不要使用
 * @author founder3829
 *
 */
class Singleton {

	private Singleton() {
	}

	private static Singleton instance;

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

}