package com.example.demo.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaDemo05 {

	public static void main(String[] args) {

		/*
		 * 													参数类型		返回类型
		 * Consumer<T> 消费型接口 		T					void			对类型为T的对象进行操作
		 * BiConsumer<T, U>
		 * Supplier<T> 供给型接口			无					T				返回类型为T的对象
		 * Function<T,R> 函数型接口		T					R				对类型为T的对象进行操作，返回R类型的对象
		 * Predicate<T> 断言型接口			T					boolean	确定类型为T的对象是否满足某种约束，返回boolean值
		 */
		
		// 1 消费型
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add((int) (Math.random() * 100 + 1));
		}
		consumer(list,(l) -> System.out.println(l));
		
		// 2 供给型
		List<Integer> integers = getIntegers(10, () -> (int) (Math.random() * 100 + 1));
		System.out.println(integers);

		// 3 函数型
		System.out.println(getStringLength("hello", (str) -> str.length()));

		// 4 断言型
		System.out.println(getStrings(list, (i) -> i > 50));

	}
	
	/**
	 * 消费型
	 * 
	 * @param list
	 * @param con
	 */
	public static void consumer(List<Integer> list, Consumer<List<Integer>> con) {
		con.accept(list);
	}

	/**
	 * 供给型 产生一个指定长度的整型List
	 * Supplier<Integer>负责supply一个整数，写在lambda表达式的话，右侧只写一个想要的格式的整数即可
	 * 
	 * @param size
	 * @param supplier
	 * @return
	 */
	public static List<Integer> getIntegers(int size, Supplier<Integer> supplier) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			list.add(supplier.get());
		}
		return list;
	}

	/**
	 * 函数型 传入一个字符串，返回其长度
	 * 
	 * @param string
	 * @param function
	 * @return
	 */
	public static Integer getStringLength(String string, Function<String, Integer> function) {
		return function.apply(string);
	}

	/**
	 * 断言型 将整型列表中满足条件的数字返回成一个新的整型列表
	 * 
	 * @param list
	 * @param predicate
	 * @return
	 */
	public static List<Integer> getStrings(List<Integer> list, Predicate<Integer> predicate) {
		List<Integer> newList = new ArrayList<Integer>();
		for (Integer integer : list) {
			if (predicate.test(integer)) {
				newList.add(integer);
			}
		}
		return newList;

	}

}
