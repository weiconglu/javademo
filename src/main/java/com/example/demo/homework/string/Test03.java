package com.example.demo.homework.string;

import java.util.Scanner;

/**
 * 检查一个字符串是否为回文
 * 回文:正着念与反着念一样，例如:上海自来水来自海上
 * 用户从控制台输入一个字符串，然后调用check方法检查
 * 该字符串是否为回文，然后输出检查结果。
 * 若是回文则输出:是回文
 * 否则输出:不是回文
 * 
 */
public class Test03 {
	
	public static void main(String[] args) {
		System.out.println("请输入一段文字，系统将判断该段文字是不是回文：");
		Scanner scanner = new Scanner(System.in);
		
		if (isPalindrome(scanner.next())) {
			System.out.println("是回文");
		} else {
			System.out.println("不是回文");
		}

		scanner.close();
	}
	
	/**
	 * 判断传入的字符串是不是回文
	 * @param str
	 * @return 如果是回文返回true，不是回文反回false
	 */
	public final static boolean isPalindrome(String str) {

		// 如果str的长度为1，直接返回true
		if (str.length() == 1) {
			return true;
		}

		boolean flag = true;
		char[] charArray = str.toCharArray();
		for (int i = 0; i < str.length() / 2; i++) {
			if (charArray[i] != charArray[str.length() - i - 1]) {
				flag = false;
			}
		}
		return flag;
	}

}
