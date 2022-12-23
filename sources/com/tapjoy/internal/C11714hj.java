package com.tapjoy.internal;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.hj */
public final class C11714hj {

    /* renamed from: p */
    private static final C11714hj f28476p;

    /* renamed from: q */
    private static C11714hj f28477q;

    /* renamed from: w */
    private static Handler f28478w;

    /* renamed from: x */
    private static File f28479x;

    /* renamed from: a */
    public final C11735hr f28480a = new C11735hr(this);

    /* renamed from: b */
    public C11736hs f28481b;

    /* renamed from: c */
    public boolean f28482c = false;

    /* renamed from: d */
    public String f28483d = null;

    /* renamed from: e */
    public Context f28484e;

    /* renamed from: f */
    public C11726hm f28485f;

    /* renamed from: g */
    public C11713hi f28486g;

    /* renamed from: h */
    public C11711hh f28487h;

    /* renamed from: i */
    public String f28488i;

    /* renamed from: j */
    public boolean f28489j;

    /* renamed from: k */
    public String f28490k;

    /* renamed from: l */
    public String f28491l;

    /* renamed from: m */
    public boolean f28492m = false;

    /* renamed from: n */
    public String f28493n;

    /* renamed from: o */
    public C11716hk f28494o = C11716hk.m34031a((C11696gy) null);

    /* renamed from: r */
    private boolean f28495r = false;

    /* renamed from: s */
    private boolean f28496s = false;

    /* renamed from: t */
    private C11742hw f28497t;

    /* renamed from: u */
    private String f28498u;

    /* renamed from: v */
    private String f28499v;

    static {
        C11714hj hjVar = new C11714hj();
        f28476p = hjVar;
        f28477q = hjVar;
    }

    /* renamed from: a */
    public static C11714hj m33999a() {
        return f28477q;
    }

    private C11714hj() {
    }

    /* renamed from: b */
    public final synchronized void mo72624b(Context context) {
        if (this.f28484e == null) {
            Context applicationContext = context.getApplicationContext();
            this.f28484e = applicationContext;
            C11662gd.m33847a().mo72539a(applicationContext);
            this.f28485f = C11726hm.m34053a(applicationContext);
            File file = new File(m34004c(applicationContext), "events2");
            if (this.f28487h == null) {
                this.f28487h = new C11711hh(file);
            }
            this.f28486g = new C11713hi(this.f28485f, this.f28487h);
            this.f28497t = new C11742hw(this.f28486g);
            this.f28481b = new C11736hs(applicationContext);
            C11676gi.m33879a(new C11680gk(new File(m34004c(applicationContext), "usages"), this.f28486g));
            C11756id idVar = C11756id.f28629a;
            idVar.f28630b = applicationContext.getApplicationContext();
            idVar.f28631c = applicationContext.getSharedPreferences("tapjoyCacheDataMMF2E", 0);
            idVar.f28632d = applicationContext.getSharedPreferences("tapjoyCacheDataMMF2U", 0);
            idVar.mo72686a();
        }
    }

    /* renamed from: a */
    public final void mo72618a(String str, boolean z) {
        this.f28485f.mo72644a(str, z);
    }

    /* renamed from: a */
    public final C11609fd mo72611a(boolean z) {
        if (z) {
            this.f28485f.mo72641a();
        }
        return this.f28485f.mo72651b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo72614a(@javax.annotation.Nullable final java.lang.String r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f28489j     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x003b
            if (r6 != 0) goto L_0x000d
            java.lang.String r0 = r5.f28493n     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x000d
            java.lang.String r6 = r5.f28493n     // Catch:{ all -> 0x0041 }
        L_0x000d:
            r0 = 0
            r5.f28493n = r0     // Catch:{ all -> 0x0041 }
            if (r6 == 0) goto L_0x003f
            com.tapjoy.internal.hm r0 = r5.f28485f     // Catch:{ all -> 0x0041 }
            com.tapjoy.internal.fd r0 = r0.mo72651b()     // Catch:{ all -> 0x0041 }
            java.lang.String r1 = "GCM registration id of device {} updated: {}"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0041 }
            r3 = 0
            com.tapjoy.internal.fc r4 = r0.f28157d     // Catch:{ all -> 0x0041 }
            java.lang.String r4 = r4.f28121h     // Catch:{ all -> 0x0041 }
            r2[r3] = r4     // Catch:{ all -> 0x0041 }
            r3 = 1
            r2[r3] = r6     // Catch:{ all -> 0x0041 }
            com.tapjoy.internal.C11710hg.m33977a((java.lang.String) r1, (java.lang.Object[]) r2)     // Catch:{ all -> 0x0041 }
            com.tapjoy.internal.iv r1 = new com.tapjoy.internal.iv     // Catch:{ all -> 0x0041 }
            r1.<init>(r0, r6)     // Catch:{ all -> 0x0041 }
            com.tapjoy.internal.hj$1 r0 = new com.tapjoy.internal.hj$1     // Catch:{ all -> 0x0041 }
            r0.<init>(r6)     // Catch:{ all -> 0x0041 }
            java.util.concurrent.ExecutorService r6 = com.tapjoy.internal.C11470bu.f27743a     // Catch:{ all -> 0x0041 }
            r1.mo72256a(r0, (java.util.concurrent.ExecutorService) r6)     // Catch:{ all -> 0x0041 }
            monitor-exit(r5)
            return
        L_0x003b:
            if (r6 == 0) goto L_0x003f
            r5.f28493n = r6     // Catch:{ all -> 0x0041 }
        L_0x003f:
            monitor-exit(r5)
            return
        L_0x0041:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11714hj.mo72614a(java.lang.String):void");
    }

