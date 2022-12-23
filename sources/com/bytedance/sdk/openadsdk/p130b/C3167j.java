package com.bytedance.sdk.openadsdk.p130b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.j */
/* compiled from: AdShowTime */
public class C3167j {

    /* renamed from: a */
    private long f7490a;

    /* renamed from: b */
    private long f7491b;

    /* renamed from: c */
    private long f7492c;

    /* renamed from: d */
    private long f7493d;

    /* renamed from: e */
    private long f7494e;

    /* renamed from: a */
    public JSONObject mo18768a(JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
            }
        }
        if (this.f7490a > 0) {
            jSONObject.put("show_start", this.f7490a);
            if (this.f7491b > 0) {
                jSONObject.put("show_firstQuartile", this.f7491b);
                if (this.f7492c > 0) {
                    jSONObject.put("show_mid", this.f7492c);
                    if (this.f7493d > 0) {
                        jSONObject.put("show_thirdQuartile", this.f7493d);
                        if (this.f7494e > 0) {
                            jSONObject.put("show_full", this.f7494e);
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public void mo18769a(long j) {
        if (this.f7490a <= 0) {
            this.f7490a = j;
        }
    }

    /* renamed from: a */
    public void mo18770a(long j, float f) {
        if (f > 0.0f) {
            mo18769a(j);
        }
        double d = (double) f;
        if (d >= 0.25d) {
            mo18769a(j);
            mo18773b(j);
        }
        if (d >= 0.5d) {
            mo18769a(j);
            mo18773b(j);
            mo18774c(j);
        }
        if (d >= 0.75d) {
            mo18769a(j);
            mo18773b(j);
            mo18774c(j);
            mo18775d(j);
        }
        if (f >= 1.0f) {
            mo18769a(j);
            mo18773b(j);
            mo18774c(j);
            mo18775d(j);
            mo18776e(j);
        }
    }

    /* renamed from: a */
    public boolean mo18771a() {
        return this.f7490a > 0;
    }

    /* renamed from: b */
    public JSONObject mo18772b() {
        return mo18768a((JSONObject) null);
    }

    /* renamed from: b */
    public void mo18773b(long j) {
        if (this.f7491b <= 0) {
            this.f7491b = j;
        }
    }

    /* renamed from: c */
    public void mo18774c(long j) {
        if (this.f7492c <= 0) {
            this.f7492c = j;
        }
    }

    /* renamed from: d */
    public void mo18775d(long j) {
        if (this.f7493d <= 0) {
            this.f7493d = j;
        }
    }

    /* renamed from: e */
    public void mo18776e(long j) {
        if (this.f7494e <= 0) {
            this.f7494e = j;
        }
    }
}
