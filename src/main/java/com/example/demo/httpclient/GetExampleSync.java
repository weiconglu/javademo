package com.example.demo.httpclient;

import java.io.IOException;

import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class GetExampleSync {

	// 先把springbootdemo跑起来
	// http://127.0.0.1:8080/springbootdemo/employee/select/1

	public static void main(String[] args) {
		// 同步get请求示例
		OkHttpClient client = new OkHttpClient();

		String url = "http://127.0.0.1:8080/springbootdemo/employee/select/1";
//		String url = "http://127.0.0.1:8080/springbootdemo/employee/insertTestData";
		String result = null;

		Request request = new Request.Builder().url(url).build(); // <-- 请求

		// 注意这里try的写法，运行完后会自动关闭Response
		try (Response response = client.newCall(request).execute()) { // <-- 返回
			if (!response.isSuccessful()) { // 如果请求未成功
				throw new RuntimeException("服务器未响应");
			}

			result = response.body().string(); // <-- 返回的ResponseBody
			Headers headers = response.headers();
			for (int i = 0; i < headers.size(); i++) {
				System.out.println(headers.name(i) + ": " + headers.value(i));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		if (null != result) {
			System.out.println(result);
		}

	}

}
