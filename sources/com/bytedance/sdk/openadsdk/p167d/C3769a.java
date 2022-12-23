package com.bytedance.sdk.openadsdk.p167d;

import android.content.Context;
import com.bytedance.sdk.component.p104b.p105a.C2806e;
import com.bytedance.sdk.component.p104b.p105a.C2820m;
import com.bytedance.sdk.component.p110d.C2829b;
import com.bytedance.sdk.component.p110d.C2877d;
import com.bytedance.sdk.component.p110d.C2893e;
import com.bytedance.sdk.component.p110d.C2897i;
import com.bytedance.sdk.component.p110d.C2900l;
import com.bytedance.sdk.component.p110d.C2901m;
import com.bytedance.sdk.component.p110d.C2906r;
import com.bytedance.sdk.component.p110d.p112b.C2833d;
import com.bytedance.sdk.component.p110d.p112b.C2834e;
import com.bytedance.sdk.component.p110d.p113c.C2858b;
import com.bytedance.sdk.component.p110d.p113c.C2871e;
import com.bytedance.sdk.component.p110d.p113c.p114a.C2837a;
import com.bytedance.sdk.component.p125f.C2952e;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p151e.C3484k;
import com.bytedance.sdk.openadsdk.utils.C4012s;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.d.a */
/* compiled from: ImageLoaderWrapper */
public class C3769a {
    /* renamed from: a */
    public static C2897i m12388a(String str) {
        return C3770a.m12400b(str);
    }

    /* renamed from: a */
    public static C2897i m12387a(C3484k kVar) {
        return C3770a.m12399b(kVar);
    }

    /* renamed from: a */
    public static InputStream m12390a(String str, String str2) {
        return C3770a.m12401b(str, str2);
    }

    /* renamed from: a */
    public static boolean m12391a(String str, String str2, String str3) {
        return C3770a.m12402b(str, str2, str3);
    }

