package com.bytedance.sdk.openadsdk.p130b.p132b.p134b;

import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.p130b.p132b.p134b.C3138c;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.a */
/* compiled from: BaseEventModel */
public class C3136a<T extends C3138c> {

    /* renamed from: a */
    private C3498n f7390a;

    /* renamed from: b */
    private String f7391b;

    /* renamed from: c */
    private JSONObject f7392c;

    /* renamed from: d */
    private T f7393d = null;

    /* renamed from: e */
    private boolean f7394e = false;

    public C3136a(C3498n nVar, String str, JSONObject jSONObject, T t) {
        this.f7390a = nVar;
        this.f7391b = str;
        this.f7392c = jSONObject;
        this.f7393d = t;
    }

    /* renamed from: a */
    public C3498n mo18672a() {
        return this.f7390a;
    }

    /* renamed from: b */
    public String mo18674b() {
        return this.f7391b;
    }

    /* renamed from: c */
    public JSONObject mo18675c() {
        if (this.f7392c == null) {
            this.f7392c = new JSONObject();
        }
        return this.f7392c;
    }

    /* renamed from: d */
    public T mo18676d() {
        return this.f7393d;
    }

    /* renamed from: e */
    public boolean mo18677e() {
        return this.f7394e;
    }

    /* renamed from: a */
    public void mo18673a(boolean z) {
        this.f7394e = z;
    }
}
