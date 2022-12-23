package com.ogury.p375cm.internal;

import com.ogury.p375cm.ConsentActivity;
import com.tapjoy.TapjoyConstants;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ogury.cm.internal.abcbb */
public final class abcbb {

    /* renamed from: a */
    public static final aaaaa f25761a = new aaaaa((bbabb) null);

    /* renamed from: b */
    private final String f25762b;

    /* renamed from: c */
    private final String f25763c;

    /* renamed from: d */
    private final String f25764d;

    /* renamed from: e */
    private final String f25765e;

    /* renamed from: f */
    private final String f25766f;

    /* renamed from: g */
    private final String f25767g;

    /* renamed from: h */
    private final String f25768h;

    /* renamed from: i */
    private final String f25769i;

    /* renamed from: j */
    private final String f25770j;

    /* renamed from: k */
    private final String f25771k;

    /* renamed from: l */
    private final Boolean f25772l;

    /* renamed from: m */
    private final String f25773m;

    /* renamed from: n */
    private final Integer[] f25774n;

    /* renamed from: com.ogury.cm.internal.abcbb$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    public abcbb(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11, Integer[] numArr) {
        this.f25762b = str;
        this.f25763c = str2;
        this.f25764d = str3;
        this.f25765e = str4;
        this.f25766f = str5;
        this.f25767g = str6;
        this.f25768h = str7;
        this.f25769i = str8;
        this.f25770j = str9;
        this.f25771k = str10;
        this.f25772l = bool;
        this.f25773m = str11;
        this.f25774n = numArr;
    }

    /* renamed from: b */
    private final JSONObject m30798b() {
        JSONObject jSONObject = new JSONObject();
        String str = this.f25770j;
        if (str != null) {
            jSONObject.put("retrieval_method", str);
        }
        String str2 = this.f25771k;
        if (str2 != null) {
            jSONObject.put("iab_string", str2);
        }
        Integer[] numArr = this.f25774n;
        boolean z = true;
        if (numArr != null) {
            if (!(numArr.length == 0)) {
                z = false;
            }
        }
        if (!z) {
            JSONArray jSONArray = new JSONArray();
            for (Integer intValue : this.f25774n) {
                jSONArray.put(intValue.intValue());
            }
            jSONObject.put("vendor_ids", jSONArray);
        }
        Boolean bool = this.f25772l;
        if (bool != null) {
            bool.booleanValue();
            jSONObject.put("has_consent", this.f25772l.booleanValue());
        }
        String str3 = this.f25773m;
        if (str3 != null) {
            jSONObject.put("origin", str3);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final JSONObject mo66599a() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        String str = this.f25762b;
        if (str != null) {
            jSONObject2.put("asset_key", str);
        }
        String str2 = this.f25763c;
        if (str2 != null) {
            jSONObject2.put("asset_type", str2);
        }
        String str3 = this.f25764d;
        if (str3 != null) {
            jSONObject2.put("bundle_id", str3);
        }
        String str4 = this.f25768h;
        if (str4 != null) {
            jSONObject2.put("version", str4);
        }
        if (!ConsentActivity.aaaaa.m30521a(jSONObject2)) {
            jSONObject.put(TapjoyConstants.TJC_APP_PLACEMENT, jSONObject2);
        }
        JSONObject jSONObject3 = new JSONObject();
        String str5 = this.f25765e;
        if (str5 != null) {
            jSONObject3.put("module_version", str5);
        }
        if (!ConsentActivity.aaaaa.m30521a(jSONObject3)) {
            jSONObject.put("sdk", jSONObject3);
        }
        JSONObject jSONObject4 = new JSONObject();
        String str6 = this.f25766f;
        if (str6 != null) {
            jSONObject4.put("os", str6);
        }
        String str7 = this.f25767g;
        if (str7 != null) {
            jSONObject4.put(TapjoyConstants.TJC_DEVICE_OS_VERSION_NAME, str7);
        }
        if (!ConsentActivity.aaaaa.m30521a(jSONObject4)) {
            jSONObject.put("device", jSONObject4);
        }
        JSONObject jSONObject5 = new JSONObject();
        String str8 = this.f25769i;
        if (str8 != null) {
            jSONObject5.put("consent_token", str8);
        }
        if (!ConsentActivity.aaaaa.m30521a(m30798b())) {
            jSONObject5.put("consent", m30798b());
        }
        if (!ConsentActivity.aaaaa.m30521a(jSONObject5)) {
            jSONObject.put("privacy_compliancy", jSONObject5);
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abcbb)) {
            return false;
        }
        abcbb abcbb = (abcbb) obj;
        return bbabc.m30942a((Object) this.f25762b, (Object) abcbb.f25762b) && bbabc.m30942a((Object) this.f25763c, (Object) abcbb.f25763c) && bbabc.m30942a((Object) this.f25764d, (Object) abcbb.f25764d) && bbabc.m30942a((Object) this.f25765e, (Object) abcbb.f25765e) && bbabc.m30942a((Object) this.f25766f, (Object) abcbb.f25766f) && bbabc.m30942a((Object) this.f25767g, (Object) abcbb.f25767g) && bbabc.m30942a((Object) this.f25768h, (Object) abcbb.f25768h) && bbabc.m30942a((Object) this.f25769i, (Object) abcbb.f25769i) && bbabc.m30942a((Object) this.f25770j, (Object) abcbb.f25770j) && bbabc.m30942a((Object) this.f25771k, (Object) abcbb.f25771k) && bbabc.m30942a((Object) this.f25772l, (Object) abcbb.f25772l) && bbabc.m30942a((Object) this.f25773m, (Object) abcbb.f25773m) && bbabc.m30942a((Object) this.f25774n, (Object) abcbb.f25774n);
    }

    public final int hashCode() {
        String str = this.f25762b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f25763c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f25764d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f25765e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f25766f;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f25767g;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f25768h;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f25769i;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f25770j;
        int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.f25771k;
        int hashCode10 = (hashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
        Boolean bool = this.f25772l;
        int hashCode11 = (hashCode10 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str11 = this.f25773m;
        int hashCode12 = (hashCode11 + (str11 != null ? str11.hashCode() : 0)) * 31;
        Integer[] numArr = this.f25774n;
        if (numArr != null) {
            i = Arrays.hashCode(numArr);
        }
        return hashCode12 + i;
    }

    public final String toString() {
        return "ExternalRequestBody(assetKey=" + this.f25762b + ", assetType=" + this.f25763c + ", bundleId=" + this.f25764d + ", moduleVersion=" + this.f25765e + ", os=" + this.f25766f + ", osVersion=" + this.f25767g + ", version=" + this.f25768h + ", consentToken=" + this.f25769i + ", retrievalMethod=" + this.f25770j + ", iabString=" + this.f25771k + ", hasConsent=" + this.f25772l + ", origin=" + this.f25773m + ", vendorIds=" + Arrays.toString(this.f25774n) + ")";
    }
}
