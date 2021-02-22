package com.example.demo.designpattern.singleton;

/**
 * 懒汉式写法，只有当调用getInstance时才初始化对象
 * 
 * @author founder3829
 *
 */
public class SingleObjectLazy {

	private static SingleObjectLazy singleObjectLazy = null;

	private SingleObjectLazy() {
	}

	public synchronized static SingleObjectLazy getInstance() {
		if (singleObjectLazy == null) {
			singleObjectLazy = new SingleObjectLazy();
		}
		return singleObjectLazy;
	}

}
