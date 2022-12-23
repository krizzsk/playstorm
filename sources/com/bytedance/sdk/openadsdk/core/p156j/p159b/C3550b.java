package com.bytedance.sdk.openadsdk.core.p156j.p159b;

import com.bytedance.sdk.openadsdk.core.p156j.p159b.C3553c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.b.b */
/* compiled from: VastFractionalProgressTracker */
public class C3550b extends C3553c implements Comparable<C3550b> {

    /* renamed from: a */
    private float f8918a;

    private C3550b(float f, String str, C3553c.C3556b bVar, Boolean bool) {
        super(str, bVar, bool);
        this.f8918a = f;
    }

    /* renamed from: a */
    public boolean mo20013a(float f) {
        return this.f8918a <= f && !mo20020e();
    }

    /* renamed from: a */
    public int compareTo(C3550b bVar) {
        if (bVar == null) {
            return 1;
        }
        float f = this.f8918a;
        float f2 = bVar.f8918a;
        if (f > f2) {
            return 1;
        }
        return f < f2 ? -1 : 0;
    }

    /* renamed from: f_ */
    public void mo20016f_() {
        super.mo20016f_();
        float f = this.f8918a;
        if (f != 0.25f) {
            int i = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.j.b.b$a */
    /* compiled from: VastFractionalProgressTracker */
    public static class C3552a {

        /* renamed from: a */
        private String f8919a;

        /* renamed from: b */
        private float f8920b;

        /* renamed from: c */
        private C3553c.C3556b f8921c = C3553c.C3556b.TRACKING_URL;

        /* renamed from: d */
        private boolean f8922d = false;

        public C3552a(String str, float f) {
            this.f8919a = str;
            this.f8920b = f;
        }

        /* renamed from: a */
        public C3550b mo20017a() {
            return new C3550b(this.f8920b, this.f8919a, this.f8921c, Boolean.valueOf(this.f8922d));
        }
    }

    /* renamed from: b */
    public JSONObject mo20014b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("content", mo20018c());
        jSONObject.put("trackingFraction", (double) this.f8918a);
        return jSONObject;
    }
}
