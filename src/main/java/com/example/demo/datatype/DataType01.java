package com.example.demo.datatype;

/**
 * 基本数据类型保存在栈内存中
 * 
 * @author founder3829
 *
 */
public class DataType01 {

	public static void main(String[] args) {

		int a = 10;
		int b = a;

		System.out.println(a);
		System.out.println(b);

		a++;

		System.out.println(a);
		System.out.println(b);

	}

}
