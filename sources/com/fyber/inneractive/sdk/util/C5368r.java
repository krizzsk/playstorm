package com.fyber.inneractive.sdk.util;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;

/* renamed from: com.fyber.inneractive.sdk.util.r */
public class C5368r {
    /* renamed from: a */
    public static boolean m16780a() {
        if (Build.VERSION.SDK_INT >= 23) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m16781b(HttpURLConnection httpURLConnection) throws Exception {
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 200) {
            return true;
        }
        IAlog.m16699a("isResponseValid: found invalid response status: %s", Integer.toString(responseCode));
        return false;
    }

    /* renamed from: a */
    public static String m16778a(String str, int i, int i2, int i3) throws Exception {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.connect();
            InputStream a = m16777a((URLConnection) httpURLConnection);
            String a2 = m16779a(httpURLConnection);
            if (TextUtils.isEmpty(a2)) {
                String stringBuffer = m16781b(httpURLConnection) ? C5370s.m16788a(a, false).toString() : null;
                httpURLConnection.disconnect();
                return stringBuffer;
            } else if (i3 >= 0) {
                httpURLConnection.disconnect();
                return m16778a(a2, i2, i, i3);
            } else {
                throw new Exception("AdServer returned HTTP redirect response more than " + i3 + " times! aborting");
            }
        } catch (Exception e) {
            IAlog.m16698a("getBodyFromUrl failed with exception", e, new Object[0]);
            throw e;
        } catch (Throwable th) {
            IAlog.m16698a("getBodyFromUrl failed with error", th, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public static InputStream m16777a(URLConnection uRLConnection) {
        try {
            InputStream inputStream = uRLConnection.getInputStream();
            if (TextUtils.equals("gzip", uRLConnection.getContentEncoding())) {
                return new GZIPInputStream(inputStream);
            }
            return new BufferedInputStream(inputStream);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m16779a(HttpURLConnection httpURLConnection) throws Exception {
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode != 302 && responseCode != 303 && responseCode != 307) {
            return null;
        }
        IAlog.m16699a("getRedirectUrl: received redirect code %s", Integer.toString(responseCode));
        String headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
        if (!TextUtils.isEmpty(headerField)) {
            IAlog.m16699a("getRedirectUrl: redirecting target url: %s", headerField);
            return headerField;
        }
        throw new Exception("Server returned HTTP " + Integer.toString(responseCode) + " with empty location header!");
    }
}
