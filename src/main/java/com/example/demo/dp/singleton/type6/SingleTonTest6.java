package com.example.demo.dp.singleton.type6;

public class SingleTonTest6 {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton1);
		System.out.println(singleton2);
	}
}

/**
 * 懒汉式（线程安全，double check）
 * 优缺点说明：
 * 1）优点：起到了懒加载的效果
 * 结论：在实际开发中，建议使用
 * 注意：volatile关键字， 保证每个线程能够获取该变量的最新值
 * @author founder3829
 *
 */
class Singleton {

	private Singleton() {
	}

	// 被volatile修饰的变量能够保证每个线程能够获取该变量的最新值，从而避免出现数据脏读的现象
	private static volatile Singleton instance;

	public static Singleton getInstance() {
		if (instance == null) {
			// 将同步锁写在代码块
			synchronized (Singleton.class) {
				if (instance == null) { // <--- double check
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

}