    /* renamed from: a */
    public static C2901m m12389a() {
        return C3770a.f9818a;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.d.a$a */
    /* compiled from: ImageLoaderWrapper */
    private static final class C3770a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static C2901m f9818a = m12396a(C3578m.m11231a());

        /* renamed from: a */
        private static C2901m m12396a(Context context) {
            return C2858b.m7919a(context, (C2900l) new C2871e.C2873a().mo17738a((C2829b) new C2837a(Math.max(Math.min(Long.valueOf(Runtime.getRuntime().maxMemory()).intValue() / 16, 83886080), 10485760), 41943040, new File(CacheDirFactory.getImageCacheDir()))).mo17740a(C2952e.m8305a(5)).mo17739a((C2877d) new C2877d() {
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.io.Closeable} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.bytedance.sdk.component.d.b.e} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.bytedance.sdk.component.d.b.e} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: com.bytedance.sdk.component.d.b.e} */
                /* JADX WARNING: Multi-variable type inference failed */
                /* renamed from: b */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public com.bytedance.sdk.component.p110d.p112b.C2833d mo17610a(com.bytedance.sdk.component.p110d.C2893e r7) {
                    /*
                        r6 = this;
                        com.bytedance.sdk.openadsdk.i.d r0 = com.bytedance.sdk.openadsdk.p176i.C3854d.m12660a()
                        com.bytedance.sdk.component.e.a r0 = r0.mo20705b()
                        com.bytedance.sdk.component.b.a.i r0 = r0.mo17764e()
                        com.bytedance.sdk.component.b.a.k$a r1 = new com.bytedance.sdk.component.b.a.k$a
                        r1.<init>()
                        java.lang.String r2 = r7.mo17612a()
                        com.bytedance.sdk.component.b.a.k$a r1 = r1.mo17594a((java.lang.String) r2)
                        com.bytedance.sdk.component.b.a.k$a r1 = r1.mo17589a()
                        com.bytedance.sdk.component.b.a.k r1 = r1.mo17597b()
                        boolean r2 = r7.mo17614c()
                        r3 = 0
                        if (r2 == 0) goto L_0x002e
                        com.bytedance.sdk.component.d.b.e r2 = new com.bytedance.sdk.component.d.b.e
                        r2.<init>()
                        goto L_0x002f
                    L_0x002e:
                        r2 = r3
                    L_0x002f:
                        if (r2 == 0) goto L_0x0038
                        long r4 = java.lang.System.currentTimeMillis()
                        r2.mo17622a(r4)
                    L_0x0038:
                        com.bytedance.sdk.component.b.a.b r0 = r0.mo17476a(r1)     // Catch:{ all -> 0x0070 }
                        com.bytedance.sdk.component.b.a.m r3 = r0.mo17467a()     // Catch:{ all -> 0x0070 }
                        if (r2 == 0) goto L_0x0049
                        long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0070 }
                        r2.mo17623b(r0)     // Catch:{ all -> 0x0070 }
                    L_0x0049:
                        java.util.Map r7 = r6.m12404a((com.bytedance.sdk.component.p110d.C2893e) r7, (com.bytedance.sdk.component.p104b.p105a.C2820m) r3)     // Catch:{ all -> 0x0070 }
                        com.bytedance.sdk.component.b.a.n r0 = r3.mo17501f()     // Catch:{ all -> 0x0070 }
                        byte[] r0 = r0.mo17509d()     // Catch:{ all -> 0x0070 }
                        if (r2 == 0) goto L_0x005e
                        long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0070 }
                        r2.mo17624c(r4)     // Catch:{ all -> 0x0070 }
                    L_0x005e:
                        com.bytedance.sdk.component.d.b.d r1 = new com.bytedance.sdk.component.d.b.d     // Catch:{ all -> 0x0070 }
                        int r4 = r3.mo17497c()     // Catch:{ all -> 0x0070 }
                        java.lang.String r5 = ""
                        r1.<init>(r4, r0, r5, r7)     // Catch:{ all -> 0x0070 }
                        r1.mo17616a(r2)     // Catch:{ all -> 0x0070 }
                        com.bytedance.sdk.component.p110d.p113c.p118c.C2868b.m7999a(r3)
                        return r1
                    L_0x0070:
                        r7 = move-exception
                        com.bytedance.sdk.component.d.b.d r7 = r6.m12403a((com.bytedance.sdk.component.p110d.p112b.C2834e) r2, (java.lang.Throwable) r7)     // Catch:{ all -> 0x0079 }
                        com.bytedance.sdk.component.p110d.p113c.p118c.C2868b.m7999a(r3)
                        return r7
                    L_0x0079:
                        r7 = move-exception
                        com.bytedance.sdk.component.p110d.p113c.p118c.C2868b.m7999a(r3)
                        throw r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p167d.C3769a.C3770a.C37711.mo17610a(com.bytedance.sdk.component.d.e):com.bytedance.sdk.component.d.b.d");
                }

                /* renamed from: a */
                private Map<String, String> m12404a(C2893e eVar, C2820m mVar) {
                    if (!eVar.mo17613b()) {
                        return null;
                    }
                    C2806e g = mVar.mo17502g();
                    HashMap hashMap = new HashMap();
                    int a = g.mo17553a();
                    for (int i = 0; i < a; i++) {
                        String a2 = g.mo17554a(i);
                        String b = g.mo17555b(i);
                        if (a2 != null) {
                            hashMap.put(a2, b);
                        }
                    }
                    return hashMap;
                }

                /* renamed from: a */
                private C2833d m12403a(C2834e eVar, Throwable th) {
                    C2975l.m8390d("ImageLoaderWrapper", th.getMessage());
                    if (eVar != null) {
                        eVar.mo17624c(System.currentTimeMillis());
                    }
                    C2833d dVar = new C2833d(0, th, "net failed");
                    dVar.mo17616a(eVar);
                    return dVar;
                }
            }).mo17741a());
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static C2897i m12400b(String str) {
            return m12392a(f9818a.mo17677a(str));
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static C2897i m12399b(C3484k kVar) {
            return m12392a(f9818a.mo17677a(kVar.mo19559a()).mo17712a(kVar.mo19563b()).mo17719b(kVar.mo19566c()).mo17717a(kVar.mo19570g()));
        }

        /* renamed from: a */
        private static C2897i m12392a(C2897i iVar) {
            return C4012s.m13170a() ? iVar.mo17715a((C2906r) new C3772b()) : iVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static InputStream m12401b(String str, String str2) {
            return f9818a.mo17678a(str, str2);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static boolean m12402b(String str, String str2, String str3) {
            return f9818a.mo17679a(str, str2, str3);
        }
    }
}