    /* renamed from: b */
    public final boolean mo72625b() {
        try {
            this.f28484e.getClassLoader().loadClass("com.android.installreferrer.api.InstallReferrerStateListener");
            return true;
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static void m34002a(GLSurfaceView gLSurfaceView) {
        if (C11710hg.m33978a((Object) gLSurfaceView, "setGLSurfaceView: The given GLSurfaceView was null")) {
            C11700hb.m33955a(gLSurfaceView);
        }
    }

    /* renamed from: c */
    public final Set<String> mo72627c() {
        if (!mo72628c("getUserTags")) {
            return new HashSet();
        }
        return this.f28485f.mo72656e();
    }

    /* renamed from: a */
    public final void mo72622a(Set<String> set) {
        if (mo72628c("setUserTags")) {
            if (set != null && !set.isEmpty()) {
                HashSet hashSet = new HashSet();
                for (String next : set) {
                    if (next != null) {
                        String trim = next.trim();
                        if (!trim.isEmpty() && trim.length() <= 200) {
                            hashSet.add(trim);
                            if (hashSet.size() >= 200) {
                                break;
                            }
                        }
                    }
                }
                set = hashSet;
            }
            this.f28485f.mo72645a(set);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x010c, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003d A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x005f A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0061 A[SYNTHETIC, Splitter:B:39:0x0061] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo72613a(android.content.Context r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f28489j     // Catch:{ all -> 0x0114 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)
            return
        L_0x0007:
            r3.mo72624b((android.content.Context) r4)     // Catch:{ all -> 0x0114 }
            android.content.Context r4 = r3.f28484e     // Catch:{ all -> 0x0114 }
            r0 = 0
            r1 = 1
            if (r4 == 0) goto L_0x0012
            r4 = r1
            goto L_0x0013
        L_0x0012:
            r4 = r0
        L_0x0013:
            java.lang.String r2 = "The given context was null"
            boolean r4 = com.tapjoy.internal.C11710hg.m33979a((boolean) r4, (java.lang.String) r2)     // Catch:{ all -> 0x0114 }
            if (r4 != 0) goto L_0x001d
            monitor-exit(r3)
            return
        L_0x001d:
            if (r8 == 0) goto L_0x0031
            int r4 = r8.length()     // Catch:{ all -> 0x0114 }
            r2 = 24
            if (r4 != r2) goto L_0x0031
            java.lang.String r4 = "[0-9a-f]{24}"
            boolean r4 = r8.matches(r4)     // Catch:{ all -> 0x0114 }
            if (r4 == 0) goto L_0x0031
            r4 = r1
            goto L_0x003b
        L_0x0031:
            java.lang.String r4 = "Invalid App ID: {}"
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0114 }
            r2[r0] = r8     // Catch:{ all -> 0x0114 }
            com.tapjoy.internal.C11710hg.m33981b(r4, r2)     // Catch:{ all -> 0x0114 }
            r4 = r0
        L_0x003b:
            if (r4 != 0) goto L_0x003f
            monitor-exit(r3)
            return
        L_0x003f:
            if (r9 == 0) goto L_0x0053
            int r4 = r9.length()     // Catch:{ all -> 0x0114 }
            r2 = 20
            if (r4 != r2) goto L_0x0053
            java.lang.String r4 = "[0-9A-Za-z\\-_]{20}"
            boolean r4 = r9.matches(r4)     // Catch:{ all -> 0x0114 }
            if (r4 == 0) goto L_0x0053
            r4 = r1
            goto L_0x005d
        L_0x0053:
            java.lang.String r4 = "Invalid App Key: {}"
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0114 }
            r2[r0] = r9     // Catch:{ all -> 0x0114 }
            com.tapjoy.internal.C11710hg.m33981b(r4, r2)     // Catch:{ all -> 0x0114 }
            r4 = r0
        L_0x005d:
            if (r4 != 0) goto L_0x0061
            monitor-exit(r3)
            return
        L_0x0061:
            r3.f28490k = r5     // Catch:{ all -> 0x0114 }
            r3.f28491l = r6     // Catch:{ all -> 0x0114 }
            r3.f28498u = r8     // Catch:{ all -> 0x0114 }
            r3.f28499v = r9     // Catch:{ all -> 0x0114 }
            java.net.URL r4 = new java.net.URL     // Catch:{ MalformedURLException -> 0x010d }
            r4.<init>(r7)     // Catch:{ MalformedURLException -> 0x010d }
            java.lang.String r5 = "TapjoySDK"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0114 }
            r7.<init>()     // Catch:{ all -> 0x0114 }
            r7.append(r5)     // Catch:{ all -> 0x0114 }
            java.lang.String r5 = " "
            r7.append(r5)     // Catch:{ all -> 0x0114 }
            r7.append(r6)     // Catch:{ all -> 0x0114 }
            java.lang.String r5 = " ("
            r7.append(r5)     // Catch:{ all -> 0x0114 }
            java.lang.String r5 = android.os.Build.MODEL     // Catch:{ all -> 0x0114 }
            r7.append(r5)     // Catch:{ all -> 0x0114 }
            java.lang.String r5 = "; Android "
            r7.append(r5)     // Catch:{ all -> 0x0114 }
            java.lang.String r5 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0114 }
            r7.append(r5)     // Catch:{ all -> 0x0114 }
            java.lang.String r5 = "; "
            r7.append(r5)     // Catch:{ all -> 0x0114 }
            java.util.Locale r5 = java.util.Locale.getDefault()     // Catch:{ all -> 0x0114 }
            r7.append(r5)     // Catch:{ all -> 0x0114 }
            java.lang.String r5 = ")"
            r7.append(r5)     // Catch:{ all -> 0x0114 }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x0114 }
            com.tapjoy.internal.by r6 = new com.tapjoy.internal.by     // Catch:{ all -> 0x0114 }
            r6.<init>(r5, r4)     // Catch:{ all -> 0x0114 }
            com.tapjoy.internal.C11470bu.f27744b = r6     // Catch:{ all -> 0x0114 }
            java.util.concurrent.ExecutorService r4 = java.util.concurrent.Executors.newCachedThreadPool()     // Catch:{ all -> 0x0114 }
            com.tapjoy.internal.C11470bu.f27743a = r4     // Catch:{ all -> 0x0114 }
            com.tapjoy.internal.hh r4 = r3.f28487h     // Catch:{ all -> 0x0114 }
            r4.f28466b = r6     // Catch:{ all -> 0x0114 }
            r4.mo72598a()     // Catch:{ all -> 0x0114 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x0114 }
            r3.f28489j = r1     // Catch:{ all -> 0x0114 }
            com.tapjoy.internal.hn r4 = new com.tapjoy.internal.hn     // Catch:{ all -> 0x0114 }
            android.content.Context r5 = r3.f28484e     // Catch:{ all -> 0x0114 }
            java.io.File r5 = m34005d(r5)     // Catch:{ all -> 0x0114 }
            r4.<init>(r5)     // Catch:{ all -> 0x0114 }
            java.lang.String r5 = r4.mo72659b()     // Catch:{ all -> 0x0114 }
            if (r5 == 0) goto L_0x00d3
            goto L_0x00d4
        L_0x00d3:
            r1 = r0
        L_0x00d4:
            if (r1 != 0) goto L_0x00e9
            boolean r4 = r4.mo72658a()     // Catch:{ all -> 0x0114 }
            if (r4 == 0) goto L_0x00e9
            com.tapjoy.internal.hi r4 = r3.f28486g     // Catch:{ all -> 0x0114 }
            com.tapjoy.internal.fa r5 = com.tapjoy.internal.C11601fa.APP     // Catch:{ all -> 0x0114 }
            java.lang.String r6 = "install"
            com.tapjoy.internal.ex$a r5 = r4.mo72602a((com.tapjoy.internal.C11601fa) r5, (java.lang.String) r6)     // Catch:{ all -> 0x0114 }
            r4.mo72604a((com.tapjoy.internal.C11591ex.C11592a) r5)     // Catch:{ all -> 0x0114 }
        L_0x00e9:
            com.tapjoy.internal.hm r4 = r3.f28485f     // Catch:{ all -> 0x0114 }
            boolean r5 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0114 }
            if (r5 != 0) goto L_0x010b
            com.tapjoy.internal.ht r5 = r4.f28524c     // Catch:{ all -> 0x0114 }
            com.tapjoy.internal.n r5 = r5.f28565D     // Catch:{ all -> 0x0114 }
            java.lang.String r5 = r5.mo72813a()     // Catch:{ all -> 0x0114 }
            boolean r5 = r8.equals(r5)     // Catch:{ all -> 0x0114 }
            if (r5 != 0) goto L_0x010b
            com.tapjoy.internal.ht r5 = r4.f28524c     // Catch:{ all -> 0x0114 }
            com.tapjoy.internal.n r5 = r5.f28565D     // Catch:{ all -> 0x0114 }
            r5.mo72814a(r8)     // Catch:{ all -> 0x0114 }
            com.tapjoy.internal.ht r4 = r4.f28524c     // Catch:{ all -> 0x0114 }
            r4.mo72668a((boolean) r0)     // Catch:{ all -> 0x0114 }
        L_0x010b:
            monitor-exit(r3)
            return
        L_0x010d:
            r4 = move-exception
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0114 }
            r5.<init>(r4)     // Catch:{ all -> 0x0114 }
            throw r5     // Catch:{ all -> 0x0114 }
        L_0x0114:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11714hj.mo72613a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: b */
    public final boolean mo72626b(String str) {
        if ((this.f28489j || this.f28488i != null) && this.f28484e != null) {
            return true;
        }
        C11710hg.m33984e(str);
        return false;
    }

    /* renamed from: c */
    public final boolean mo72628c(String str) {
        if (this.f28484e != null) {
            return true;
        }
        C11710hg.m33983d(str);
        return false;
    }

    /* renamed from: a */
    public final void mo72612a(Activity activity) {
        if (C11710hg.m33978a((Object) activity, "onActivityStart: The given activity was null")) {
            C11710hg.m33982c("onActivityStart");
            C11441b.m33236a(activity.getApplication());
            C11441b.m33237b(activity);
            if (mo72626b("onActivityStart") && m34006g()) {
                C11704hd.m33961b(activity);
            }
        }
    }

    /* renamed from: b */
    public final void mo72623b(Activity activity) {
        if (C11710hg.m33978a((Object) activity, "onActivityStop: The given activity was null")) {
            C11710hg.m33982c("onActivityStop");
            C11441b.m33240c(activity);
            if (mo72626b("onActivityStop") && !C11441b.m33238b()) {
                this.f28497t.mo72677b();
            }
        }
    }

    /* renamed from: d */
    public final boolean mo72629d() {
        C11742hw hwVar = this.f28497t;
        return hwVar != null && hwVar.f28602b.get();
    }

    /* renamed from: e */
    public final void mo72630e() {
        if (mo72626b("startSession") && m34006g()) {
            C11704hd.m33961b((Activity) null);
        }
    }

    /* renamed from: g */
    private boolean m34006g() {
        if (!this.f28497t.mo72676a()) {
            return false;
        }
        this.f28480a.mo72665a();
        C11756id.f28629a.mo72686a();
        return true;
    }

    /* renamed from: f */
    public final void mo72631f() {
        if (mo72626b("endSession")) {
            this.f28497t.mo72677b();
        }
    }

    /* renamed from: a */
    public final void mo72615a(String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        if (mo72626b("trackPurchase")) {
            try {
                C11503d dVar = new C11503d(str);
                String b = C11705he.m33965b(dVar.f27832a);
                String b2 = C11705he.m33965b(dVar.f27837f);
                if (b == null || b2 == null) {
                    C11710hg.m33976a("trackPurchase", "skuDetails", "insufficient fields");
                } else if (b2.length() != 3) {
                    C11710hg.m33976a("trackPurchase", "skuDetails", "invalid currency code");
                } else {
                    String b3 = C11705he.m33965b(str2);
                    String b4 = C11705he.m33965b(str3);
                    if (b3 != null) {
                        if (b4 != null) {
                            try {
                                C11540e eVar = new C11540e(b3);
                                if (TextUtils.isEmpty(eVar.f27922a) || TextUtils.isEmpty(eVar.f27923b) || TextUtils.isEmpty(eVar.f27924c) || eVar.f27925d == 0) {
                                    C11710hg.m33976a("trackPurchase", "purchaseData", "insufficient fields");
                                }
                            } catch (IOException unused) {
                                C11710hg.m33976a("trackPurchase", "purchaseData", "invalid PurchaseData JSON");
                            }
                        } else {
                            C11710hg.m33976a("trackPurchase", "dataSignature", "is null, skipping purchase validation");
                        }
                    } else if (b4 != null) {
                        C11710hg.m33976a("trackPurchase", "purchaseData", "is null. skipping purchase validation");
                    }
                    this.f28486g.mo72605a(b, b2.toUpperCase(Locale.US), ((double) dVar.f27838g) / 1000000.0d, b3, b4, C11705he.m33965b(str4));
                    if (b3 == null || b4 == null) {
                        C11710hg.m33975a("trackPurchase without purchaseData called");
                    } else {
                        C11710hg.m33975a("trackPurchase with purchaseData called");
                    }
                }
            } catch (IOException unused2) {
                C11710hg.m33976a("trackPurchase", "skuDetails", "invalid SkuDetails JSON");
            }
        }
    }

    /* renamed from: a */
    public final void mo72616a(@Nullable String str, String str2, @Nullable String str3, @Nullable String str4, long j) {
        if (mo72628c("trackEvent") && C11710hg.m33978a((Object) str2, "trackEvent: name was null")) {
            LinkedHashMap linkedHashMap = null;
            if (j != 0) {
                linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("value", Long.valueOf(j));
            }
            this.f28486g.mo72607a(str, str2, str3, str4, linkedHashMap);
            C11710hg.m33977a("trackEvent category:{}, name:{}, p1:{}, p2:{}, values:{} called", str, str2, str3, str4, linkedHashMap);
        }
    }

    /* renamed from: a */
    public final void mo72617a(@Nullable String str, String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, long j, @Nullable String str6, long j2, @Nullable String str7, long j3) {
        String str8 = str2;
        String str9 = str5;
        String str10 = str6;
        String str11 = str7;
        if (mo72628c("trackEvent") && C11710hg.m33978a((Object) str2, "trackEvent: name was null")) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (!(str9 == null || j == 0)) {
                linkedHashMap.put(str5, Long.valueOf(j));
            }
            if (!(str10 == null || j2 == 0)) {
                linkedHashMap.put(str10, Long.valueOf(j2));
            }
            if (!(str11 == null || j3 == 0)) {
                linkedHashMap.put(str11, Long.valueOf(j3));
            }
            if (linkedHashMap.isEmpty()) {
                linkedHashMap = null;
            }
            this.f28486g.mo72607a(str, str2, str3, str4, linkedHashMap);
            C11710hg.m33977a("trackEvent category:{}, name:{}, p1:{}, p2:{}, values:{} called", str, str8, str3, str4, linkedHashMap);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo72619a(Map<String, Object> map) {
        this.f28486g.mo72608a(map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo72620a(Map<String, Object> map, long j) {
        this.f28486g.mo72609a(map, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo72621a(Map<String, Object> map, String str) {
        this.f28486g.mo72610a(map, str);
    }

    /* renamed from: a */
    public static synchronized void m34003a(Runnable runnable) {
        synchronized (C11714hj.class) {
            if (f28478w == null) {
                f28478w = new Handler(Looper.getMainLooper());
            }
            f28478w.post(runnable);
        }
    }

    /* renamed from: c */
    public static synchronized File m34004c(Context context) {
        File file;
        synchronized (C11714hj.class) {
            if (f28479x == null) {
                f28479x = context.getDir("fiverocks", 0);
            }
            file = f28479x;
        }
        return file;
    }

    /* renamed from: d */
    static File m34005d(Context context) {
        return new File(m34004c(context), "install");
    }

    /* renamed from: a */
    public static C11714hj m34000a(Context context) {
        C11714hj hjVar = f28477q;
        hjVar.mo72624b(context);
        return hjVar;
    }

    /* renamed from: a */
    public static void m34001a(Context context, String str) {
        if (str != null) {
            C11714hj hjVar = f28477q;
            hjVar.mo72624b(context);
            if (TextUtils.isEmpty(hjVar.f28485f.mo72654c())) {
                C11726hm hmVar = hjVar.f28485f;
                synchronized (hmVar) {
                    hmVar.f28524c.f28569d.mo72814a(str);
                    hmVar.f28523b.f28263d = str;
                }
                if (str.length() > 0) {
                    C11713hi hiVar = hjVar.f28486g;
                    hiVar.mo72604a(hiVar.mo72602a(C11601fa.APP, "referrer"));
                }
            }
        }
    }
}
