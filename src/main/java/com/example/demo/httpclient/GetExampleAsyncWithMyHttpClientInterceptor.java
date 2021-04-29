package com.example.demo.httpclient;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class GetExampleAsyncWithMyHttpClientInterceptor {

	// 先把springbootdemo跑起来
	// http://127.0.0.1:8080/springbootdemo/employee/select/1

	public static void main(String[] args) {

		// 注意OkHttpClient对象的创建方式
		// 异步请求示例
		OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(new MyHttpClientInterceptor()).build();

		String url = "http://127.0.0.1:8080/springbootdemo/employee/select/1";

		Request request = new Request.Builder().url(url).build(); // <-- 请求

		// 异步请求
		okHttpClient.newCall(request).enqueue(new Callback() {

			@Override
			public void onResponse(Call call, Response response) throws IOException { // <-- 请求成功时
				System.out.println(response.body().string());
			}

			@Override
			public void onFailure(Call call, IOException e) { // <-- 请求失败时
				System.out.println("服务器未响应");
			}
		});

	}

}
