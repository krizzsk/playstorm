package com.bytedance.sdk.openadsdk.p176i;

import android.content.Context;
import android.location.Address;
import android.text.TextUtils;
import com.bytedance.sdk.component.p120e.p123c.C2925b;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.C3538j;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.multipro.p185d.C3966a;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.i.c */
/* compiled from: TTAdNetDepend */
public class C3853c implements C2925b {

    /* renamed from: a */
    String f9968a = "sp_multi_ttadnet_config";

    /* renamed from: b */
    private Context f9969b;

    /* renamed from: a */
    public Address mo17814a(Context context) {
        return null;
    }

    /* renamed from: b */
    public String mo17817b() {
        return "pangle_sdk";
    }

    /* renamed from: c */
    public String mo17818c() {
        return "android";
    }

    /* renamed from: d */
    public int mo17819d() {
        return BuildConfig.VERSION_CODE;
    }

    public C3853c(Context context) {
        this.f9969b = context;
    }

    /* renamed from: a */
    public int mo17813a() {
        return Integer.parseInt("1371");
    }

    /* renamed from: e */
    public String mo17820e() {
        return C3538j.m11045a(this.f9969b);
    }

    /* renamed from: a */
    public String mo17815a(Context context, String str, String str2) {
        return C3966a.m12977b(this.f9968a, str, str2);
    }

    /* renamed from: a */
    public void mo17816a(Context context, Map<String, ?> map) {
        if (map != null) {
            try {
                for (Map.Entry next : map.entrySet()) {
                    Object value = next.getValue();
                    if (value instanceof Integer) {
                        C3966a.m12969a(this.f9968a, (String) next.getKey(), (Integer) value);
                    } else if (value instanceof Long) {
                        C3966a.m12970a(this.f9968a, (String) next.getKey(), (Long) value);
                    } else if (value instanceof Float) {
                        C3966a.m12968a(this.f9968a, (String) next.getKey(), (Float) value);
                    } else if (value instanceof Boolean) {
                        C3966a.m12967a(this.f9968a, (String) next.getKey(), (Boolean) value);
                    } else if (value instanceof String) {
                        C3966a.m12971a(this.f9968a, (String) next.getKey(), (String) value);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: f */
    public String[] mo17821f() {
        String[] strArr = {"tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com", "tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com"};
        String w = C3578m.m11241h().mo19973w();
        if (!TextUtils.isEmpty(w)) {
            return ("SG".equals(w) || "CN".equals(w)) ? new String[]{"tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com", "tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com"} : strArr;
        }
        int o = C4014u.m13257o();
        return (o == 2 || o == 1) ? new String[]{"tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com", "tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com"} : strArr;
    }
}
