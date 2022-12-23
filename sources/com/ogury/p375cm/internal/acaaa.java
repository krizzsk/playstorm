package com.ogury.p375cm.internal;

import com.facebook.appevents.UserDataStore;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ogury.p375cm.ConsentActivity;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ogury.cm.internal.acaaa */
public final class acaaa {

    /* renamed from: a */
    public static final aaaaa f25793a = new aaaaa((bbabb) null);

    /* renamed from: b */
    private final String f25794b;

    /* renamed from: c */
    private final String f25795c;

    /* renamed from: d */
    private final String f25796d;

    /* renamed from: e */
    private final String f25797e;

    /* renamed from: f */
    private final String f25798f;

    /* renamed from: g */
    private final String f25799g;

    /* renamed from: h */
    private final String f25800h;

    /* renamed from: i */
    private final String f25801i;

    /* renamed from: j */
    private final String f25802j;

    /* renamed from: k */
    private final Integer f25803k;

    /* renamed from: l */
    private final Integer f25804l;

    /* renamed from: m */
    private final String f25805m;

    /* renamed from: n */
    private final String f25806n;

    /* renamed from: o */
    private final Double f25807o;

    /* renamed from: p */
    private final String f25808p;

    /* renamed from: q */
    private final String f25809q;

    /* renamed from: r */
    private final String f25810r;

    /* renamed from: s */
    private final String f25811s;

    /* renamed from: t */
    private final String f25812t;

    /* renamed from: u */
    private final Boolean f25813u;

    /* renamed from: v */
    private final Boolean f25814v;

    /* renamed from: w */
    private final Boolean f25815w;

