package com.p374my.tracker.obfuscated;

import android.text.TextUtils;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.q0 */
public final class C10164q0 {

    /* renamed from: a */
    private final JSONObject f25450a;

    /* renamed from: b */
    private final String f25451b;

    /* renamed from: c */
    private final String f25452c;

    /* renamed from: d */
    private final boolean f25453d;

    /* renamed from: e */
    private final long f25454e;

    /* renamed from: f */
    private JSONObject f25455f;

    /* renamed from: g */
    private Long f25456g;

    C10164q0(JSONObject jSONObject, String str, String str2, boolean z, long j) {
        this.f25451b = str;
        this.f25450a = jSONObject;
        this.f25452c = str2;
        this.f25453d = z;
        this.f25454e = j;
    }

    /* renamed from: a */
    public static C10164q0 m30400a(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!TextUtils.isEmpty(jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID))) {
                return m30401a(jSONObject, str2, j);
            }
            C10175u0.m30440a("RawPurchase: empty productId in data " + str);
            return null;
        } catch (Throwable th) {
            C10175u0.m30445b("RawPurchase error: creating object failed", th);
            return null;
        }
    }

    /* renamed from: a */
    public static C10164q0 m30401a(JSONObject jSONObject, String str, long j) {
        return new C10164q0(jSONObject, str, jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID), jSONObject.has("autoRenewing"), j);
    }

    /* renamed from: a */
    public C10164q0 mo66369a(long j) {
        this.f25456g = Long.valueOf(j);
        return this;
    }

    /* renamed from: a */
    public C10164q0 mo66370a(JSONObject jSONObject) {
        this.f25455f = jSONObject;
        return this;
    }

    /* renamed from: a */
    public String mo66371a() {
        return this.f25451b;
    }

    /* renamed from: b */
    public Long mo66372b() {
        return this.f25456g;
    }

    /* renamed from: c */
    public String mo66373c() {
        return this.f25452c;
    }

    /* renamed from: d */
    public JSONObject mo66374d() {
        return this.f25450a;
    }

    /* renamed from: e */
    public JSONObject mo66375e() {
        return this.f25455f;
    }

    /* renamed from: f */
    public long mo66376f() {
        return this.f25454e;
    }

    /* renamed from: g */
    public boolean mo66377g() {
        return this.f25453d;
    }
}
