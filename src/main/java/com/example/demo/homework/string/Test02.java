package com.example.demo.homework.string;

/**
 * 将"大家好!"修改为:"大家好!我是程序员!"并输出。
 * 然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
 * 然后再修改为:"大家好!我是牛牛的程序员!"并输出
 * 然后在修改为:"我是牛牛的程序员!"并输出
 *
 */
public class Test02 {

	public static void main(String[] args) {
		String str = "大家好!";
		str = str.concat("我是程序员!");
		System.out.println(str);

		str = str.replace("程序员!", "优秀的程序员!");
		System.out.println(str);

		str = str.replace("优秀", "牛牛");
		System.out.println(str);

	}

}
