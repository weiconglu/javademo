package com.example.demo.httpclient;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 自定义httpclient挂载器示例，比如加入一些请求header
 * 
 * @author founder3829
 *
 */
public class MyHttpClientInterceptor implements Interceptor {

	@Override
	public Response intercept(Chain chain) throws IOException {

		// 1、获得request
		Request request = chain.request();

		// 2、写入自定义的业务逻辑
		// 注意重新构建request的写法
		request = request.newBuilder().addHeader("AppKey", "demo").build();

		// 3、返回response
		Response response = chain.proceed(request);
		return response;
	}

}
