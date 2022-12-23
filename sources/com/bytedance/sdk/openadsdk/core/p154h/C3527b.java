package com.bytedance.sdk.openadsdk.core.p154h;

import android.content.Context;
import android.os.Looper;
import com.bytedance.mobsec.metasec.p089ov.PglMSConfig;
import com.bytedance.mobsec.metasec.p089ov.PglMSManager;
import com.bytedance.mobsec.metasec.p089ov.PglMSManagerUtils;
import com.bytedance.sdk.component.p125f.C2952e;
import com.bytedance.sdk.component.p125f.C2955g;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.core.C3524h;
import com.bytedance.sdk.openadsdk.core.C3538j;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.p172h.C3815b;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.google.common.base.Ascii;
import com.vungle.warren.model.ReportDBAdapter;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.core.h.b */
/* compiled from: MSSdkImpl */
public class C3527b implements C3526a {

    /* renamed from: b */
    private static volatile boolean f8753b = false;

    /* renamed from: c */
    private static volatile boolean f8754c = true;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public PglMSManager f8755a;

    /* renamed from: d */
    private volatile String f8756d = C3524h.m10852d().mo19854f();

    /* renamed from: e */
    private volatile String f8757e;

    public C3527b() {
        Context a = C3578m.m11231a();
        this.f8757e = C3538j.m11045a(a);
        f8753b = m10906a(this.f8756d, this.f8757e);
    }

    /* renamed from: a */
    private boolean m10906a(String str, String str2) {
        try {
            C2975l.m8387c("mssdk", "Sdk.APP_ID: 1371\n appId: " + str + " \n MS_SDK_LICENCE:" + "6QsgjKNXt0ThHEOR/wpJGqVuDr4bHw6oKiicVF73p9+zvKfmlFZpi9d4zgrMWd9vbyPsZIdIHuN5cgNZGzmWdjdpJjlERMNPwKHauPaQbfRfY4VRpA5s7BaQ3NqhlpVXhpJcCGkhG0r8GX6Q1ys7HXrrwSLpidXsl992B79+GPi4GB9tgR1CtqsLFzcKbbd+/j76xqkGzAl1p2JxYeZswgj5c/Mg5K2bA7MquHtxWz4N1Tkj" + " \n did: " + str2 + " ");
            Context a = C3578m.m11231a();
            PglMSConfig build = new PglMSConfig.Builder("1371", str, "6QsgjKNXt0ThHEOR/wpJGqVuDr4bHw6oKiicVF73p9+zvKfmlFZpi9d4zgrMWd9vbyPsZIdIHuN5cgNZGzmWdjdpJjlERMNPwKHauPaQbfRfY4VRpA5s7BaQ3NqhlpVXhpJcCGkhG0r8GX6Q1ys7HXrrwSLpidXsl992B79+GPi4GB9tgR1CtqsLFzcKbbd+/j76xqkGzAl1p2JxYeZswgj5c/Mg5K2bA7MquHtxWz4N1Tkj", m10909e()).setDeviceID(str2).setClientType(1).setOVRegionType(0).build();
            long currentTimeMillis = System.currentTimeMillis();
            PglMSManagerUtils.init(a, build);
            C3815b.m12552a().mo20662a("init", currentTimeMillis);
            m10908d();
            if (this.f8755a != null) {
                this.f8755a.setDeviceID(str2);
            }
            C2975l.m8387c("mssdk", "init: 成功");
            return true;
        } catch (Throwable th) {
            C2975l.m8387c("mssdk", "init: 失败");
            C2975l.m8385b("MSSdkImpl", "appid 为空，初始化失败！或不包含mssdk模块", th);
            m10910f();
            return false;
        }
    }

    /* renamed from: c */
    private synchronized boolean m10907c() {
        if (!f8753b && f8754c) {
            this.f8756d = C3524h.m10852d().mo19854f();
            this.f8757e = C3538j.m11045a(C3578m.m11231a());
            f8753b = m10906a(this.f8756d, this.f8757e);
        }
        return f8753b;
    }

