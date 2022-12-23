package com.tapjoy.internal;

import android.graphics.Bitmap;
import com.tapjoy.internal.C11422aj;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;

/* renamed from: com.tapjoy.internal.ih */
public final class C11766ih {

    /* renamed from: e */
    public static final C11444bc<C11766ih> f28662e = new C11444bc<C11766ih>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo72202a(C11452bh bhVar) {
            return new C11766ih(bhVar);
        }
    };

    /* renamed from: f */
    private static final C11420ah<URL, Bitmap> f28663f = new C11422aj.C11423a(new C11425al());

    /* renamed from: a */
    public URL f28664a;

    /* renamed from: b */
    public Bitmap f28665b;

    /* renamed from: c */
    public byte[] f28666c;

    /* renamed from: d */
    public C11778io f28667d;

    public C11766ih(URL url) {
        this.f28664a = url;
    }

    /* renamed from: a */
    public final boolean mo72695a() {
        return (this.f28665b == null && this.f28666c == null) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0051  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72696b() {
        /*
            r10 = this;
            com.tapjoy.internal.gb r0 = com.tapjoy.internal.C11662gd.m33848b()
            java.lang.String r1 = "mm_external_cache_enabled"
            r2 = 1
            boolean r0 = r0.mo72577a(r1, r2)
            r1 = r0 ^ 1
            if (r1 == 0) goto L_0x001e
            com.tapjoy.internal.ah<java.net.URL, android.graphics.Bitmap> r2 = f28663f
            java.net.URL r3 = r10.f28664a
            java.lang.Object r2 = r2.mo72125a(r3)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            r10.f28665b = r2
            if (r2 == 0) goto L_0x001e
            return
        L_0x001e:
            if (r0 == 0) goto L_0x005f
            com.tapjoy.internal.id r2 = com.tapjoy.internal.C11756id.f28629a
            java.net.URL r3 = r10.f28664a
            java.io.File r2 = r2.mo72685a((java.net.URL) r3)
            if (r2 == 0) goto L_0x005f
            r3 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0041, all -> 0x003c }
            r4.<init>(r2)     // Catch:{ IOException -> 0x0041, all -> 0x003c }
            r10.m34162a(r4)     // Catch:{ IOException -> 0x003a, all -> 0x0037 }
            com.tapjoy.internal.C11687gp.m33922a(r4)
            goto L_0x0044
        L_0x0037:
            r0 = move-exception
            r3 = r4
            goto L_0x003d
        L_0x003a:
            r3 = r4
            goto L_0x0041
        L_0x003c:
            r0 = move-exception
        L_0x003d:
            com.tapjoy.internal.C11687gp.m33922a(r3)
            throw r0
        L_0x0041:
            com.tapjoy.internal.C11687gp.m33922a(r3)
        L_0x0044:
            android.graphics.Bitmap r3 = r10.f28665b
            if (r3 != 0) goto L_0x0051
            byte[] r3 = r10.f28666c
            if (r3 == 0) goto L_0x004d
            goto L_0x0051
        L_0x004d:
            r2.delete()
            goto L_0x005f
        L_0x0051:
            if (r1 == 0) goto L_0x005e
            android.graphics.Bitmap r0 = r10.f28665b
            if (r0 == 0) goto L_0x005e
            com.tapjoy.internal.ah<java.net.URL, android.graphics.Bitmap> r1 = f28663f
            java.net.URL r2 = r10.f28664a
            r1.mo72126a(r2, r0)
        L_0x005e:
            return
        L_0x005f:
            java.net.URL r2 = r10.f28664a
            java.net.URLConnection r2 = com.tapjoy.internal.C11631fl.m33789a(r2)
            r3 = 0
            java.lang.String r5 = "Cache-Control"
            java.lang.String r5 = r2.getHeaderField(r5)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x0099
            java.lang.String r6 = ","
            java.lang.String[] r5 = r5.split(r6)
            int r6 = r5.length
            r7 = 0
        L_0x007b:
            if (r7 >= r6) goto L_0x0099
            r8 = r5[r7]
            java.lang.String r8 = r8.trim()
            java.lang.String r9 = "max-age="
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x0096
            r5 = 8
            java.lang.String r5 = r8.substring(r5)
            long r3 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x0099 }
            goto L_0x0099
        L_0x0096:
            int r7 = r7 + 1
            goto L_0x007b
        L_0x0099:
            java.io.InputStream r2 = r2.getInputStream()
            java.io.ByteArrayInputStream r5 = r10.m34162a(r2)
            com.tapjoy.internal.C11687gp.m33922a(r2)
            com.tapjoy.internal.id r2 = com.tapjoy.internal.C11756id.f28629a
            boolean r2 = com.tapjoy.internal.C11756id.m34144a((long) r3)
            if (r2 == 0) goto L_0x00bd
            if (r0 == 0) goto L_0x00bd
            android.graphics.Bitmap r0 = r10.f28665b
            if (r0 != 0) goto L_0x00b6
            byte[] r0 = r10.f28666c
            if (r0 == 0) goto L_0x00bd
        L_0x00b6:
            com.tapjoy.internal.id r0 = com.tapjoy.internal.C11756id.f28629a
            java.net.URL r2 = r10.f28664a
            r0.mo72687a(r2, r5, r3)
        L_0x00bd:
            if (r1 == 0) goto L_0x00ca
            android.graphics.Bitmap r0 = r10.f28665b
            if (r0 == 0) goto L_0x00ca
            com.tapjoy.internal.ah<java.net.URL, android.graphics.Bitmap> r1 = f28663f
            java.net.URL r2 = r10.f28664a
            r1.mo72126a(r2, r0)
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11766ih.mo72696b():void");
    }

    /* renamed from: a */
    private ByteArrayInputStream m34162a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C11685gn.m33919a(inputStream, byteArrayOutputStream);
        byteArrayOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
        C11779ip ipVar = new C11779ip();
        ipVar.mo72705a(byteArray);
        C11778io a = ipVar.mo72704a();
        if (a.f28730b == 0) {
            this.f28666c = byteArray;
            this.f28667d = a;
        } else {
            C11836r rVar = C11836r.f28927a;
            this.f28665b = C11836r.m34399a((InputStream) byteArrayInputStream);
            byteArrayInputStream.reset();
        }
        return byteArrayInputStream;
    }

    C11766ih(C11452bh bhVar) {
        if (bhVar.mo72226k() == C11461bm.STRING) {
            this.f28664a = bhVar.mo72216e();
            return;
        }
        bhVar.mo72223h();
        String l = bhVar.mo72227l();
        while (bhVar.mo72225j()) {
            if ("url".equals(l)) {
                this.f28664a = bhVar.mo72216e();
            } else {
                bhVar.mo72234s();
            }
        }
        bhVar.mo72224i();
    }
}
