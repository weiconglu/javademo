package com.example.demo.datatype;

import com.example.demo.entity.User;

/**
 * 引用数据类型保存在堆内存中
 * 
 * @author founder3829
 *
 */
public class DataType02 {

	public static void main(String[] args) {

		User user1 = new User();
		user1.setUsername("张三");

		User user2 = user1;

		System.out.println(user1);
		System.out.println(user2);

		user1.setUsername("李四");
		System.out.println(user1);
		System.out.println(user2);

	}

}