    /* renamed from: d */
    private void m10908d() {
        if (this.f8755a == null) {
            PglMSManager pglMSManager = PglMSManagerUtils.get("1371");
            this.f8755a = pglMSManager;
            if (pglMSManager != null) {
                pglMSManager.setCollectMode(m10909e());
            }
        }
    }

    /* renamed from: e */
    private int m10909e() {
        int o = C4014u.m13257o();
        if (o == 4 || o == 5) {
            C2975l.m8387c("mssdk", "getCollectMode() PglMSConfig.COLLECT_MODE_TIKTOK_USEA");
            return 503;
        }
        C2975l.m8387c("mssdk", "getCollectMode() PglMSConfig.COLLECT_MODE_TIKTOK_NONUSEA");
        return 603;
    }

    /* renamed from: a */
    public void mo19876a(final String str) {
        if (m10907c()) {
            m10908d();
            if (this.f8755a != null) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    C2952e.m8307a((C2955g) new C2955g("updateDid") {
                        public void run() {
                            if (C3527b.this.f8755a != null) {
                                long currentTimeMillis = System.currentTimeMillis();
                                C3527b.this.f8755a.setDeviceID(str);
                                C3815b.m12552a().mo20662a("setDeviceID", currentTimeMillis);
                            }
                        }
                    });
                } else {
                    this.f8755a.setDeviceID(str);
                }
                C2975l.m8387c("mssdk did: ", str);
            }
        }
    }

    /* renamed from: b */
    public void mo19878b(String str) {
        if (m10907c()) {
            m10908d();
            if (this.f8755a != null) {
                long currentTimeMillis = System.currentTimeMillis();
                this.f8755a.report(str);
                C3815b.m12552a().mo20662a(ReportDBAdapter.ReportColumns.TABLE_NAME, currentTimeMillis);
            }
        }
    }

    /* renamed from: a */
    public String mo19874a() {
        if (!m10907c()) {
            return "";
        }
        m10908d();
        if (this.f8755a == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String token = this.f8755a.getToken();
        C3815b.m12552a().mo20662a("getToken", currentTimeMillis);
        C2975l.m8387c("mssdk", "secDeviceToken: " + token);
        return token;
    }

    /* renamed from: a */
    public Map<String, String> mo19875a(String str, byte[] bArr) {
        if (!m10907c()) {
            return new HashMap();
        }
        m10908d();
        if (this.f8755a == null) {
            return new HashMap();
        }
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> featureHash = this.f8755a.getFeatureHash(str, bArr);
        C3815b.m12552a().mo20662a("getFeatureHash", currentTimeMillis);
        return featureHash;
    }

    /* renamed from: b */
    public String mo19877b() {
        try {
            Context a = C3578m.m11231a();
            return m10905a(MessageDigest.getInstance("SHA1").digest(a.getPackageManager().getPackageInfo(a.getPackageName(), 64).signatures[0].toByteArray())).toUpperCase();
        } catch (Throwable unused) {
            return "0000000000000000000000000000000000000000";
        }
    }

    /* renamed from: a */
    private static String m10905a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        char[] charArray = "0123456789abcdef".toCharArray();
        char[] cArr = new char[(bArr.length * 2)];
        for (byte b = 0; b < bArr.length; b = (byte) (b + 1)) {
            byte b2 = bArr[b] & 255;
            int i = b * 2;
            cArr[i] = charArray[b2 >>> 4];
            cArr[i + 1] = charArray[b2 & Ascii.f17944SI];
        }
        return new String(cArr);
    }

    /* renamed from: f */
    private void m10910f() {
        try {
            Class.forName("com.bytedance.mobsec.metasec.ov.PglMS");
            f8754c = true;
            C2975l.m8387c("mssdk", "class found");
        } catch (Throwable unused) {
            C2975l.m8387c("mssdk", "class not found ");
            f8754c = false;
        }
    }
}
