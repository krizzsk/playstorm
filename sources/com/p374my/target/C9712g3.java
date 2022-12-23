package com.p374my.target;

import android.content.Context;
import androidx.browser.trusted.sharing.ShareTarget;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;

/* renamed from: com.my.target.g3 */
public class C9712g3 extends C9734h3<Void> {
    /* renamed from: d */
    public static C9712g3 m28065d() {
        return new C9712g3();
    }

    /* renamed from: c */
    public Void mo63942a(String str, String str2, Context context) {
        HttpURLConnection httpURLConnection;
        if (str2 == null) {
            C9672e0.m27882a("can't send log request: body is null");
            this.f23988a = false;
            return null;
        }
        C9672e0.m27882a("send log request");
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
                httpURLConnection.setRequestProperty("Content-Type", "text/html; charset=utf-8");
                httpURLConnection.setRequestProperty("connection", "close");
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, Charset.forName("UTF-8")));
                bufferedWriter.write(str2);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
                httpURLConnection.getInputStream().close();
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
            try {
                this.f23988a = false;
                this.f23992e = th.getMessage();
                C9672e0.m27882a("log request error: " + this.f23992e);
            } finally {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
        }
        return null;
    }
}
