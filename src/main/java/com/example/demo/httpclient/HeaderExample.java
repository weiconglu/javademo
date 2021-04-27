package com.example.demo.httpclient;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HeaderExample {

	public static void main(String[] args) {

		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
				.url("http://127.0.0.1:8080/springbootdemo/employee/select/1")
				.addHeader("Accept", "application/json")
				.addHeader("appkey", "springbootdemo")
				.build();

		try (Response response = client.newCall(request).execute()) {
			if (!response.isSuccessful()) {
				throw new RuntimeException("服务器未响应");
			}

			System.out.println(response.headers()); // <-- 打印headers
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
