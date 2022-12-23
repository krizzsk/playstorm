package com.bytedance.sdk.openadsdk.core.p156j.p159b;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.p156j.p159b.C3553c;
import com.facebook.internal.security.CertificateUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.b.a */
/* compiled from: VastAbsoluteProgressTracker */
public class C3548a extends C3553c implements Comparable<C3548a> {

    /* renamed from: a */
    public long f8913a;

    protected C3548a(long j, String str, C3553c.C3556b bVar, Boolean bool) {
        super(str, bVar, bool);
        this.f8913a = j;
    }

    /* renamed from: a */
    public static int m11104a(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        String[] split = str.split(CertificateUtil.DELIMITER);
        if (split.length == 3) {
            try {
                return (int) (((float) ((Integer.parseInt(split[0]) * 60 * 60 * 1000) + (Integer.parseInt(split[1]) * 60 * 1000))) + (Float.parseFloat(split[2]) * 1000.0f));
            } catch (Throwable unused) {
            }
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public boolean mo20009a(long j) {
        return this.f8913a <= j && !mo20020e();
    }

    /* renamed from: a */
    public int compareTo(C3548a aVar) {
        if (aVar == null) {
            return 1;
        }
        long j = this.f8913a;
        long j2 = aVar.f8913a;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.j.b.a$a */
    /* compiled from: VastAbsoluteProgressTracker */
    public static class C3549a {

        /* renamed from: a */
        private String f8914a;

        /* renamed from: b */
        private long f8915b;

        /* renamed from: c */
        private C3553c.C3556b f8916c = C3553c.C3556b.TRACKING_URL;

        /* renamed from: d */
        private boolean f8917d = false;

        public C3549a(String str, long j) {
            this.f8914a = str;
            this.f8915b = j;
        }

        /* renamed from: a */
        public C3548a mo20011a() {
            return new C3548a(this.f8915b, this.f8914a, this.f8916c, Boolean.valueOf(this.f8917d));
        }
    }

    /* renamed from: a */
    public JSONObject mo20008a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("content", mo20018c());
        jSONObject.put("trackingMilliseconds", this.f8913a);
        return jSONObject;
    }
}
