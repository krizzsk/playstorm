package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import com.bytedance.sdk.component.p125f.C2952e;
import com.bytedance.sdk.component.p125f.C2955g;
import com.bytedance.sdk.openadsdk.multipro.p185d.C3966a;
import com.bytedance.sdk.openadsdk.p172h.C3815b;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.d */
/* compiled from: AppEnvironment */
public class C3460d {

    /* renamed from: a */
    private static volatile C3460d f8393a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public long f8394b = C3966a.m12963a("tt_sp_app_env", "last_app_env_time", 0);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f8395c = false;

    private C3460d() {
    }

    /* renamed from: a */
    public static C3460d m10372a() {
        if (f8393a == null) {
            synchronized (C3460d.class) {
                if (f8393a == null) {
                    f8393a = new C3460d();
                }
            }
        }
        return f8393a;
    }

    /* renamed from: b */
    public void mo19465b() {
        if (!this.f8395c && !C4014u.m13193a(this.f8394b, System.currentTimeMillis())) {
            this.f8395c = true;
            C2952e.m8308a(new C2955g("trySendAppManifestInfo") {
                public void run() {
                    JSONObject a = C3460d.this.m10375c();
                    if (a != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        long unused = C3460d.this.f8394b = currentTimeMillis;
                        C3966a.m12970a("tt_sp_app_env", "last_app_env_time", Long.valueOf(currentTimeMillis));
                        C3815b.m12552a().mo20664a(a);
                    }
                    boolean unused2 = C3460d.this.f8395c = false;
                }
            }, 1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public JSONObject m10375c() {
        JSONObject jSONObject = new JSONObject();
        try {
            Context a = C3578m.m11231a();
            if (a == null) {
                return null;
            }
            PackageInfo packageInfo = a.getPackageManager().getPackageInfo(a.getPackageName(), 4111);
            ApplicationInfo applicationInfo = a.getApplicationInfo();
            if (applicationInfo != null) {
                jSONObject.put("application_name", applicationInfo.name);
            }
            if (packageInfo != null) {
                ActivityInfo[] activityInfoArr = packageInfo.activities;
                ActivityInfo[] activityInfoArr2 = packageInfo.receivers;
                ServiceInfo[] serviceInfoArr = packageInfo.services;
                ProviderInfo[] providerInfoArr = packageInfo.providers;
                String[] strArr = packageInfo.requestedPermissions;
                if (activityInfoArr != null) {
                    JSONArray jSONArray = new JSONArray();
                    for (ActivityInfo activityInfo : activityInfoArr) {
                        jSONArray.put(activityInfo.name);
                    }
                    jSONObject.put("activities", jSONArray);
                }
                if (activityInfoArr2 != null) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (ActivityInfo activityInfo2 : activityInfoArr2) {
                        jSONArray2.put(activityInfo2.name);
                    }
                    jSONObject.put("receivers", jSONArray2);
                }
                if (serviceInfoArr != null) {
                    JSONArray jSONArray3 = new JSONArray();
                    for (ServiceInfo serviceInfo : serviceInfoArr) {
                        jSONArray3.put(serviceInfo.name);
                    }
                    jSONObject.put("services", jSONArray3);
                }
                if (providerInfoArr != null) {
                    JSONArray jSONArray4 = new JSONArray();
                    for (ProviderInfo providerInfo : providerInfoArr) {
                        jSONArray4.put(providerInfo.name);
                    }
                    jSONObject.put("providers", jSONArray4);
                }
                if (strArr != null) {
                    JSONArray jSONArray5 = new JSONArray();
                    for (String put : strArr) {
                        jSONArray5.put(put);
                    }
                    jSONObject.put("permissions", jSONArray5);
                }
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }
}
