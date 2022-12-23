package com.bytedance.sdk.component.adexpress.p091a.p093b;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.p101c.C2696c;
import com.bytedance.sdk.component.adexpress.p091a.p094c.C2614a;
import com.bytedance.sdk.component.adexpress.p091a.p094c.C2616b;
import com.bytedance.sdk.component.adexpress.p091a.p094c.C2617c;
import com.bytedance.sdk.component.p125f.C2952e;
import com.bytedance.sdk.component.p125f.C2955g;
import com.bytedance.sdk.component.utils.C2964f;
import java.io.File;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.a.b.a */
/* compiled from: TTDynamic */
public class C2603a {

    /* renamed from: a */
    static Object f5566a = new Object();

    /* renamed from: a */
    public static void m6638a() {
        C2605b.m6649a();
        C2696c.m7294a().mo17190c();
    }

    /* renamed from: b */
    public static void m6643b() {
        try {
            C2613e.m6692d();
            File f = C2605b.m6655f();
            if (f != null && f.exists()) {
                if (f.getParentFile() != null) {
                    C2964f.m8359c(f.getParentFile());
                } else {
                    C2964f.m8359c(f);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m6640a(C2617c cVar) {
        C2611d.m6675a().mo16666a(cVar, cVar.f5614f);
    }

    /* renamed from: c */
    public static String m6645c() {
        return C2609c.m6667c();
    }

    /* renamed from: a */
    public static C2616b m6637a(String str) {
        return C2611d.m6675a().mo16665a(str);
    }

    /* renamed from: b */
    public static Set<String> m6642b(String str) {
        return C2611d.m6675a().mo16668b(str);
    }

    /* renamed from: c */
    public static C2616b m6644c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C2616b a = C2611d.m6675a().mo16665a(str);
        if (a != null) {
            a.mo16689a(Long.valueOf(System.currentTimeMillis()));
            m6639a(a);
        }
        return a;
    }

    /* renamed from: a */
    private static void m6639a(final C2616b bVar) {
        C2952e.m8308a(new C2955g("updateTmplTime") {
            public void run() {
                synchronized (C2603a.f5566a) {
                    C2609c.m6666a().mo16659a(bVar);
                }
            }
        }, 10);
    }

    /* renamed from: d */
    public static C2614a m6646d() {
        return C2605b.m6649a().mo16652d();
    }

    /* renamed from: e */
    public static String m6647e() {
        if (m6646d() == null) {
            return null;
        }
        return m6646d().mo16675c();
    }

    /* renamed from: f */
    public static boolean m6648f() {
        return C2605b.m6649a().mo16651c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005a, code lost:
        if (r2.mo16685b().equals(r6) != false) goto L_0x005d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f A[SYNTHETIC, Splitter:B:18:0x005f] */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.webkit.WebResourceResponse m6636a(java.lang.String r4, com.bytedance.sdk.component.adexpress.p096c.C2643c.C2644a r5, java.lang.String r6) {
        /*
            boolean r0 = m6648f()
            r1 = 0
            if (r0 == 0) goto L_0x005c
            com.bytedance.sdk.component.adexpress.a.c.a r0 = m6646d()
            java.util.List r0 = r0.mo16679e()
            java.util.Iterator r0 = r0.iterator()
        L_0x0013:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x005c
            java.lang.Object r2 = r0.next()
            com.bytedance.sdk.component.adexpress.a.c.a$a r2 = (com.bytedance.sdk.component.adexpress.p091a.p094c.C2614a.C2615a) r2
            java.lang.String r3 = r2.mo16682a()
            if (r3 == 0) goto L_0x0013
            java.lang.String r3 = r2.mo16682a()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0013
            java.lang.String r4 = r2.mo16682a()
            java.lang.String r4 = com.bytedance.sdk.component.utils.C2963e.m8350a((java.lang.String) r4)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            r6 = r4
        L_0x003f:
            java.io.File r4 = new java.io.File
            java.io.File r0 = com.bytedance.sdk.component.adexpress.p091a.p093b.C2605b.m6655f()
            r4.<init>(r0, r6)
            java.lang.String r6 = com.bytedance.sdk.component.utils.C2963e.m8349a((java.io.File) r4)
            java.lang.String r0 = r2.mo16685b()
            if (r0 == 0) goto L_0x005c
            java.lang.String r0 = r2.mo16685b()
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x005d
        L_0x005c:
            r4 = r1
        L_0x005d:
            if (r4 == 0) goto L_0x0079
            android.webkit.WebResourceResponse r6 = new android.webkit.WebResourceResponse     // Catch:{ all -> 0x0071 }
            java.lang.String r5 = r5.mo16812a()     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = "utf-8"
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0071 }
            r2.<init>(r4)     // Catch:{ all -> 0x0071 }
            r6.<init>(r5, r0, r2)     // Catch:{ all -> 0x0071 }
            r1 = r6
            goto L_0x0079
        L_0x0071:
            r4 = move-exception
            java.lang.String r5 = "TTDynamic"
            java.lang.String r6 = "get html WebResourceResponse error"
            com.bytedance.sdk.component.utils.C2975l.m8388c(r5, r6, r4)
        L_0x0079:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.p091a.p093b.C2603a.m6636a(java.lang.String, com.bytedance.sdk.component.adexpress.c.c$a, java.lang.String):android.webkit.WebResourceResponse");
    }

    /* renamed from: a */
    public static boolean m6641a(JSONObject jSONObject) {
        Object opt;
        if (jSONObject == null || (opt = jSONObject.opt("template_Plugin")) == null || TextUtils.isEmpty(opt.toString())) {
            return false;
        }
        return true;
    }
}
