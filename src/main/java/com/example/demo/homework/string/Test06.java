package com.example.demo.homework.string;

import java.util.Scanner;

/**
 * 用户从控制台输入一个字符串，须至少包含一个“/”，如果没有，给出错误提示；
 * 如果有，获取最后一个“/”后的字符串。
 */
public class Test06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String inputString = scanner.next();
		if (inputString.contains("/")) {
			System.out.println(inputString.substring(inputString.lastIndexOf("/") + 1));
		} else {
			System.out.println("请输入一个含有\"/\"的字符串");
		}
		scanner.close();
	}

}
