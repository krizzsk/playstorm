package com.bytedance.sdk.openadsdk.core.video.p163b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.p109c.C2823a;
import com.bytedance.sdk.component.p120e.C2913b;
import com.bytedance.sdk.component.p120e.p121a.C2912a;
import com.bytedance.sdk.component.p120e.p122b.C2914a;
import com.bytedance.sdk.component.p120e.p122b.C2918c;
import com.bytedance.sdk.component.p125f.C2952e;
import com.bytedance.sdk.component.p125f.C2955g;
import com.bytedance.sdk.component.utils.C2958a;
import com.bytedance.sdk.component.utils.C2963e;
import com.bytedance.sdk.component.utils.C2964f;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.core.C3400a;
import com.bytedance.sdk.openadsdk.core.C3524h;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.p176i.C3854d;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.video.b.a */
/* compiled from: PlayableCache */
public class C3661a {

    /* renamed from: a */
    private static volatile C3661a f9317a;

    /* renamed from: b */
    private String f9318b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Map<C3498n, C3667b> f9319c = Collections.synchronizedMap(new HashMap());

    /* renamed from: d */
    private Map<String, JSONObject> f9320d = Collections.synchronizedMap(new HashMap());
    /* access modifiers changed from: private */

    /* renamed from: e */
    public AtomicBoolean f9321e = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Set<String> f9322f = Collections.synchronizedSet(new HashSet());

    /* renamed from: g */
    private Handler f9323g = new Handler(Looper.getMainLooper());

    /* renamed from: com.bytedance.sdk.openadsdk.core.video.b.a$a */
    /* compiled from: PlayableCache */
    public interface C3666a {
        /* renamed from: a */
        void mo19194a(boolean z);
    }

    /* renamed from: a */
    public static C3661a m11659a() {
        if (f9317a == null) {
            synchronized (C3661a.class) {
                if (f9317a == null) {
                    f9317a = new C3661a();
                }
            }
        }
        return f9317a;
    }

    private C3661a() {
    }

