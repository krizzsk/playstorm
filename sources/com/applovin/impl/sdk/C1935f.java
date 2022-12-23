package com.applovin.impl.sdk;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.sdk.AppLovinSdkUtils;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.applovin.impl.sdk.f */
public class C1935f {

    /* renamed from: a */
    private static final int f3586a = ((int) TimeUnit.SECONDS.toMillis(30));

    /* renamed from: m */
    private static final C1935f f3587m = new C1935f();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final AtomicLong f3588b = new AtomicLong(0);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Handler f3589c;

    /* renamed from: d */
    private final HandlerThread f3590d = new HandlerThread("applovin-anr-detector");
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Handler f3591e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final AtomicBoolean f3592f = new AtomicBoolean();

    /* renamed from: g */
    private final AtomicBoolean f3593g = new AtomicBoolean();

    /* renamed from: h */
    private C1959m f3594h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Thread f3595i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public long f3596j = TimeUnit.SECONDS.toMillis(4);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public long f3597k = TimeUnit.SECONDS.toMillis(3);
    /* access modifiers changed from: private */

    /* renamed from: l */
    public long f3598l = TimeUnit.SECONDS.toMillis(3);

    /* renamed from: com.applovin.impl.sdk.f$a */
    private class C1937a implements Runnable {
        private C1937a() {
        }

        public void run() {
            if (!C1935f.this.f3592f.get()) {
                long currentTimeMillis = System.currentTimeMillis() - C1935f.this.f3588b.get();
                if (currentTimeMillis < 0 || currentTimeMillis > C1935f.this.f3596j) {
                    C1935f.this.m4329a();
                    C1935f.this.m4332b();
                }
                C1935f.this.f3591e.postDelayed(this, C1935f.this.f3598l);
            }
        }
    }

    /* renamed from: com.applovin.impl.sdk.f$b */
    private class C1938b implements Runnable {
        private C1938b() {
        }

        public void run() {
            if (!C1935f.this.f3592f.get()) {
                C1935f.this.f3588b.set(System.currentTimeMillis());
                C1935f.this.f3589c.postDelayed(this, C1935f.this.f3597k);
            }
        }
    }

    private C1935f() {
    }

