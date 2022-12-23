package com.ironsource.p200d;

import android.content.Context;
import android.util.Pair;
import androidx.browser.trusted.sharing.ShareTarget;
import com.ironsource.mediationsdk.adunit.p208a.C6590a;
import com.ironsource.p199c.C6391b;
import com.ironsource.sdk.p290e.p291a.C8333a;
import com.ironsource.sdk.utils.SDKUtils;
import com.tapjoy.TapjoyConstants;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.d.b */
public class C6393b {

    /* renamed from: a */
    private C6590a f16240a = new C6590a();

    /* renamed from: com.ironsource.d.b$a */
    public static class C6394a {

        /* renamed from: a */
        final String f16241a;

        /* renamed from: b */
        final String f16242b;

        /* renamed from: c */
        final String f16243c;

        /* renamed from: d */
        final int f16244d;

        /* renamed from: e */
        final int f16245e;

        /* renamed from: f */
        final String f16246f;

        /* renamed from: g */
        ArrayList<Pair<String, String>> f16247g;

        /* renamed from: com.ironsource.d.b$a$a */
        public static class C6395a {

            /* renamed from: a */
            List<Pair<String, String>> f16248a = new ArrayList();

            /* renamed from: b */
            public String f16249b;

            /* renamed from: c */
            public String f16250c = ShareTarget.METHOD_POST;

            /* renamed from: d */
            public String f16251d;

            /* renamed from: e */
            int f16252e = 15000;

            /* renamed from: f */
            int f16253f = 15000;

            /* renamed from: g */
            String f16254g = "UTF-8";

            /* renamed from: a */
            public final C6395a mo35892a(List<Pair<String, String>> list) {
                this.f16248a.addAll(list);
                return this;
            }

            /* renamed from: a */
            public final C6394a mo35893a() {
                return new C6394a(this);
            }
        }

