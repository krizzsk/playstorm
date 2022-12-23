package com.saypromo.core;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class InternetService {
    public static InputStream GetFileFromServerSync(String str, int i) throws IOException {
        long j = (long) i;
        Response execute = new OkHttpClient.Builder().connectTimeout(j, TimeUnit.SECONDS).writeTimeout(j, TimeUnit.SECONDS).readTimeout(j, TimeUnit.SECONDS).build().newCall(new Request.Builder().url(str).build()).execute();
        if (!execute.isSuccessful() || execute.body() == null) {
            return null;
        }
        InputStream byteStream = execute.body().byteStream();
        return str.endsWith(".gz") ? new GZIPInputStream(byteStream) : byteStream;
    }

    public static String GetData(String str, int i) throws IOException {
        long j = (long) i;
        return new OkHttpClient.Builder().connectTimeout(j, TimeUnit.SECONDS).writeTimeout(j, TimeUnit.SECONDS).readTimeout(j, TimeUnit.SECONDS).build().newCall(new Request.Builder().url(str).build()).execute().body().string();
    }
}
