package com.bytedance.sdk.component.p125f.p126a;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.f.a.a */
/* compiled from: ThreadLogModel */
public class C2947a {

    /* renamed from: a */
    public int f6692a;

    /* renamed from: b */
    public int f6693b;

    /* renamed from: c */
    public int f6694c;

    /* renamed from: d */
    public int f6695d;

    public C2947a(int i, int i2, int i3, int i4) {
        this.f6692a = i;
        this.f6693b = i2;
        this.f6694c = i3;
        this.f6695d = i4;
    }

    /* renamed from: a */
    public JSONObject mo17863a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_thread_num", this.f6692a);
            jSONObject.put("sdk_max_thread_num", this.f6693b);
            jSONObject.put("app_thread_num", this.f6694c);
            jSONObject.put("app_max_thread_num", this.f6695d);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }
}
