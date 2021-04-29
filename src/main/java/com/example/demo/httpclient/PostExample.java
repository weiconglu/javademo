package com.example.demo.httpclient;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class PostExample {

	public static void main(String[] args) {

		// 需要一个整形参数 id
		String url = "http://127.0.0.1:8080/springbootdemo/employee/xGender"; // <-- 更改指定id的员工的性别

		OkHttpClient okHttpClient = new OkHttpClient();

		// 提交表单示例
		FormBody formBody = new FormBody.Builder().add("id", "1").build();

		Request request = new Request.Builder().url(url).post(formBody).build();

		// 发异步请求
		okHttpClient.newCall(request).enqueue(new Callback() {

			@Override
			public void onResponse(Call call, Response response) throws IOException {
				System.out.println(response.body().string());

			}

			@Override
			public void onFailure(Call call, IOException e) {
				System.out.println("服务器未响应");

			}
		});

	}

}
