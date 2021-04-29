package com.example.demo.homework.string;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
 *
 */
public class Test04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		if (!isEmail(str)) {
			System.out.println("请输入一个正确的email地址。");
			scanner.close();
			return;
		}
		System.out.println(str.substring(0, str.indexOf("@")));
		scanner.close();
	}

	/**
	 * 验证字符串是不是正确的email地址
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isEmail(String str) {
		String regex = "^([a-zA-Z0-9])+([a-zA-Z0-9\\._-])*@([a-zA-Z0-9_-])+([a-zA-Z0-9\\._-]+)+$";
		return Pattern.matches(regex, str);
	}

}
