package com.bytedance.sdk.openadsdk.multipro.p183b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.b.a */
/* compiled from: VideoControllerDataModel */
public class C3954a {

    /* renamed from: a */
    public boolean f10168a;

    /* renamed from: b */
    public boolean f10169b;

    /* renamed from: c */
    public boolean f10170c;

    /* renamed from: d */
    public boolean f10171d;

    /* renamed from: e */
    public long f10172e;

    /* renamed from: f */
    public long f10173f;

    /* renamed from: g */
    public long f10174g;

    /* renamed from: com.bytedance.sdk.openadsdk.multipro.b.a$a */
    /* compiled from: VideoControllerDataModel */
    public interface C3955a {
        /* renamed from: f */
        C3954a mo18945f();
    }

    /* renamed from: a */
    public C3954a mo20877a(boolean z) {
        this.f10171d = z;
        return this;
    }

    /* renamed from: b */
    public C3954a mo20880b(boolean z) {
        this.f10168a = z;
        return this;
    }

    /* renamed from: c */
    public C3954a mo20882c(boolean z) {
        this.f10169b = z;
        return this;
    }

    /* renamed from: d */
    public C3954a mo20883d(boolean z) {
        this.f10170c = z;
        return this;
    }

    /* renamed from: a */
    public C3954a mo20876a(long j) {
        this.f10172e = j;
        return this;
    }

    /* renamed from: b */
    public C3954a mo20879b(long j) {
        this.f10173f = j;
        return this;
    }

    /* renamed from: c */
    public C3954a mo20881c(long j) {
        this.f10174g = j;
        return this;
    }

    /* renamed from: a */
    public JSONObject mo20878a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isCompleted", this.f10168a);
            jSONObject.put("isFromVideoDetailPage", this.f10169b);
            jSONObject.put("isFromDetailPage", this.f10170c);
            jSONObject.put("duration", this.f10172e);
            jSONObject.put("totalPlayDuration", this.f10173f);
            jSONObject.put("currentPlayPosition", this.f10174g);
            jSONObject.put("isAutoPlay", this.f10171d);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static C3954a m12902a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C3954a aVar = new C3954a();
        aVar.mo20880b(jSONObject.optBoolean("isCompleted"));
        aVar.mo20882c(jSONObject.optBoolean("isFromVideoDetailPage"));
        aVar.mo20883d(jSONObject.optBoolean("isFromDetailPage"));
        aVar.mo20876a(jSONObject.optLong("duration"));
        aVar.mo20879b(jSONObject.optLong("totalPlayDuration"));
        aVar.mo20881c(jSONObject.optLong("currentPlayPosition"));
        aVar.mo20877a(jSONObject.optBoolean("isAutoPlay"));
        return aVar;
    }
}
