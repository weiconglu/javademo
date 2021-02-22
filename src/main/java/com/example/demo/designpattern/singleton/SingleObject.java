package com.example.demo.designpattern.singleton;

/**
 * 饿汉式写法<br>
 * 单例模式（Singleton Pattern）是 Java 中最简单的设计模式之一。<br>
 * 这种模式涉及到一个单一的类，该类负责创建自己的对象，同时确保只有单个对象被创建。<br>
 * 这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象。 <br>
 * 注意事项：getInstance() 方法中需要使用同步锁 synchronized (Singleton.class) 防止多线程同时进入造成
 * instance 被多次实例化。<br>
 * 
 * 注意：<br>
 * 1、单例类只能有一个实例<br>
 * 2、单例类必须自己创建自己的唯一实例<br>
 * 3、单例类必须给所有其他对象提供访问这一实例的方法<br>
 * 
 * 意图：保证一个类仅有一个实例，并提供一个访问它的全局访问点<br>
 * 主要解决：一个全局使用的类频繁地创建与销毁<br>
 * 何时使用：当您想控制实例数目，节省系统资源的时候<br>
 * 如何解决：判断系统是否已经有这个单例，如果有则返回，如果没有则创建 <--- <br>
 * 关键代码：构造函数是私有的<br>
 * 
 * @author founder3829
 *
 */
public class SingleObject {

	// 创建SingleObject的一个对象
	private static SingleObject singleObject = new SingleObject();

	// 使构造方法私有，这个这个类就不能通过new来实例化对象
	private SingleObject() {
	};

	// 返回这个唯一的实例
	public static SingleObject getInstance() {
		return singleObject;
	}

}
