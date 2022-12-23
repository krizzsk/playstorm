package com.bykv.p068vk.openvk.component.video.p069a.p080c;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.C2446e;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.C2473i;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p075b.C2425a;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p075b.C2427c;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p078e.C2448a;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p078e.C2453e;
import com.bytedance.sdk.component.p125f.C2952e;
import com.bytedance.sdk.component.p125f.C2955g;
import com.google.common.net.HttpHeaders;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.RandomAccessFile;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.bykv.vk.openvk.component.video.a.c.a */
/* compiled from: Util */
public final class C2482a {

    /* renamed from: a */
    public static final Charset f5286a = Charset.forName("UTF-8");

    /* renamed from: b */
    private static final Handler f5287b = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static void m6056a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m6059a(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m6060a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m6057a(RandomAccessFile randomAccessFile) {
        if (randomAccessFile != null) {
            try {
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m6061a(String str) {
        return str != null && (str.startsWith("http://") || str.startsWith("https://"));
    }

    /* renamed from: b */
    public static int m6062b(String str) {
        return m6046a(str, 0);
    }

    /* renamed from: a */
    public static int m6046a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: a */
    public static String m6050a(C2448a aVar, int i) {
        int a;
        if (aVar == null || !aVar.mo16170b()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.mo16173e().toUpperCase());
        sb.append(' ');
        sb.append(aVar.mo16166a());
        sb.append(' ');
        sb.append(aVar.mo16174f());
        sb.append("\r\n");
        if (C2446e.f5187c) {
            Log.i("TAG_PROXY_headers", aVar.mo16173e().toUpperCase() + " " + aVar.mo16166a() + " " + aVar.mo16174f());
        }
        List<C2473i.C2475b> a2 = m6052a(aVar.mo16171c());
        boolean z = true;
        if (a2 != null) {
            int size = a2.size();
            for (int i2 = 0; i2 < size; i2++) {
                C2473i.C2475b bVar = a2.get(i2);
                if (bVar != null) {
                    String str = bVar.f5267a;
                    String str2 = bVar.f5268b;
                    sb.append(str);
                    sb.append(": ");
                    sb.append(str2);
                    sb.append("\r\n");
                    if (HttpHeaders.CONTENT_RANGE.equalsIgnoreCase(str) || (HttpHeaders.ACCEPT_RANGES.equalsIgnoreCase(str) && "bytes".equalsIgnoreCase(str2))) {
                        z = false;
                    }
                }
            }
        }
        if (z && (a = m6045a(aVar)) > 0) {
            sb.append("Content-Range: bytes ");
            sb.append(Math.max(i, 0));
            sb.append("-");
            sb.append(a - 1);
            sb.append("/");
            sb.append(a);
            sb.append("\r\n");
        }
        sb.append("Connection: close");
        sb.append("\r\n");
        sb.append("\r\n");
        String sb2 = sb.toString();
        if (C2446e.f5187c) {
            Log.i("TAG_PROXY_WRITE_TO_MP", sb2);
        }
        return sb2;
    }

    /* renamed from: a */
    public static String m6048a(int i, int i2) {
        String b = m6063b(i, i2);
        if (b == null) {
            return null;
        }
        return "bytes=" + b;
    }

    /* renamed from: b */
    public static String m6063b(int i, int i2) {
        if (i >= 0 && i2 > 0) {
            return i + "-" + i2;
        } else if (i > 0) {
            return i + "-";
        } else if (i >= 0 || i2 <= 0) {
            return null;
        } else {
            return "-" + i2;
        }
    }

    /* renamed from: a */
    public static List<String> m6054a(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            if (m6061a(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m6049a(C2425a aVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (i <= 0) {
            sb.append("HTTP/1.1 200 OK");
            sb.append("\r\n");
        } else {
            sb.append("HTTP/1.1 206 Partial Content");
            sb.append("\r\n");
        }
        sb.append("Accept-Ranges: bytes");
        sb.append("\r\n");
        sb.append("Content-Type: ");
        sb.append(aVar.f5140b);
        sb.append("\r\n");
        if (i <= 0) {
            sb.append("Content-Length: ");
            sb.append(aVar.f5141c);
            sb.append("\r\n");
        } else {
            sb.append("Content-Range: bytes ");
            sb.append(i);
            sb.append("-");
            sb.append(aVar.f5141c - 1);
            sb.append("/");
            sb.append(aVar.f5141c);
            sb.append("\r\n");
            sb.append("Content-Length: ");
            sb.append(aVar.f5141c - i);
            sb.append("\r\n");
        }
        sb.append("Connection: close");
        sb.append("\r\n");
        sb.append("\r\n");
        String sb2 = sb.toString();
        if (C2446e.f5187c) {
            Log.i("TAG_PROXY_WRITE_TO_MP", sb2);
        }
        return sb2;
    }

    /* renamed from: a */
    public static int m6044a() {
        File[] listFiles;
        if (Build.VERSION.SDK_INT >= 17) {
            return Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        try {
            File file = new File("/sys/devices/system/cpu/");
            if (!file.exists() || (listFiles = file.listFiles(new FilenameFilter() {

                /* renamed from: a */
                private Pattern f5288a = Pattern.compile("^cpu[0-9]+$");

                public boolean accept(File file, String str) {
                    return this.f5288a.matcher(str).matches();
                }
            })) == null) {
                return 1;
            }
            return Math.max(listFiles.length, 1);
        } catch (Throwable unused) {
            return 1;
        }
    }

    /* renamed from: a */
    public static int m6045a(C2448a aVar) {
        int lastIndexOf;
        if (aVar == null) {
            return -1;
        }
        if (aVar.mo16166a() == 200) {
            return m6046a(aVar.mo16169a("Content-Length", (String) null), -1);
        }
        if (aVar.mo16166a() == 206) {
            String a = aVar.mo16169a(HttpHeaders.CONTENT_RANGE, (String) null);
            if (!TextUtils.isEmpty(a) && (lastIndexOf = a.lastIndexOf("/")) >= 0 && lastIndexOf < a.length() - 1) {
                return m6046a(a.substring(lastIndexOf + 1), -1);
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static String m6051a(C2448a aVar, boolean z, boolean z2) {
        String a;
        if (aVar == null) {
            if (C2446e.f5187c) {
                Log.e("TAG_PROXY_Response", "response null");
            }
            return "response null";
        } else if (!aVar.mo16170b()) {
            if (C2446e.f5187c) {
                Log.e("TAG_PROXY_Response", "response code: " + aVar.mo16166a());
            }
            return "response code: " + aVar.mo16166a();
        } else {
            String a2 = aVar.mo16169a("Content-Type", (String) null);
            if (!m6067c(a2)) {
                if (C2446e.f5187c) {
                    Log.e("TAG_PROXY_Response", "Content-Type: " + a2);
                }
                return "Content-Type: " + a2;
            }
            int a3 = m6045a(aVar);
            if (a3 <= 0) {
                if (C2446e.f5187c) {
                    Log.e("TAG_PROXY_Response", "Content-Length: " + a3);
                }
                return "Content-Length: " + a3;
            } else if (z && ((a = aVar.mo16169a(HttpHeaders.ACCEPT_RANGES, (String) null)) == null || !a.contains("bytes"))) {
                if (C2446e.f5187c) {
                    Log.e("TAG_PROXY_Response", "Accept-Ranges: " + a);
                }
                return "Accept-Ranges: " + a;
            } else if (!z2 || aVar.mo16172d() != null) {
                return null;
            } else {
                if (C2446e.f5187c) {
                    Log.e("TAG_PROXY_Response", "response body null");
                }
                return "response body null";
            }
        }
    }

    /* renamed from: c */
    public static boolean m6067c(String str) {
        return str != null && (str.startsWith("video/") || "application/octet-stream".equals(str) || "binary/octet-stream".equals(str));
    }

    /* renamed from: b */
    public static boolean m6066b() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    /* renamed from: a */
    public static void m6055a(C2955g gVar) {
        if (gVar == null) {
            return;
        }
        if (m6066b()) {
            C2952e.m8307a(gVar);
            if (C2446e.f5187c) {
                Log.e("TAG_PROXY_UTIL", "invoke in pool thread");
                return;
            }
            return;
        }
        gVar.run();
        if (C2446e.f5187c) {
            Log.e("TAG_PROXY_UTIL", "invoke calling thread");
        }
    }

    /* renamed from: a */
    public static void m6058a(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (m6066b()) {
            runnable.run();
        } else {
            f5287b.post(runnable);
        }
    }

    /* renamed from: a */
    public static List<C2473i.C2475b> m6052a(List<C2473i.C2475b> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        if (C2446e.f5187c) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C2473i.C2475b bVar = list.get(i);
                if (bVar != null) {
                    Log.i("TAG_PROXY_PRE_FILTER", bVar.f5267a + ": " + bVar.f5267a);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (C2473i.C2475b next : list) {
            if (HttpHeaders.HOST.equals(next.f5267a) || "Keep-Alive".equals(next.f5267a) || "Connection".equals(next.f5267a) || "Proxy-Connection".equals(next.f5267a)) {
                arrayList.add(next);
            }
        }
        list.removeAll(arrayList);
        if (C2446e.f5187c) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C2473i.C2475b bVar2 = list.get(i2);
                if (bVar2 != null) {
                    Log.i("TAG_PROXY_POST_FILTER", bVar2.f5267a + ": " + bVar2.f5268b);
                }
            }
        }
        return list;
    }

    /* renamed from: a */
    public static List<C2473i.C2475b> m6053a(Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            try {
                Set<Map.Entry<String, String>> entrySet = map.entrySet();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry next : entrySet) {
                    arrayList.add(new C2473i.C2475b((String) next.getKey(), (String) next.getValue()));
                }
                return arrayList;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C2425a m6047a(C2448a aVar, C2427c cVar, String str, int i) {
        String str2;
        String str3;
        String str4;
        C2425a a = cVar.mo16135a(str, i);
        if (a != null) {
            return a;
        }
        int a2 = m6045a(aVar);
        String a3 = aVar.mo16169a("Content-Type", (String) null);
        if (a2 <= 0 || TextUtils.isEmpty(a3)) {
            return a;
        }
        C2453e g = aVar.mo16175g();
        if (g != null) {
            str2 = g.f5201b;
            str3 = m6065b(g.f5204e);
        } else {
            str3 = "";
            str2 = str3;
        }
        String b = m6064b(aVar.mo16171c());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.REQUEST_URL, str2);
            jSONObject.put("requestHeaders", str3);
            jSONObject.put("responseHeaders", b);
            str4 = jSONObject.toString();
        } catch (Throwable unused) {
            str4 = "";
        }
        C2425a aVar2 = new C2425a(str, a3, a2, i, str4);
        cVar.mo16137a(aVar2);
        return aVar2;
    }

    /* renamed from: b */
    public static String m6064b(List<C2473i.C2475b> list) {
        if (list == null || list.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C2473i.C2475b bVar = list.get(0);
            if (bVar != null) {
                sb.append(bVar.f5267a);
                sb.append(": ");
                sb.append(bVar.f5268b);
                sb.append("\r\n");
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m6065b(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : map.entrySet()) {
            sb.append(next.getKey());
            sb.append(": ");
            sb.append(next.getValue());
            sb.append("\r\n");
        }
        return sb.toString();
    }
}
