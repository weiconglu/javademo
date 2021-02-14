package com.example.demo.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemo03 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add((int) (Math.random() * 100 + 1));
		}

//		for (Integer integer : list) {
//			System.out.println(integer);
//		}

		// public interface Consumer<T>
		list.forEach((x) -> System.out.println(x));
	}

}
