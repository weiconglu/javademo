package com.example.demo.homework.string;

import java.util.Scanner;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 *
 */
public class Test05 {

	public static void main(String[] args) {
		String checkStr = getVerificationCode(5);
		System.out.println(checkStr);

		System.out.print("请输入验证码：");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.next();
		System.out.println(checkStr.equalsIgnoreCase(inputString));

		scanner.close();

	}
	
	/**
	 * 随机生成一个长度为count的英文字符串
	 * 
	 * @param count
	 * @return
	 */
	public static String getVerificationCode(Integer count) {
		String result = "";
		char[] alphabets = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
				'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

		for (int i = 0; i < count; i++) {
			int index = (int) (Math.random() * 51);
			result = result + alphabets[index];
		}

		return result;
	}

}
