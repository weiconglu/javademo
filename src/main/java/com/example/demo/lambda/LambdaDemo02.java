package com.example.demo.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo02 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add((int) (Math.random() * 100 + 1));
		}
		System.out.println(list);

//		Comparator<Integer> comparator = new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o1 - o2;
//			}
//		};

		// public interface Comparator<T>
		Comparator<Integer> comparator = (x, y) -> x - y;
		Collections.sort(list, comparator);

		System.out.println(list);

	}

}
