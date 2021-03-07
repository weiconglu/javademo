package com.example.demo.dp.singleton.type4;

public class SingleTonTest4 {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton1);
		System.out.println(singleton2);
	}
}

/**
 * 懒汉式（线程安全，同步方法）
 * 优缺点说明：
 * 1）优点：起到了懒加载的效果
 * 2）缺点：效率太低
 * 结论：实际开发中，不建议使用
 * @author founder3829
 *
 */
class Singleton {

	private Singleton() {
	}

	private static Singleton instance;

	// 加锁
	public synchronized static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

}