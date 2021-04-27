package com.example.demo.httpclient;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class GetExample {

	// 先把springbootdemo跑起来
	// http://127.0.0.1:8080/springbootdemo/employee/select/1

	public static void main(String[] args) {
		OkHttpClient client = new OkHttpClient();

//		String url = "http://127.0.0.1:8080/springbootdemo/employee/select/1";
		String url = "http://127.0.0.1:8080/springbootdemo/employee/insertTestData";
		String result = null;

		Request request = new Request.Builder().url(url).build(); // <-- 请求

		// 注意这里try的写法，运行完后会自动关闭Response
		try (Response response = client.newCall(request).execute()) { // <-- 返回
			result = response.body().string(); // <-- 返回的ResponseBody
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (null != result) {
			System.out.println(result);
		}

	}

}