    /* renamed from: com.ogury.cm.internal.acaaa$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    public acaaa(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, Integer num2, String str10, String str11, Double d, String str12, String str13, String str14, String str15, String str16, Boolean bool, Boolean bool2, Boolean bool3) {
        this.f25794b = str;
        this.f25795c = str2;
        this.f25796d = str3;
        this.f25797e = str4;
        this.f25798f = str5;
        this.f25799g = str6;
        this.f25800h = str7;
        this.f25801i = str8;
        this.f25802j = str9;
        this.f25803k = num;
        this.f25804l = num2;
        this.f25805m = str10;
        this.f25806n = str11;
        this.f25807o = d;
        this.f25808p = str12;
        this.f25809q = str13;
        this.f25810r = str14;
        this.f25811s = str15;
        this.f25812t = str16;
        this.f25813u = bool;
        this.f25814v = bool2;
        this.f25815w = bool3;
    }

    /* renamed from: a */
    private static JSONArray m30810a(String str) {
        JSONArray jSONArray = new JSONArray(str);
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            System.out.print(jSONObject.toString() + "\n");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("product_id", jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID));
            jSONObject2.put("purchase_token", jSONObject.getString(SDKConstants.PARAM_PURCHASE_TOKEN));
            jSONArray2.put(jSONObject2);
        }
        return jSONArray2;
    }

    /* renamed from: a */
    public final JSONObject mo66609a() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        String str = this.f25794b;
        if (str != null) {
            jSONObject2.put("asset_key", str);
        }
        String str2 = this.f25795c;
        if (str2 != null) {
            jSONObject2.put("asset_type", str2);
        }
        String str3 = this.f25796d;
        if (str3 != null) {
            jSONObject2.put("bundle_id", str3);
        }
        String str4 = this.f25800h;
        if (str4 != null) {
            jSONObject2.put("version", str4);
        }
        if (!ConsentActivity.aaaaa.m30521a(jSONObject2)) {
            jSONObject.put(TapjoyConstants.TJC_APP_PLACEMENT, jSONObject2);
        }
        JSONObject jSONObject3 = new JSONObject();
        String str5 = this.f25797e;
        if (str5 != null) {
            jSONObject3.put("module_version", str5);
        }
        if (!ConsentActivity.aaaaa.m30521a(jSONObject3)) {
            jSONObject.put("sdk", jSONObject3);
        }
        JSONObject jSONObject4 = new JSONObject();
        String str6 = this.f25798f;
        if (str6 != null) {
            jSONObject4.put("os", str6);
        }
        String str7 = this.f25799g;
        if (str7 != null) {
            jSONObject4.put(TapjoyConstants.TJC_DEVICE_OS_VERSION_NAME, str7);
        }
        String str8 = this.f25801i;
        if (str8 != null) {
            jSONObject4.put("manufacturer", str8);
        }
        String str9 = this.f25802j;
        if (str9 != null) {
            jSONObject4.put(DeviceRequestsHelper.DEVICE_INFO_MODEL, str9);
        }
        JSONObject jSONObject5 = new JSONObject();
        Integer num = this.f25803k;
        if (num != null) {
            jSONObject5.put("height", num.intValue());
        }
        String str10 = this.f25805m;
        if (str10 != null) {
            jSONObject5.put("ui_mode", str10);
        }
        String str11 = this.f25806n;
        if (str11 != null) {
            jSONObject5.put("layout_size", str11);
        }
        Integer num2 = this.f25804l;
        if (num2 != null) {
            jSONObject5.put("width", num2.intValue());
        }
        Double d = this.f25807o;
        if (d != null) {
            jSONObject5.put("density", d.doubleValue());
        }
        if (!ConsentActivity.aaaaa.m30521a(jSONObject5)) {
            jSONObject4.put("screen", jSONObject5);
        }
        JSONObject jSONObject6 = new JSONObject();
        JSONObject jSONObject7 = new JSONObject();
        String str12 = this.f25809q;
        if (str12 != null) {
            jSONObject7.put(UserDataStore.COUNTRY, str12);
        }
        String str13 = this.f25808p;
        if (str13 != null) {
            jSONObject7.put("language", str13);
        }
        if (!ConsentActivity.aaaaa.m30521a(jSONObject7)) {
            jSONObject6.put("locale", jSONObject7);
        }
        if (!ConsentActivity.aaaaa.m30521a(jSONObject6)) {
            jSONObject4.put("settings", jSONObject6);
        }
        JSONObject jSONObject8 = new JSONObject();
        String str14 = this.f25810r;
        if (str14 != null) {
            jSONObject8.put("connectivity", str14);
        }
        if (!ConsentActivity.aaaaa.m30521a(jSONObject8)) {
            jSONObject4.put("network", jSONObject8);
        }
        if (!ConsentActivity.aaaaa.m30521a(jSONObject4)) {
            jSONObject.put("device", jSONObject4);
        }
        JSONObject jSONObject9 = new JSONObject();
        String str15 = this.f25811s;
        if (str15 != null) {
            jSONObject9.put("consent_token", str15);
        }
        Boolean bool = this.f25814v;
        if (bool != null) {
            bool.booleanValue();
            jSONObject9.put("is_child_under_coppa", this.f25814v.booleanValue());
        }
        Boolean bool2 = this.f25815w;
        if (bool2 != null) {
            bool2.booleanValue();
            jSONObject9.put("is_under_age_of_gdpr_consent", this.f25815w.booleanValue());
        }
        if (!ConsentActivity.aaaaa.m30521a(jSONObject9)) {
            jSONObject.put("privacy_compliancy", jSONObject9);
        }
        JSONObject jSONObject10 = new JSONObject();
        Boolean bool3 = this.f25813u;
        if (bool3 != null) {
            jSONObject10.put(TJAdUnitConstants.String.ENABLED, bool3.booleanValue());
        }
        CharSequence charSequence = this.f25812t;
        if (!(charSequence == null || charSequence.length() == 0)) {
            jSONObject10.put("purchase_tokens", m30810a(this.f25812t));
        }
        if (!ConsentActivity.aaaaa.m30521a(jSONObject10)) {
            jSONObject.put("billing", jSONObject10);
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acaaa)) {
            return false;
        }
        acaaa acaaa = (acaaa) obj;
        return bbabc.m30942a((Object) this.f25794b, (Object) acaaa.f25794b) && bbabc.m30942a((Object) this.f25795c, (Object) acaaa.f25795c) && bbabc.m30942a((Object) this.f25796d, (Object) acaaa.f25796d) && bbabc.m30942a((Object) this.f25797e, (Object) acaaa.f25797e) && bbabc.m30942a((Object) this.f25798f, (Object) acaaa.f25798f) && bbabc.m30942a((Object) this.f25799g, (Object) acaaa.f25799g) && bbabc.m30942a((Object) this.f25800h, (Object) acaaa.f25800h) && bbabc.m30942a((Object) this.f25801i, (Object) acaaa.f25801i) && bbabc.m30942a((Object) this.f25802j, (Object) acaaa.f25802j) && bbabc.m30942a((Object) this.f25803k, (Object) acaaa.f25803k) && bbabc.m30942a((Object) this.f25804l, (Object) acaaa.f25804l) && bbabc.m30942a((Object) this.f25805m, (Object) acaaa.f25805m) && bbabc.m30942a((Object) this.f25806n, (Object) acaaa.f25806n) && bbabc.m30942a((Object) this.f25807o, (Object) acaaa.f25807o) && bbabc.m30942a((Object) this.f25808p, (Object) acaaa.f25808p) && bbabc.m30942a((Object) this.f25809q, (Object) acaaa.f25809q) && bbabc.m30942a((Object) this.f25810r, (Object) acaaa.f25810r) && bbabc.m30942a((Object) this.f25811s, (Object) acaaa.f25811s) && bbabc.m30942a((Object) this.f25812t, (Object) acaaa.f25812t) && bbabc.m30942a((Object) this.f25813u, (Object) acaaa.f25813u) && bbabc.m30942a((Object) this.f25814v, (Object) acaaa.f25814v) && bbabc.m30942a((Object) this.f25815w, (Object) acaaa.f25815w);
    }

    public final int hashCode() {
        String str = this.f25794b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f25795c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f25796d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f25797e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f25798f;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f25799g;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f25800h;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f25801i;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f25802j;
        int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        Integer num = this.f25803k;
        int hashCode10 = (hashCode9 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f25804l;
        int hashCode11 = (hashCode10 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str10 = this.f25805m;
        int hashCode12 = (hashCode11 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.f25806n;
        int hashCode13 = (hashCode12 + (str11 != null ? str11.hashCode() : 0)) * 31;
        Double d = this.f25807o;
        int hashCode14 = (hashCode13 + (d != null ? d.hashCode() : 0)) * 31;
        String str12 = this.f25808p;
        int hashCode15 = (hashCode14 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.f25809q;
        int hashCode16 = (hashCode15 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.f25810r;
        int hashCode17 = (hashCode16 + (str14 != null ? str14.hashCode() : 0)) * 31;
        String str15 = this.f25811s;
        int hashCode18 = (hashCode17 + (str15 != null ? str15.hashCode() : 0)) * 31;
        String str16 = this.f25812t;
        int hashCode19 = (hashCode18 + (str16 != null ? str16.hashCode() : 0)) * 31;
        Boolean bool = this.f25813u;
        int hashCode20 = (hashCode19 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f25814v;
        int hashCode21 = (hashCode20 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.f25815w;
        if (bool3 != null) {
            i = bool3.hashCode();
        }
        return hashCode21 + i;
    }

    public final String toString() {
        return "RequestBody(assetKey=" + this.f25794b + ", assetType=" + this.f25795c + ", bundleId=" + this.f25796d + ", moduleVersion=" + this.f25797e + ", os=" + this.f25798f + ", osVersion=" + this.f25799g + ", version=" + this.f25800h + ", manufacturer=" + this.f25801i + ", model=" + this.f25802j + ", height=" + this.f25803k + ", width=" + this.f25804l + ", uiMode=" + this.f25805m + ", layoutSize=" + this.f25806n + ", density=" + this.f25807o + ", language=" + this.f25808p + ", country=" + this.f25809q + ", connectivity=" + this.f25810r + ", consentToken=" + this.f25811s + ", purchases=" + this.f25812t + ", enabled=" + this.f25813u + ", isChildUnderCoppa=" + this.f25814v + ", isUnderAgeOfGdprConsent=" + this.f25815w + ")";
    }
}