        public C6394a(C6395a aVar) {
            this.f16241a = aVar.f16249b;
            this.f16242b = aVar.f16250c;
            this.f16243c = aVar.f16251d;
            this.f16247g = new ArrayList<>(aVar.f16248a);
            this.f16244d = aVar.f16252e;
            this.f16245e = aVar.f16253f;
            this.f16246f = aVar.f16254g;
        }
    }

    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008a A[SYNTHETIC, Splitter:B:32:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ca  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ironsource.p200d.C6396c m19185a(com.ironsource.p200d.C6393b.C6394a r7) {
        /*
            java.lang.String r0 = r7.f16241a
            java.lang.String r1 = r7.f16243c
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0016
            if (r1 == 0) goto L_0x0016
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0016
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            if (r0 == 0) goto L_0x00ce
            com.ironsource.d.c r0 = new com.ironsource.d.c
            r0.<init>()
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            java.lang.String r3 = r7.f16241a     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            int r3 = r7.f16244d     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            r2.setConnectTimeout(r3)     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            int r3 = r7.f16245e     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            r2.setReadTimeout(r3)     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            java.lang.String r3 = r7.f16242b     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            r2.setRequestMethod(r3)     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> r3 = r7.f16247g     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            m19187a((java.net.HttpURLConnection) r2, (java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) r3)     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            java.lang.String r3 = "POST"
            java.lang.String r4 = r7.f16242b     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            boolean r3 = r3.equals(r4)     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            if (r3 == 0) goto L_0x005f
            java.lang.String r3 = r7.f16243c     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            java.lang.String r4 = r7.f16246f     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            byte[] r3 = r3.getBytes(r4)     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            int r4 = r3.length     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            java.lang.String r5 = "Content-Length"
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            r2.setRequestProperty(r5, r4)     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            m19188a((java.net.HttpURLConnection) r2, (byte[]) r3)     // Catch:{ IOException -> 0x007e, all -> 0x007c }
        L_0x005f:
            java.io.InputStream r1 = r2.getInputStream()     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            int r3 = r2.getResponseCode()     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            r0.f16255a = r3     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            if (r1 == 0) goto L_0x0071
            byte[] r3 = com.ironsource.environment.C6399a.C64001.m19218a((java.io.InputStream) r1)     // Catch:{ IOException -> 0x007e, all -> 0x007c }
            r0.f16256b = r3     // Catch:{ IOException -> 0x007e, all -> 0x007c }
        L_0x0071:
            if (r1 == 0) goto L_0x0076
            r1.close()
        L_0x0076:
            if (r2 == 0) goto L_0x00bd
            r2.disconnect()
            goto L_0x00bd
        L_0x007c:
            r7 = move-exception
            goto L_0x00c3
        L_0x007e:
            r3 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto L_0x0088
        L_0x0083:
            r7 = move-exception
            r2 = r1
            goto L_0x00c3
        L_0x0086:
            r3 = move-exception
            r2 = r1
        L_0x0088:
            if (r1 == 0) goto L_0x00be
            int r4 = r1.getResponseCode()     // Catch:{ all -> 0x00bf }
            r0.f16255a = r4     // Catch:{ all -> 0x00bf }
            r5 = 400(0x190, float:5.6E-43)
            if (r4 < r5) goto L_0x00be
            java.lang.String r3 = "ISHttpService"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bf }
            java.lang.String r5 = "Failed post to "
            r4.<init>(r5)     // Catch:{ all -> 0x00bf }
            java.lang.String r7 = r7.f16241a     // Catch:{ all -> 0x00bf }
            r4.append(r7)     // Catch:{ all -> 0x00bf }
            java.lang.String r7 = " StatusCode: "
            r4.append(r7)     // Catch:{ all -> 0x00bf }
            int r7 = r0.f16255a     // Catch:{ all -> 0x00bf }
            r4.append(r7)     // Catch:{ all -> 0x00bf }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x00bf }
            android.util.Log.d(r3, r7)     // Catch:{ all -> 0x00bf }
            if (r2 == 0) goto L_0x00b8
            r2.close()
        L_0x00b8:
            if (r1 == 0) goto L_0x00bd
            r1.disconnect()
        L_0x00bd:
            return r0
        L_0x00be:
            throw r3     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            r7 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
        L_0x00c3:
            if (r1 == 0) goto L_0x00c8
            r1.close()
        L_0x00c8:
            if (r2 == 0) goto L_0x00cd
            r2.disconnect()
        L_0x00cd:
            throw r7
        L_0x00ce:
            java.security.InvalidParameterException r7 = new java.security.InvalidParameterException
            java.lang.String r0 = "not valid params"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.p200d.C6393b.m19185a(com.ironsource.d.b$a):com.ironsource.d.c");
    }

    /* renamed from: a */
    public static C6396c m19186a(String str, String str2, List<Pair<String, String>> list) {
        C6394a.C6395a aVar = new C6394a.C6395a();
        aVar.f16249b = str;
        aVar.f16251d = str2;
        aVar.f16250c = ShareTarget.METHOD_POST;
        aVar.mo35892a(list);
        return m19185a(aVar.mo35893a());
    }

    /* renamed from: a */
    private static void m19187a(HttpURLConnection httpURLConnection, List<Pair<String, String>> list) {
        for (Pair next : list) {
            httpURLConnection.setRequestProperty((String) next.first, (String) next.second);
        }
    }

    /* renamed from: a */
    private static void m19188a(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setDoOutput(true);
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        try {
            dataOutputStream.write(bArr);
            dataOutputStream.flush();
        } finally {
            dataOutputStream.close();
        }
    }

    /* renamed from: a */
    public void mo35878a(int i) {
        C6590a.m20031a("itp", (Object) Integer.valueOf(i));
    }

    /* renamed from: a */
    public void mo35879a(Context context) {
        C6590a.m20030a(context);
    }

    /* renamed from: a */
    public void mo35880a(C6391b bVar) {
        try {
            HashMap hashMap = new HashMap();
            String str = C8333a.f19967a;
            Intrinsics.checkNotNullExpressionValue(str, "OMIDManager.OMID_LIB_VERSION");
            hashMap.put("omv", str);
            hashMap.put("ompv", "7");
            String sDKVersion = SDKUtils.getSDKVersion();
            Intrinsics.checkNotNullExpressionValue(sDKVersion, "SDKUtils.getSDKVersion()");
            hashMap.put("sdkv", sDKVersion);
            C6590a.m20033a((Map<String, Object>) hashMap);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void mo35881a(Boolean bool) {
        C6590a.m20031a("fs", (Object) bool);
    }

    /* renamed from: a */
    public void mo35882a(String str) {
        C6590a.m20031a("apky", (Object) str);
    }

    /* renamed from: a */
    public void mo35883a(JSONObject jSONObject) {
        C6590a.m20031a("md", (Object) jSONObject);
    }

    /* renamed from: a */
    public void mo35884a(boolean z) {
        C6590a.m20031a("cnst", (Object) Boolean.valueOf(z));
    }

    /* renamed from: b */
    public void mo35885b(String str) {
        C6590a.m20031a("medv", (Object) str);
    }

    /* renamed from: b */
    public void mo35886b(JSONObject jSONObject) {
        C6590a.m20031a("tkgp", (Object) jSONObject);
    }

    /* renamed from: b */
    public void mo35887b(boolean z) {
        C6590a.m20031a("gpi", (Object) Boolean.valueOf(z));
    }

    /* renamed from: c */
    public void mo35888c(String str) {
        C6590a.m20031a("sid", (Object) str);
    }

    /* renamed from: d */
    public void mo35889d(String str) {
        C6590a.m20031a(TapjoyConstants.TJC_PLUGIN, (Object) str);
    }

    /* renamed from: e */
    public void mo35890e(String str) {
        C6590a.m20031a("usid", (Object) str);
    }

    /* renamed from: f */
    public void mo35891f(String str) {
        C6590a.m20031a("audt", (Object) str);
    }
}
