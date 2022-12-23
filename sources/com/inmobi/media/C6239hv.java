package com.inmobi.media;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.hv */
/* compiled from: NetworkUtils */
public class C6239hv {

    /* renamed from: a */
    private static final String f15800a = C6239hv.class.getSimpleName();

    /* renamed from: a */
    public static boolean m18616a() {
        Context c = C6227ho.m18551c();
        if (c == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) c.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || m18619b()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private static boolean m18619b() {
        Context c = C6227ho.m18551c();
        if (c == null) {
            return false;
        }
        try {
            PowerManager powerManager = (PowerManager) c.getSystemService("power");
            if (Build.VERSION.SDK_INT <= 22 || powerManager == null) {
                return false;
            }
            return powerManager.isDeviceIdleMode();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static String m18611a(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                if (sb.length() > 0) {
                    sb.append(str);
                }
                sb.append(String.format(Locale.US, "%s=%s", new Object[]{m18609a((String) next.getKey()), m18609a((String) next.getValue())}));
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m18609a(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static void m18615a(Map<String, String> map) {
        if (map != null) {
            HashMap hashMap = new HashMap();
            for (Map.Entry next : map.entrySet()) {
                if (!(next.getValue() == null || ((String) next.getValue()).trim().length() == 0 || next.getKey() == null || ((String) next.getKey()).trim().length() == 0)) {
                    hashMap.put(((String) next.getKey()).trim(), ((String) next.getValue()).trim());
                }
            }
            map.clear();
            map.putAll(hashMap);
        }
    }

    /* renamed from: a */
    public static HashMap<String, String> m18612a(JSONObject jSONObject) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (jSONObject != null) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static String m18610a(String str, Map<String, String> map) {
        if (map != null && map.size() > 0) {
            for (Map.Entry next : map.entrySet()) {
                str = str.replace((CharSequence) next.getKey(), (CharSequence) next.getValue());
            }
        }
        return str;
    }

    /* renamed from: a */
    public static byte[] m18618a(byte[] bArr) {
        GZIPInputStream gZIPInputStream;
        IOException e;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream2 = null;
        try {
            gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            try {
                bArr = m18617a((InputStream) gZIPInputStream);
            } catch (IOException e2) {
                e = e2;
                try {
                    C6238hu.m18606a((byte) 2, f15800a, "Failed to decompress response", e);
                    m18613a((Closeable) byteArrayInputStream);
                    m18613a((Closeable) gZIPInputStream);
                    return bArr;
                } catch (Throwable th) {
                    th = th;
                    gZIPInputStream2 = gZIPInputStream;
                }
            }
        } catch (IOException e3) {
            IOException iOException = e3;
            gZIPInputStream = null;
            e = iOException;
            C6238hu.m18606a((byte) 2, f15800a, "Failed to decompress response", e);
            m18613a((Closeable) byteArrayInputStream);
            m18613a((Closeable) gZIPInputStream);
            return bArr;
        } catch (Throwable th2) {
            th = th2;
            m18613a((Closeable) byteArrayInputStream);
            m18613a((Closeable) gZIPInputStream2);
            throw th;
        }
        m18613a((Closeable) byteArrayInputStream);
        m18613a((Closeable) gZIPInputStream);
        return bArr;
    }

    /* renamed from: a */
    public static byte[] m18617a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (-1 == read) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } finally {
                m18613a((Closeable) byteArrayOutputStream);
            }
        }
    }

    /* renamed from: a */
    public static void m18614a(HttpURLConnection httpURLConnection) {
        try {
            m18613a((Closeable) httpURLConnection.getInputStream());
        } catch (IOException unused) {
        }
    }

    /* renamed from: a */
    public static void m18613a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
