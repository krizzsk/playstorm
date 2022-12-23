package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: com.fyber.inneractive.sdk.network.p0 */
public class C4568p0 extends C4546h implements C4544g {

    /* renamed from: a */
    public final OkHttpClient f11360a = new OkHttpClient();

    /* renamed from: b */
    public Response f11361b = null;

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x010c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> com.fyber.inneractive.sdk.network.C4551j mo24748a(com.fyber.inneractive.sdk.network.C4532b0<T> r11, java.lang.String r12, java.lang.String r13) throws java.lang.Exception {
        /*
            r10 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "OkHttpExecutorImpl"
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "%s okhttp network stack is in use"
            com.fyber.inneractive.sdk.util.IAlog.m16699a(r1, r0)
            okhttp3.Request$Builder r0 = new okhttp3.Request$Builder
            r0.<init>()
            java.lang.String r1 = "Accept-Encoding"
            java.lang.String r3 = "gzip"
            r10.mo24766a((okhttp3.Request.Builder) r0, (java.lang.String) r1, (java.lang.String) r3)
            java.lang.String r1 = "User-Agent"
            r10.mo24766a((okhttp3.Request.Builder) r0, (java.lang.String) r1, (java.lang.String) r12)
            java.lang.String r12 = "If-Modified-Since"
            r10.mo24766a((okhttp3.Request.Builder) r0, (java.lang.String) r12, (java.lang.String) r13)
            java.util.Map r12 = r11.mo24732q()
            if (r12 == 0) goto L_0x0047
            java.util.Set r13 = r12.keySet()
            java.util.Iterator r13 = r13.iterator()
        L_0x0031:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x0047
            java.lang.Object r1 = r13.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r4 = r12.get(r1)
            java.lang.String r4 = (java.lang.String) r4
            r10.mo24766a((okhttp3.Request.Builder) r0, (java.lang.String) r1, (java.lang.String) r4)
            goto L_0x0031
        L_0x0047:
            java.lang.String r12 = r11.mo24715a()
            r0.url((java.lang.String) r12)
            com.fyber.inneractive.sdk.network.y r12 = r11.mo24730n()
            com.fyber.inneractive.sdk.network.y r13 = com.fyber.inneractive.sdk.network.C4586y.f11396b
            if (r12 == r13) goto L_0x005e
            com.fyber.inneractive.sdk.network.y r12 = r11.mo24730n()
            com.fyber.inneractive.sdk.network.y r13 = com.fyber.inneractive.sdk.network.C4586y.PUT
            if (r12 != r13) goto L_0x0071
        L_0x005e:
            byte[] r12 = r11.mo24727k()
            if (r12 == 0) goto L_0x011d
            java.lang.String r13 = "application/json; charset=utf-8"
            okhttp3.MediaType r13 = okhttp3.MediaType.parse(r13)
            okhttp3.RequestBody r12 = okhttp3.RequestBody.create(r12, r13)
            r0.post(r12)
        L_0x0071:
            okhttp3.Request r12 = r0.build()
            com.fyber.inneractive.sdk.network.o0 r11 = r11.mo24725i()
            okhttp3.OkHttpClient r13 = r10.f11360a
            okhttp3.OkHttpClient$Builder r13 = r13.newBuilder()
            int r0 = r11.f11333a
            long r0 = (long) r0
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            okhttp3.OkHttpClient$Builder r13 = r13.connectTimeout(r0, r4)
            int r11 = r11.f11334b
            long r0 = (long) r11
            okhttp3.OkHttpClient$Builder r11 = r13.readTimeout(r0, r4)
            r11.build()
            okhttp3.OkHttpClient r11 = r10.f11360a
            okhttp3.Call r11 = r11.newCall(r12)
            okhttp3.Response r11 = r11.execute()
            r10.f11361b = r11
            if (r11 == 0) goto L_0x00a5
            int r11 = r11.code()
            goto L_0x00a6
        L_0x00a5:
            r11 = -1
        L_0x00a6:
            r6 = r11
            okhttp3.Response r11 = r10.f11361b
            if (r11 == 0) goto L_0x00b0
            java.lang.String r11 = r11.message()
            goto L_0x00b2
        L_0x00b0:
            java.lang.String r11 = ""
        L_0x00b2:
            r7 = r11
            r11 = 0
            okhttp3.Response r12 = r10.f11361b     // Catch:{ Exception -> 0x00e2 }
            if (r12 == 0) goto L_0x00e2
            okhttp3.ResponseBody r12 = r12.body()     // Catch:{ Exception -> 0x00e2 }
            if (r12 == 0) goto L_0x00e2
            java.lang.String r12 = "content-encoding"
            okhttp3.Response r13 = r10.f11361b     // Catch:{ Exception -> 0x00e2 }
            if (r13 == 0) goto L_0x00cd
            okhttp3.Headers r13 = r13.headers()     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r12 = r13.get(r12)     // Catch:{ Exception -> 0x00e2 }
            goto L_0x00ce
        L_0x00cd:
            r12 = r11
        L_0x00ce:
            boolean r12 = android.text.TextUtils.equals(r3, r12)     // Catch:{ Exception -> 0x00e2 }
            okhttp3.Response r13 = r10.f11361b     // Catch:{ Exception -> 0x00e2 }
            okhttp3.ResponseBody r13 = r13.body()     // Catch:{ Exception -> 0x00e2 }
            java.io.InputStream r13 = r13.byteStream()     // Catch:{ Exception -> 0x00e2 }
            java.io.InputStream r12 = r10.mo24751a(r13, r12)     // Catch:{ Exception -> 0x00e2 }
            r5 = r12
            goto L_0x00e3
        L_0x00e2:
            r5 = r11
        L_0x00e3:
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            okhttp3.Response r12 = r10.f11361b
            if (r12 == 0) goto L_0x0108
            okhttp3.Headers r12 = r12.headers()
        L_0x00f0:
            int r13 = r12.size()
            if (r2 >= r13) goto L_0x0108
            java.lang.String r13 = r12.name(r2)
            java.lang.String r0 = r12.get(r13)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r8.put(r13, r0)
            int r2 = r2 + 1
            goto L_0x00f0
        L_0x0108:
            okhttp3.Response r12 = r10.f11361b
            if (r12 == 0) goto L_0x0116
            okhttp3.Headers r11 = r12.headers()
            java.lang.String r12 = "Last-Modified"
            java.lang.String r11 = r11.get(r12)
        L_0x0116:
            r9 = r11
            r4 = r10
            com.fyber.inneractive.sdk.network.j r11 = r4.mo24750a(r5, r6, r7, r8, r9)
            return r11
        L_0x011d:
            java.lang.Exception r11 = new java.lang.Exception
            java.lang.String r12 = "Could not create ok http request. post payload is null"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.C4568p0.mo24748a(com.fyber.inneractive.sdk.network.b0, java.lang.String, java.lang.String):com.fyber.inneractive.sdk.network.j");
    }

    /* renamed from: b */
    public void mo24749b() {
        try {
            Response response = this.f11361b;
            if (response != null) {
                response.close();
                if (this.f11361b.body() != null) {
                    this.f11361b.body().close();
                }
            }
        } catch (Throwable th) {
            IAlog.m16699a("%s exception during disconnect with exception %s", "OkHttpExecutorImpl", th);
        }
        this.f11361b = null;
    }

    /* renamed from: a */
    public final void mo24766a(Request.Builder builder, String str, String str2) {
        int i = IAlog.f14137a;
        IAlog.m16697a(1, (Exception) null, "%s %s : %s", "REQUEST_HEADER", str, str2);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            builder.addHeader(str, str2);
        }
    }
}
