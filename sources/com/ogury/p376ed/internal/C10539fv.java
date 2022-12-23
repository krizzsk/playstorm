package com.ogury.p376ed.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: com.ogury.ed.internal.fv */
public final class C10539fv {

    /* renamed from: a */
    public static final C10540a f26655a = new C10540a((byte) 0);

    /* renamed from: com.ogury.ed.internal.fv$a */
    public static final class C10540a {
        public /* synthetic */ C10540a(byte b) {
            this();
        }

        private C10540a() {
        }
    }

    /* renamed from: a */
    public static Bitmap m32045a(String str) {
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        HttpURLConnection httpURLConnection2;
        InputStream inputStream2;
        C10765mq.m32773b(str, "downloadUrl");
        Bitmap bitmap = null;
        try {
            httpURLConnection2 = m32047b(str);
            try {
                inputStream = httpURLConnection2.getInputStream();
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(inputStream, (Rect) null, options);
                    options.inSampleSize = m32044a(options, C10556gi.m32087b(48), C10556gi.m32087b(48));
                    options.inJustDecodeBounds = false;
                    httpURLConnection = m32047b(str);
                    try {
                        inputStream2 = httpURLConnection.getInputStream();
                        try {
                            bitmap = BitmapFactory.decodeStream(inputStream2, (Rect) null, options);
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        inputStream2 = null;
                    }
                } catch (Throwable unused3) {
                    httpURLConnection = null;
                    inputStream2 = null;
                }
            } catch (Throwable unused4) {
                httpURLConnection = null;
                inputStream = null;
                inputStream2 = inputStream;
                m32046a(httpURLConnection2, inputStream);
                m32046a(httpURLConnection, inputStream2);
                return bitmap;
            }
        } catch (Throwable unused5) {
            httpURLConnection = null;
            httpURLConnection2 = null;
            inputStream = null;
            inputStream2 = inputStream;
            m32046a(httpURLConnection2, inputStream);
            m32046a(httpURLConnection, inputStream2);
            return bitmap;
        }
        m32046a(httpURLConnection2, inputStream);
        m32046a(httpURLConnection, inputStream2);
        return bitmap;
    }

    /* renamed from: b */
    private static HttpURLConnection m32047b(String str) {
        URLConnection openConnection = new URL(str).openConnection();
        if (openConnection != null) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDoInput(true);
            httpURLConnection.setRequestProperty("Connection", "close");
            httpURLConnection.connect();
            return httpURLConnection;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
    }

    /* renamed from: a */
    private static int m32044a(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 >= i2 && i7 / i5 >= i) {
                i5 *= 2;
            }
        }
        return i5;
    }

    /* renamed from: a */
    private static void m32046a(HttpURLConnection httpURLConnection, InputStream inputStream) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Throwable unused) {
                return;
            }
        }
        if (inputStream != null) {
            inputStream.close();
        }
    }
}