    /* renamed from: a */
    public boolean mo20258a(C3498n nVar) {
        if (!(!this.f9321e.get() || nVar == null || nVar.mo19607J() == null || nVar.mo19607J().mo16363k() == null)) {
            try {
                String a = C2963e.m8350a(nVar.mo19607J().mo16363k());
                if (this.f9320d.get(a) == null) {
                    return false;
                }
                return m11678e(new File(m11672c(), a));
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo20259b() {
        if (!this.f9321e.get()) {
            C2952e.m8308a(new C2955g("PlayableCache_init") {
                public void run() {
                    File[] listFiles;
                    try {
                        String a = C3661a.this.m11672c();
                        if (!TextUtils.isEmpty(a)) {
                            File file = new File(a);
                            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                                for (File a2 : listFiles) {
                                    try {
                                        JSONObject unused = C3661a.this.m11665a(C3661a.this.m11661a(a2), true);
                                    } catch (Throwable unused2) {
                                    }
                                }
                            }
                        }
                    } catch (Throwable unused3) {
                    }
                    C3661a.this.f9321e.set(true);
                }
            }, 5);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public JSONObject m11665a(File file, boolean z) {
        byte[] d;
        String str;
        try {
            if (!m11671b(file) || (d = C2964f.m8360d(file)) == null || d.length <= 0) {
                return null;
            }
            if (TextUtils.equals(file.getName(), "tt_open_ad_sdk_check_res.dat")) {
                str = C2958a.m8337b(new String(d));
            } else {
                str = C2823a.m7777a(new String(d), C3400a.m10194a());
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            if (z && jSONObject.length() > 0) {
                this.f9320d.put(file.getParentFile().getName(), jSONObject);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public File m11661a(File file) {
        File file2 = new File(file, "tt_open_ad_sdk_check_res.dat");
        if (m11671b(file2)) {
            return file2;
        }
        return new File(file, "tt_open_ad_sdk_check_res.dat");
    }

    /* renamed from: b */
    private boolean m11671b(File file) {
        return file != null && file.exists() && file.isFile() && file.canRead();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:11|12|13|(2:17|(1:19))|20|21|(1:23)(2:24|(1:26)(3:27|(2:29|(1:31)(2:32|(1:34)(2:35|(2:39|40))))|44))) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0049 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0057 A[Catch:{ all -> 0x00b1 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0058 A[Catch:{ all -> 0x00b1 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.webkit.WebResourceResponse mo20256a(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            r0 = 0
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.f9321e     // Catch:{ all -> 0x00b1 }
            boolean r1 = r1.get()     // Catch:{ all -> 0x00b1 }
            if (r1 != 0) goto L_0x000a
            return r0
        L_0x000a:
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x00b1 }
            if (r1 != 0) goto L_0x00b0
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x00b1 }
            if (r1 != 0) goto L_0x00b0
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x00b1 }
            if (r1 == 0) goto L_0x001e
            goto L_0x00b0
        L_0x001e:
            java.lang.String r1 = "http"
            boolean r1 = r7.startsWith(r1)     // Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x0049
            java.lang.String r1 = "?"
            boolean r1 = r7.contains(r1)     // Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x0049
            java.lang.String r1 = "\\?"
            java.lang.String[] r1 = r7.split(r1)     // Catch:{ all -> 0x0049 }
            r2 = 0
            r7 = r1[r2]     // Catch:{ all -> 0x0049 }
            java.lang.String r1 = "/"
            boolean r1 = r7.endsWith(r1)     // Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x0049
            int r1 = r7.length()     // Catch:{ all -> 0x0049 }
            int r1 = r1 + -1
            java.lang.String r7 = r7.substring(r2, r1)     // Catch:{ all -> 0x0049 }
        L_0x0049:
            android.content.Context r1 = com.bytedance.sdk.openadsdk.core.C3578m.m11231a()     // Catch:{ all -> 0x00b1 }
            java.lang.String r1 = com.bytedance.sdk.component.utils.C2977n.m8395a((android.content.Context) r1, (java.lang.String) r7)     // Catch:{ all -> 0x00b1 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00b1 }
            if (r2 == 0) goto L_0x0058
            return r0
        L_0x0058:
            java.lang.String r5 = com.bytedance.sdk.component.utils.C2963e.m8350a((java.lang.String) r5)     // Catch:{ all -> 0x00b1 }
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x00b1 }
            if (r2 == 0) goto L_0x0063
            return r0
        L_0x0063:
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x00b1 }
            java.lang.String r3 = r4.m11672c()     // Catch:{ all -> 0x00b1 }
            r2.<init>(r3, r5)     // Catch:{ all -> 0x00b1 }
            boolean r3 = r4.m11678e(r2)     // Catch:{ all -> 0x00b1 }
            if (r3 == 0) goto L_0x00b9
            java.lang.String r6 = r4.m11663a((java.lang.String) r6)     // Catch:{ all -> 0x00b1 }
            boolean r3 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x00b1 }
            if (r3 == 0) goto L_0x007d
            return r0
        L_0x007d:
            java.lang.String r3 = ""
            java.lang.String r6 = r7.replace(r6, r3)     // Catch:{ all -> 0x00b1 }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x00b1 }
            if (r7 == 0) goto L_0x008a
            return r0
        L_0x008a:
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x00b1 }
            r7.<init>(r2, r6)     // Catch:{ all -> 0x00b1 }
            boolean r5 = r4.m11668a((java.lang.String) r5, (java.lang.String) r6, (java.io.File) r7)     // Catch:{ all -> 0x00b1 }
            if (r5 == 0) goto L_0x00b9
            java.lang.String r5 = r7.getCanonicalPath()     // Catch:{ all -> 0x00b1 }
            java.lang.String r6 = r2.getCanonicalPath()     // Catch:{ all -> 0x00b1 }
            boolean r5 = r5.startsWith(r6)     // Catch:{ all -> 0x00b1 }
            if (r5 == 0) goto L_0x00b9
            android.webkit.WebResourceResponse r5 = new android.webkit.WebResourceResponse     // Catch:{ all -> 0x00b1 }
            java.lang.String r6 = "utf-8"
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x00b1 }
            r2.<init>(r7)     // Catch:{ all -> 0x00b1 }
            r5.<init>(r1, r6, r2)     // Catch:{ all -> 0x00b1 }
            return r5
        L_0x00b0:
            return r0
        L_0x00b1:
            r5 = move-exception
            java.lang.String r6 = "PlayableCache"
            java.lang.String r7 = "playable intercept error: "
            com.bytedance.sdk.component.utils.C2975l.m8388c(r6, r7, r5)
        L_0x00b9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.video.p163b.C3661a.mo20256a(java.lang.String, java.lang.String, java.lang.String):android.webkit.WebResourceResponse");
    }

    /* renamed from: a */
    private String m11663a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\?");
        if (split != null && split.length == 2) {
            if (split[0] != null && split[0].endsWith("/")) {
                str = str.substring(0, split.length - 1);
            }
            if (split[0] != null && split[0].endsWith("index.html")) {
                str = split[0];
            }
        }
        return str.replace("index.html", "");
    }

    /* renamed from: a */
    private boolean m11668a(String str, String str2, File file) {
        JSONObject jSONObject;
        String optString;
        if (file == null || !file.exists() || (jSONObject = this.f9320d.get(str)) == null || (optString = jSONObject.optString(str2)) == null || !optString.equalsIgnoreCase(C2963e.m8349a(file))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo20257a(C3498n nVar, C3666a aVar) {
        if (nVar == null || nVar.mo19607J() == null || TextUtils.isEmpty(nVar.mo19607J().mo16363k())) {
            C3668b.m11693a(C3578m.m11231a(), nVar, -701, (String) null);
            m11666a(aVar, false);
            return;
        }
        final String k = nVar.mo19607J().mo16363k();
        if (!this.f9322f.contains(k)) {
            this.f9319c.put(nVar, new C3667b().mo20264a(System.currentTimeMillis()));
            C3668b.m11692a(C3578m.m11231a(), nVar);
            String a = C2963e.m8350a(k);
            final File file = new File(m11672c(), a);
            if (m11678e(file)) {
                C3668b.m11693a(C3578m.m11231a(), nVar, -702, (String) null);
                m11677d(file);
                this.f9319c.remove(nVar);
                m11666a(aVar, true);
                return;
            }
            try {
                C2964f.m8359c(file);
            } catch (Throwable unused) {
            }
            this.f9322f.add(k);
            String d = m11675d();
            File file2 = new File(d, a + ".zip");
            C2914a d2 = C3854d.m12660a().mo20705b().mo17763d();
            d2.mo17789a(k);
            d2.mo17784a(file2.getParent(), file2.getName());
            final C3498n nVar2 = nVar;
            final C3666a aVar2 = aVar;
            d2.mo17783a((C2912a) new C2912a() {
                /* renamed from: a */
                public void mo17771a(C2918c cVar, final C2913b bVar) {
                    C3661a.this.f9322f.remove(k);
                    final C3667b bVar2 = (C3667b) C3661a.this.f9319c.remove(nVar2);
                    if (bVar2 != null) {
                        bVar2.mo20266b(System.currentTimeMillis());
                    }
                    if (!bVar.mo17779f() || bVar.mo17778e() == null || !bVar.mo17778e().exists()) {
                        int i = -700;
                        if (bVar.mo17773a() != 0) {
                            i = bVar.mo17773a();
                        }
                        C3668b.m11693a(C3578m.m11231a(), nVar2, i, (String) null);
                        C2975l.m8387c("PlayableCache", "onResponse: Playable zip download fail");
                        C3661a.this.m11666a(aVar2, false);
                        return;
                    }
                    C2975l.m8387c("PlayableCache", "onResponse: Playable zip download success");
                    C2952e.m8308a(new C2955g("downloadZip") {
                        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|(10:1|2|(1:4)|5|(1:7)|8|(1:10)(1:11)|12|13|14)|17|18|19|21) */
                        /* JADX WARNING: Failed to process nested try/catch */
                        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x008b */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public void run() {
                            /*
                                r7 = this;
                                r0 = 1
                                com.bytedance.sdk.openadsdk.core.video.b.a$b r1 = r4     // Catch:{ all -> 0x0071 }
                                if (r1 == 0) goto L_0x000e
                                com.bytedance.sdk.openadsdk.core.video.b.a$b r1 = r4     // Catch:{ all -> 0x0071 }
                                long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0071 }
                                r1.mo20267c(r2)     // Catch:{ all -> 0x0071 }
                            L_0x000e:
                                com.bytedance.sdk.component.e.b r1 = r5     // Catch:{ all -> 0x0071 }
                                java.io.File r1 = r1.mo17778e()     // Catch:{ all -> 0x0071 }
                                java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ all -> 0x0071 }
                                com.bytedance.sdk.openadsdk.core.video.b.a$2 r2 = com.bytedance.sdk.openadsdk.core.video.p163b.C3661a.C36632.this     // Catch:{ all -> 0x0071 }
                                com.bytedance.sdk.openadsdk.core.video.b.a r2 = com.bytedance.sdk.openadsdk.core.video.p163b.C3661a.this     // Catch:{ all -> 0x0071 }
                                java.lang.String r2 = r2.m11672c()     // Catch:{ all -> 0x0071 }
                                com.bytedance.sdk.component.utils.C2991y.m8470a(r1, r2)     // Catch:{ all -> 0x0071 }
                                com.bytedance.sdk.openadsdk.core.video.b.a$b r1 = r4     // Catch:{ all -> 0x0071 }
                                if (r1 == 0) goto L_0x0030
                                com.bytedance.sdk.openadsdk.core.video.b.a$b r1 = r4     // Catch:{ all -> 0x0071 }
                                long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0071 }
                                r1.mo20268d(r2)     // Catch:{ all -> 0x0071 }
                            L_0x0030:
                                com.bytedance.sdk.openadsdk.core.video.b.a$b r1 = r4     // Catch:{ all -> 0x0071 }
                                r2 = 0
                                if (r1 == 0) goto L_0x0045
                                com.bytedance.sdk.openadsdk.core.video.b.a$b r1 = r4     // Catch:{ all -> 0x0071 }
                                long r2 = r1.mo20263a()     // Catch:{ all -> 0x0071 }
                                com.bytedance.sdk.openadsdk.core.video.b.a$b r1 = r4     // Catch:{ all -> 0x0071 }
                                long r4 = r1.mo20265b()     // Catch:{ all -> 0x0071 }
                                r5 = r4
                                r3 = r2
                                goto L_0x0047
                            L_0x0045:
                                r5 = r2
                                r3 = r5
                            L_0x0047:
                                android.content.Context r1 = com.bytedance.sdk.openadsdk.core.C3578m.m11231a()     // Catch:{ all -> 0x0071 }
                                com.bytedance.sdk.openadsdk.core.video.b.a$2 r2 = com.bytedance.sdk.openadsdk.core.video.p163b.C3661a.C36632.this     // Catch:{ all -> 0x0071 }
                                com.bytedance.sdk.openadsdk.core.e.n r2 = r5     // Catch:{ all -> 0x0071 }
                                com.bytedance.sdk.openadsdk.core.video.p163b.C3668b.m11694a((android.content.Context) r1, (com.bytedance.sdk.openadsdk.core.p151e.C3498n) r2, (long) r3, (long) r5)     // Catch:{ all -> 0x0071 }
                                com.bytedance.sdk.openadsdk.core.video.b.a$2 r1 = com.bytedance.sdk.openadsdk.core.video.p163b.C3661a.C36632.this     // Catch:{ all -> 0x0071 }
                                com.bytedance.sdk.openadsdk.core.video.b.a r1 = com.bytedance.sdk.openadsdk.core.video.p163b.C3661a.this     // Catch:{ all -> 0x0071 }
                                com.bytedance.sdk.openadsdk.core.video.b.a$2 r2 = com.bytedance.sdk.openadsdk.core.video.p163b.C3661a.C36632.this     // Catch:{ all -> 0x0071 }
                                java.io.File r2 = r6     // Catch:{ all -> 0x0071 }
                                r1.m11674c((java.io.File) r2)     // Catch:{ all -> 0x0071 }
                                com.bytedance.sdk.openadsdk.core.video.b.a$2 r1 = com.bytedance.sdk.openadsdk.core.video.p163b.C3661a.C36632.this     // Catch:{ all -> 0x008b }
                                com.bytedance.sdk.openadsdk.core.video.b.a r1 = com.bytedance.sdk.openadsdk.core.video.p163b.C3661a.this     // Catch:{ all -> 0x008b }
                                com.bytedance.sdk.openadsdk.core.video.b.a$2 r2 = com.bytedance.sdk.openadsdk.core.video.p163b.C3661a.C36632.this     // Catch:{ all -> 0x008b }
                                java.io.File r2 = r6     // Catch:{ all -> 0x008b }
                                java.io.File r1 = r1.m11661a((java.io.File) r2)     // Catch:{ all -> 0x008b }
                                com.bytedance.sdk.openadsdk.core.video.b.a$2 r2 = com.bytedance.sdk.openadsdk.core.video.p163b.C3661a.C36632.this     // Catch:{ all -> 0x008b }
                                com.bytedance.sdk.openadsdk.core.video.b.a r2 = com.bytedance.sdk.openadsdk.core.video.p163b.C3661a.this     // Catch:{ all -> 0x008b }
                                org.json.JSONObject unused = r2.m11665a((java.io.File) r1, (boolean) r0)     // Catch:{ all -> 0x008b }
                                goto L_0x008b
                            L_0x0071:
                                r0 = move-exception
                                java.lang.String r1 = "PlayableCache"
                                java.lang.String r2 = "unzip error: "
                                com.bytedance.sdk.component.utils.C2975l.m8388c(r1, r2, r0)
                                android.content.Context r1 = com.bytedance.sdk.openadsdk.core.C3578m.m11231a()
                                com.bytedance.sdk.openadsdk.core.video.b.a$2 r2 = com.bytedance.sdk.openadsdk.core.video.p163b.C3661a.C36632.this
                                com.bytedance.sdk.openadsdk.core.e.n r2 = r5
                                r3 = -704(0xfffffffffffffd40, float:NaN)
                                java.lang.String r0 = r0.getMessage()
                                com.bytedance.sdk.openadsdk.core.video.p163b.C3668b.m11693a((android.content.Context) r1, (com.bytedance.sdk.openadsdk.core.p151e.C3498n) r2, (int) r3, (java.lang.String) r0)
                                r0 = 0
                            L_0x008b:
                                com.bytedance.sdk.component.e.b r1 = r5     // Catch:{ all -> 0x0094 }
                                java.io.File r1 = r1.mo17778e()     // Catch:{ all -> 0x0094 }
                                r1.delete()     // Catch:{ all -> 0x0094 }
                            L_0x0094:
                                com.bytedance.sdk.openadsdk.core.video.b.a$2 r1 = com.bytedance.sdk.openadsdk.core.video.p163b.C3661a.C36632.this
                                com.bytedance.sdk.openadsdk.core.video.b.a r1 = com.bytedance.sdk.openadsdk.core.video.p163b.C3661a.this
                                com.bytedance.sdk.openadsdk.core.video.b.a$2 r2 = com.bytedance.sdk.openadsdk.core.video.p163b.C3661a.C36632.this
                                com.bytedance.sdk.openadsdk.core.video.b.a$a r2 = r7
                                r1.m11666a((com.bytedance.sdk.openadsdk.core.video.p163b.C3661a.C3666a) r2, (boolean) r0)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.video.p163b.C3661a.C36632.C36641.run():void");
                        }
                    }, 5);
                }

                /* renamed from: a */
                public void mo17772a(C2918c cVar, IOException iOException) {
                    C3661a.this.f9322f.remove(k);
                    C3661a.this.f9319c.remove(nVar2);
                    C3668b.m11693a(C3578m.m11231a(), nVar2, -700, iOException.getMessage());
                    C3661a.this.m11666a(aVar2, false);
                    C2975l.m8387c("PlayableCache", "onFailure: Playable zip download fail");
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11666a(final C3666a aVar, final boolean z) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (aVar != null) {
                aVar.mo19194a(z);
            }
        } else if (aVar != null) {
            this.f9323g.post(new Runnable() {
                public void run() {
                    C3666a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo19194a(z);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m11674c(File file) {
        m11677d(file);
        try {
            C3524h.m10852d().mo19866p().mo18365a(file);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    private void m11677d(File file) {
        try {
            if (file.exists()) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!file.setLastModified(currentTimeMillis)) {
                    file.renameTo(file);
                    if (file.lastModified() < currentTimeMillis) {
                        C2975l.m8390d("PlayableCache", "Last modified date " + new Date(file.lastModified()) + " is not set for file " + file.getAbsolutePath());
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    private boolean m11678e(File file) {
        String[] list;
        if (file == null || !file.isDirectory() || (list = file.list()) == null || list.length <= 0) {
            return false;
        }
        return Arrays.asList(list).contains("index.html");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public String m11672c() {
        File file = new File(m11675d(), "games");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    /* renamed from: d */
    private String m11675d() {
        if (TextUtils.isEmpty(this.f9318b)) {
            try {
                File file = new File(C3578m.m11231a().getCacheDir(), "playable");
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.f9318b = file.getAbsolutePath();
            } catch (Throwable th) {
                C2975l.m8391e("PlayableCache", "init root path error: " + th);
            }
        }
        return this.f9318b;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.video.b.a$b */
    /* compiled from: PlayableCache */
    private static class C3667b {

        /* renamed from: a */
        long f9336a;

        /* renamed from: b */
        long f9337b;

        /* renamed from: c */
        long f9338c;

        /* renamed from: d */
        long f9339d;

        private C3667b() {
        }

        /* renamed from: a */
        public long mo20263a() {
            return this.f9337b - this.f9336a;
        }

        /* renamed from: b */
        public long mo20265b() {
            return this.f9339d - this.f9338c;
        }

        /* renamed from: a */
        public C3667b mo20264a(long j) {
            this.f9336a = j;
            return this;
        }

        /* renamed from: b */
        public C3667b mo20266b(long j) {
            this.f9337b = j;
            return this;
        }

        /* renamed from: c */
        public C3667b mo20267c(long j) {
            this.f9338c = j;
            return this;
        }

        /* renamed from: d */
        public C3667b mo20268d(long j) {
            this.f9339d = j;
            return this;
        }
    }
}