    /* renamed from: a */
    private static String m4326a(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Throwable unused) {
            return "";
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m4329a() {
        if (this.f3593g.get()) {
            this.f3592f.set(true);
        }
    }

    /* renamed from: a */
    public static void m4330a(C1959m mVar) {
        if (mVar == null) {
            return;
        }
        if (((Boolean) mVar.mo14311a(C1857b.f3295eP)).booleanValue()) {
            f3587m.m4333b(mVar);
        } else {
            f3587m.m4329a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m4332b() {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) m4335c().openConnection();
            httpURLConnection.setConnectTimeout(f3586a);
            httpURLConnection.setReadTimeout(f3586a);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoOutput(false);
            int responseCode = httpURLConnection.getResponseCode();
            Log.d("applovin-anr-detector", "ANR reported with code " + responseCode);
        } catch (Throwable th) {
            Log.w("applovin-anr-detector", "Failed to report ANR", th);
        }
    }

    /* renamed from: b */
    private void m4333b(C1959m mVar) {
        if (this.f3593g.compareAndSet(false, true)) {
            this.f3594h = mVar;
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    Thread unused = C1935f.this.f3595i = Thread.currentThread();
                }
            });
            this.f3596j = ((Long) mVar.mo14311a(C1857b.f3296eQ)).longValue();
            this.f3597k = ((Long) mVar.mo14311a(C1857b.f3297eR)).longValue();
            this.f3598l = ((Long) mVar.mo14311a(C1857b.f3298eS)).longValue();
            this.f3589c = new Handler(mVar.mo14297L().getMainLooper());
            this.f3590d.start();
            this.f3589c.post(new C1938b());
            Handler handler = new Handler(this.f3590d.getLooper());
            this.f3591e = handler;
            handler.postDelayed(new C1937a(), this.f3598l / 2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0029 A[SYNTHETIC, Splitter:B:13:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036 A[Catch:{ MalformedURLException -> 0x0170 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0107 A[Catch:{ MalformedURLException -> 0x0170 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0117 A[Catch:{ MalformedURLException -> 0x0170 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.net.URL m4335c() {
        /*
            r11 = this;
            java.lang.String r0 = ""
            com.applovin.impl.sdk.m r1 = r11.f3594h
            android.content.Context r1 = r1.mo14297L()
            r2 = 0
            r3 = 0
            android.content.pm.PackageManager r4 = r1.getPackageManager()     // Catch:{ all -> 0x0017 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ all -> 0x0017 }
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r1, r3)     // Catch:{ all -> 0x0018 }
            goto L_0x0019
        L_0x0017:
            r1 = r0
        L_0x0018:
            r4 = r2
        L_0x0019:
            com.applovin.impl.sdk.m r5 = r11.f3594h     // Catch:{ MalformedURLException -> 0x0170 }
            com.applovin.impl.sdk.s r5 = r5.mo14332ae()     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.Object r5 = r5.mo14648c()     // Catch:{ MalformedURLException -> 0x0170 }
            boolean r6 = r5 instanceof com.applovin.impl.sdk.p046ad.C1829e     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r7 = "None"
            if (r6 == 0) goto L_0x0036
            com.applovin.impl.sdk.ad.e r5 = (com.applovin.impl.sdk.p046ad.C1829e) r5     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r6 = "AppLovin"
            long r8 = r5.getAdIdNumber()     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r5 = java.lang.Long.toString(r8)     // Catch:{ MalformedURLException -> 0x0170 }
            goto L_0x0047
        L_0x0036:
            boolean r6 = r5 instanceof com.applovin.impl.mediation.p028a.C1573a     // Catch:{ MalformedURLException -> 0x0170 }
            if (r6 == 0) goto L_0x0045
            com.applovin.impl.mediation.a.a r5 = (com.applovin.impl.mediation.p028a.C1573a) r5     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r6 = r5.getNetworkName()     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r5 = r5.getCreativeId()     // Catch:{ MalformedURLException -> 0x0170 }
            goto L_0x0047
        L_0x0045:
            r5 = r7
            r6 = r5
        L_0x0047:
            java.lang.Thread r8 = r11.f3595i     // Catch:{ MalformedURLException -> 0x0170 }
            if (r8 == 0) goto L_0x0078
            java.lang.Thread r8 = r11.f3595i     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.StackTraceElement[] r8 = r8.getStackTrace()     // Catch:{ MalformedURLException -> 0x0170 }
            int r8 = r8.length     // Catch:{ MalformedURLException -> 0x0170 }
            if (r8 <= 0) goto L_0x0078
            java.lang.Thread r7 = r11.f3595i     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.StackTraceElement[] r7 = r7.getStackTrace()     // Catch:{ MalformedURLException -> 0x0170 }
            r7 = r7[r3]     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0170 }
            r8.<init>()     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r9 = r7.getClassName()     // Catch:{ MalformedURLException -> 0x0170 }
            r8.append(r9)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r9 = "."
            r8.append(r9)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r7 = r7.getMethodName()     // Catch:{ MalformedURLException -> 0x0170 }
            r8.append(r7)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r7 = r8.toString()     // Catch:{ MalformedURLException -> 0x0170 }
        L_0x0078:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0170 }
            r8.<init>()     // Catch:{ MalformedURLException -> 0x0170 }
            com.applovin.impl.sdk.m r9 = r11.f3594h     // Catch:{ MalformedURLException -> 0x0170 }
            com.applovin.impl.sdk.c.b<java.lang.String> r10 = com.applovin.impl.sdk.p048c.C1857b.f3096aZ     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.Object r9 = r9.mo14311a(r10)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ MalformedURLException -> 0x0170 }
            r8.append(r9)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r9 = "?type=anr&platform=android&package_name="
            r8.append(r9)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = m4326a((java.lang.String) r1)     // Catch:{ MalformedURLException -> 0x0170 }
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = "&applovin_random_token="
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0170 }
            com.applovin.impl.sdk.m r1 = r11.f3594h     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = r1.mo14362o()     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = m4326a((java.lang.String) r1)     // Catch:{ MalformedURLException -> 0x0170 }
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = "&compass_random_token="
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0170 }
            com.applovin.impl.sdk.m r1 = r11.f3594h     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = r1.mo14361n()     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = m4326a((java.lang.String) r1)     // Catch:{ MalformedURLException -> 0x0170 }
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = "&model="
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = android.os.Build.MODEL     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = m4326a((java.lang.String) r1)     // Catch:{ MalformedURLException -> 0x0170 }
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = "&brand="
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = m4326a((java.lang.String) r1)     // Catch:{ MalformedURLException -> 0x0170 }
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = "&brand_name="
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = android.os.Build.BRAND     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = m4326a((java.lang.String) r1)     // Catch:{ MalformedURLException -> 0x0170 }
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = "&hardware="
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = android.os.Build.HARDWARE     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = m4326a((java.lang.String) r1)     // Catch:{ MalformedURLException -> 0x0170 }
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = "&revision="
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = android.os.Build.DEVICE     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = m4326a((java.lang.String) r1)     // Catch:{ MalformedURLException -> 0x0170 }
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r1 = "&app_version="
            r8.append(r1)     // Catch:{ MalformedURLException -> 0x0170 }
            if (r4 == 0) goto L_0x0109
            java.lang.String r0 = r4.versionName     // Catch:{ MalformedURLException -> 0x0170 }
        L_0x0109:
            java.lang.String r0 = m4326a((java.lang.String) r0)     // Catch:{ MalformedURLException -> 0x0170 }
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r0 = "&app_version_code="
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0170 }
            if (r4 == 0) goto L_0x0119
            int r3 = r4.versionCode     // Catch:{ MalformedURLException -> 0x0170 }
        L_0x0119:
            r8.append(r3)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r0 = "&os="
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r0 = android.os.Build.VERSION.RELEASE     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r0 = m4326a((java.lang.String) r0)     // Catch:{ MalformedURLException -> 0x0170 }
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r0 = "&api_level="
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0170 }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ MalformedURLException -> 0x0170 }
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r0 = "&sdk_version="
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r0 = com.applovin.sdk.AppLovinSdk.VERSION     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r0 = m4326a((java.lang.String) r0)     // Catch:{ MalformedURLException -> 0x0170 }
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r0 = "&fs_ad_network="
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r0 = m4326a((java.lang.String) r6)     // Catch:{ MalformedURLException -> 0x0170 }
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r0 = "&fs_ad_creative_id="
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r0 = m4326a((java.lang.String) r5)     // Catch:{ MalformedURLException -> 0x0170 }
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r0 = "&top_main_method="
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r0 = m4326a((java.lang.String) r7)     // Catch:{ MalformedURLException -> 0x0170 }
            r8.append(r0)     // Catch:{ MalformedURLException -> 0x0170 }
            java.lang.String r0 = r8.toString()     // Catch:{ MalformedURLException -> 0x0170 }
            java.net.URL r1 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0170 }
            r1.<init>(r0)     // Catch:{ MalformedURLException -> 0x0170 }
            return r1
        L_0x0170:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C1935f.m4335c():java.net.URL");
    }
}
