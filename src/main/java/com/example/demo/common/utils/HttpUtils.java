package com.example.demo.common.utils;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HttpUtils {

	static class MyHttpClientInterceptor implements Interceptor {

		@Override
		public Response intercept(Chain chain) throws IOException {

			Request request = chain.request(); // <-- 获得过滤链上的request

			// 这里写自己过滤器中想要实现的逻辑
			request = request.newBuilder().addHeader("AppKey", "demo").build();
			System.out.println(request);

			Response response = chain.proceed(request); // <-- 接着将response传入链中
			return response;
		}

	}

	private static final OkHttpClient okHttpClient = new OkHttpClient.Builder()
			.addInterceptor(new HttpUtils.MyHttpClientInterceptor()).build();

	public static OkHttpClient getInstance() {
		return okHttpClient;
	}

}

