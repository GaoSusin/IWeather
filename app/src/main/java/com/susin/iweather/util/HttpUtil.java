package com.susin.iweather.util;

import android.app.Activity;
import android.os.Bundle;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.internal.http.RequestLine;

/**
 * 说明：
 *
 * @作者 Susin
 * @创建时间 2016/11/23 21:46
 */
public class HttpUtil{

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}