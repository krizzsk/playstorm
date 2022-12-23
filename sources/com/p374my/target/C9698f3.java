package com.p374my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;

/* renamed from: com.my.target.f3 */
public final class C9698f3 extends C9734h3<Bitmap> {

    /* renamed from: f */
    public final boolean f23876f;

    public C9698f3(boolean z) {
        this.f23876f = z;
    }

    /* renamed from: d */
    public static C9698f3 m28014d() {
        return new C9698f3(true);
    }

    /* renamed from: e */
    public static C9698f3 m28015e() {
        return new C9698f3(false);
    }

    /* renamed from: a */
    public final void mo64014a(C9740h8 h8Var, InputStream inputStream, String str) {
        File a = h8Var.mo64192a(inputStream, str);
        if (a == null) {
            this.f23988a = false;
            this.f23992e = "image request error: can't save image to disk cache";
            C9672e0.m27882a("image request error: can't save image to disk cache");
        } else if (!this.f23876f) {
            this.f23991d = BitmapFactory.decodeFile(a.getAbsolutePath());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64015a(com.p374my.target.C9740h8 r5, java.lang.String r6) {
        /*
            r4 = this;
            r0 = 0
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x006d }
            r2.<init>()     // Catch:{ all -> 0x006d }
            java.lang.String r3 = "send image request: "
            r2.append(r3)     // Catch:{ all -> 0x006d }
            r2.append(r6)     // Catch:{ all -> 0x006d }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x006d }
            com.p374my.target.C9672e0.m27882a(r2)     // Catch:{ all -> 0x006d }
            java.net.URL r2 = new java.net.URL     // Catch:{ all -> 0x006d }
            r2.<init>(r6)     // Catch:{ all -> 0x006d }
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ all -> 0x006d }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ all -> 0x006d }
            r1 = 10000(0x2710, float:1.4013E-41)
            r2.setReadTimeout(r1)     // Catch:{ all -> 0x006a }
            r2.setConnectTimeout(r1)     // Catch:{ all -> 0x006a }
            r1 = 1
            r2.setInstanceFollowRedirects(r1)     // Catch:{ all -> 0x006a }
            java.lang.String r1 = "connection"
            java.lang.String r3 = "close"
            r2.setRequestProperty(r1, r3)     // Catch:{ all -> 0x006a }
            r2.connect()     // Catch:{ all -> 0x006a }
            int r1 = r2.getResponseCode()     // Catch:{ all -> 0x006a }
            r4.f23990c = r1     // Catch:{ all -> 0x006a }
            r3 = 200(0xc8, float:2.8E-43)
            if (r1 != r3) goto L_0x004f
            java.io.InputStream r1 = r2.getInputStream()     // Catch:{ all -> 0x006a }
            if (r5 == 0) goto L_0x004b
            r4.mo64014a((com.p374my.target.C9740h8) r5, (java.io.InputStream) r1, (java.lang.String) r6)     // Catch:{ all -> 0x006a }
            goto L_0x008d
        L_0x004b:
            r4.mo64016a(r1)     // Catch:{ all -> 0x006a }
            goto L_0x008d
        L_0x004f:
            r4.f23988a = r0     // Catch:{ all -> 0x006a }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x006a }
            r5.<init>()     // Catch:{ all -> 0x006a }
            java.lang.String r6 = "image request error: response code "
            r5.append(r6)     // Catch:{ all -> 0x006a }
            int r6 = r4.f23990c     // Catch:{ all -> 0x006a }
            r5.append(r6)     // Catch:{ all -> 0x006a }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x006a }
            r4.f23992e = r5     // Catch:{ all -> 0x006a }
            com.p374my.target.C9672e0.m27882a(r5)     // Catch:{ all -> 0x006a }
            goto L_0x008d
        L_0x006a:
            r5 = move-exception
            r1 = r2
            goto L_0x006e
        L_0x006d:
            r5 = move-exception
        L_0x006e:
            r4.f23988a = r0
            java.lang.String r5 = r5.getMessage()
            r4.f23992e = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "image request error: "
            r5.append(r6)
            java.lang.String r6 = r4.f23992e
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.p374my.target.C9672e0.m27882a(r5)
            r2 = r1
        L_0x008d:
            if (r2 == 0) goto L_0x0092
            r2.disconnect()
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C9698f3.mo64015a(com.my.target.h8, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo64016a(InputStream inputStream) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 8192);
        this.f23991d = BitmapFactory.decodeStream(bufferedInputStream);
        try {
            bufferedInputStream.close();
        } catch (Throwable th) {
            C9672e0.m27882a(th.getMessage());
        }
    }

    /* renamed from: c */
    public Bitmap mo63942a(String str, String str2, Context context) {
        C9740h8 a = C9740h8.m28156a(context);
        if (a == null) {
            C9672e0.m27882a("unable to open disk cache and get image " + str);
            if (this.f23876f) {
                this.f23988a = false;
                this.f23992e = "image request (caching only) error: can't cache image";
                C9672e0.m27882a("image request (caching only) error: can't cache image");
                return null;
            }
        } else if (!this.f23876f) {
            T a2 = a.mo64190a(str);
            this.f23991d = a2;
            if (a2 != null) {
                this.f23989b = true;
                return (Bitmap) a2;
            }
        } else if (a.mo64197b(str) != null) {
            C9672e0.m27882a("image request (caching only): image already cached");
            this.f23989b = true;
            return null;
        }
        mo64015a(a, str);
        return (Bitmap) this.f23991d;
    }
}
