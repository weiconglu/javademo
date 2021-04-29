package com.example.demo.httpclient;

import java.io.File;
import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class PostFileExample {

	public static void main(String[] args) {

		// 传递一个名为 file 的参数
		String url = "http://127.0.0.1:8080/springbootdemo/file/upload";

		OkHttpClient okHttpClient = new OkHttpClient();

		// 构建要上传的文件的request
		File file = new File("d:/西游记.pdf");
		// 三个参数 API的接收参数，原文件名以及MultipartBody
		MultipartBody multipartBody = new MultipartBody.Builder()
				.addFormDataPart("file", file.getName(), MultipartBody.create(MediaType.get("multipart/form-data"), file))
				.build();

		Request request = new Request.Builder().url(url).post(multipartBody).build();

		okHttpClient.newCall(request).enqueue(new Callback() {

			@Override
			public void onResponse(Call call, Response response) throws IOException {
				System.out.println("文件上传成功");
			}

			@Override
			public void onFailure(Call call, IOException e) {
				System.out.println("文件上传失败");
			}
		});

	}

}
