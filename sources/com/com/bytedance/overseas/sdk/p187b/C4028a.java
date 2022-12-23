package com.com.bytedance.overseas.sdk.p187b;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.C3455c;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.vungle.warren.VungleApiClient;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.com.bytedance.overseas.sdk.b.a */
/* compiled from: AdvertisingIdHelper */
public class C4028a {

    /* renamed from: c */
    private static volatile C4028a f10287c;

    /* renamed from: a */
    private String f10288a = "";

    /* renamed from: b */
    private final ExecutorService f10289b = Executors.newSingleThreadExecutor();

    /* renamed from: a */
    public static C4028a m13343a() {
        if (f10287c == null) {
            synchronized (C4028a.class) {
                if (f10287c == null) {
                    f10287c = new C4028a();
                }
            }
        }
        return f10287c;
    }

    private C4028a() {
    }

    /* renamed from: b */
    public String mo20936b() {
        if (!C3578m.m11241h().mo19966p(VungleApiClient.GAID)) {
            return "";
        }
        if (!TextUtils.isEmpty(this.f10288a)) {
            return this.f10288a;
        }
        String b = C3455c.m10351a(C3578m.m11231a()).mo19461b(VungleApiClient.GAID, "");
        this.f10288a = b;
        return b;
    }

    /* renamed from: a */
    public static void m13344a(String str) {
        if (!TextUtils.isEmpty(str)) {
            C3455c.m10351a(C3578m.m11231a()).mo19457a(VungleApiClient.GAID, str);
        }
    }

    /* renamed from: b */
    public void mo20937b(String str) {
        this.f10288a = str;
    }
}
