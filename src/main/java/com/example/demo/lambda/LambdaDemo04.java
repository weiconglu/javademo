package com.example.demo.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LambdaDemo04 {

	public static void main(String[] args) {

		Map<String, Object> map = new HashMap<>();
		map.put("k1", "v1");
		map.put("k2", "v2");
		map.put("k3", "v3");

		Set<Entry<String, Object>> set = map.entrySet();
		// public interface Consumer<T>
		set.forEach((s) -> System.out.println(s));
		
		// public interface BiConsumer<T, U>
		map.forEach((k,v) -> System.out.println(k+","+v));

	}

}
