package com.ogury.p376ed.internal;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TapjoyConstants;
import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.fr */
public final class C10535fr {

    /* renamed from: a */
    private final String f26638a;

    /* renamed from: b */
    private final String f26639b;

    /* renamed from: c */
    private final String f26640c;

    /* renamed from: d */
    private final String f26641d;

    /* renamed from: e */
    private final String f26642e;

    /* renamed from: f */
    private final String f26643f;

    /* renamed from: g */
    private final Boolean f26644g;

    /* renamed from: h */
    private final Boolean f26645h;

    /* renamed from: i */
    private final String f26646i;

    /* renamed from: j */
    private final String f26647j;

    /* renamed from: k */
    private final String f26648k;

    /* renamed from: l */
    private final String f26649l;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10535fr)) {
            return false;
        }
        C10535fr frVar = (C10535fr) obj;
        return C10765mq.m32772a((Object) this.f26638a, (Object) frVar.f26638a) && C10765mq.m32772a((Object) this.f26639b, (Object) frVar.f26639b) && C10765mq.m32772a((Object) this.f26640c, (Object) frVar.f26640c) && C10765mq.m32772a((Object) this.f26641d, (Object) frVar.f26641d) && C10765mq.m32772a((Object) this.f26642e, (Object) frVar.f26642e) && C10765mq.m32772a((Object) this.f26643f, (Object) frVar.f26643f) && C10765mq.m32772a((Object) this.f26644g, (Object) frVar.f26644g) && C10765mq.m32772a((Object) this.f26645h, (Object) frVar.f26645h) && C10765mq.m32772a((Object) this.f26646i, (Object) frVar.f26646i) && C10765mq.m32772a((Object) this.f26647j, (Object) frVar.f26647j) && C10765mq.m32772a((Object) this.f26648k, (Object) frVar.f26648k) && C10765mq.m32772a((Object) this.f26649l, (Object) frVar.f26649l);
    }

    public final int hashCode() {
        int hashCode = ((((((this.f26638a.hashCode() * 31) + this.f26639b.hashCode()) * 31) + this.f26640c.hashCode()) * 31) + this.f26641d.hashCode()) * 31;
        String str = this.f26642e;
        int i = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f26643f.hashCode()) * 31;
        Boolean bool = this.f26644g;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f26645h;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.f26646i;
        int hashCode5 = (((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f26647j.hashCode()) * 31;
        String str3 = this.f26648k;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f26649l;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        return "Token(assetKey=" + this.f26638a + ", moduleVersion=" + this.f26639b + ", orientation=" + this.f26640c + ", timeZone=" + this.f26641d + ", deviceId=" + this.f26642e + ", consentToken=" + this.f26643f + ", isChildUnderCoppa=" + this.f26644g + ", isUnderAgeOfGdprConsent=" + this.f26645h + ", adContentThreshold=" + this.f26646i + ", instanceToken=" + this.f26647j + ", campaignId=" + this.f26648k + ", creativeId=" + this.f26649l + ')';
    }

    private C10535fr(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, String str8) {
        C10765mq.m32773b(str, "assetKey");
        C10765mq.m32773b(str2, "moduleVersion");
        C10765mq.m32773b(str3, "orientation");
        C10765mq.m32773b(str4, "timeZone");
        C10765mq.m32773b(str6, "consentToken");
        C10765mq.m32773b(str8, "instanceToken");
        this.f26638a = str;
        this.f26639b = str2;
        this.f26640c = str3;
        this.f26641d = str4;
        this.f26642e = str5;
        this.f26643f = str6;
        this.f26644g = bool;
        this.f26645h = bool2;
        this.f26646i = str7;
        this.f26647j = str8;
        this.f26648k = null;
        this.f26649l = null;
    }

    public /* synthetic */ C10535fr(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, String str8, byte b) {
        this(str, str2, str3, str4, str5, str6, bool, bool2, str7, str8);
    }

    /* renamed from: b */
    private String m32019b() {
        return this.f26638a;
    }

    /* renamed from: c */
    private String m32020c() {
        return this.f26639b;
    }

    /* renamed from: d */
    private String m32021d() {
        return this.f26640c;
    }

    /* renamed from: e */
    private String m32022e() {
        return this.f26641d;
    }

    /* renamed from: f */
    private String m32023f() {
        return this.f26642e;
    }

    /* renamed from: g */
    private String m32024g() {
        return this.f26643f;
    }

    /* renamed from: h */
    private Boolean m32025h() {
        return this.f26644g;
    }

    /* renamed from: i */
    private Boolean m32026i() {
        return this.f26645h;
    }

    /* renamed from: j */
    private String m32027j() {
        return this.f26646i;
    }

    /* renamed from: k */
    private String m32028k() {
        return this.f26647j;
    }

    /* renamed from: l */
    private String m32029l() {
        return this.f26648k;
    }

    /* renamed from: m */
    private String m32030m() {
        return this.f26649l;
    }

    /* renamed from: a */
    public final JSONObject mo67445a() {
        JSONObject jSONObject = new JSONObject();
        JSONObject n = m32031n();
        if (!C10552ge.m32080a(n)) {
            jSONObject.put(TapjoyConstants.TJC_APP_PLACEMENT, n);
        }
        JSONObject o = m32032o();
        if (!C10552ge.m32080a(o)) {
            jSONObject.put("ad", o);
        }
        JSONObject p = m32033p();
        if (!C10552ge.m32080a(p)) {
            jSONObject.put("sdk", p);
        }
        JSONObject q = m32034q();
        if (!C10552ge.m32080a(q)) {
            jSONObject.put("device", q);
        }
        JSONObject t = m32037t();
        if (!C10552ge.m32080a(t)) {
            jSONObject.put("privacy_compliancy", t);
        }
        JSONObject u = m32038u();
        if (!C10552ge.m32080a(u)) {
            jSONObject.put("targeting", u);
        }
        return jSONObject;
    }

    /* renamed from: n */
    private final JSONObject m32031n() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_key", m32019b());
        jSONObject.put("instance_token", m32028k());
        return jSONObject;
    }

    /* renamed from: o */
    private final JSONObject m32032o() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("campaign_id", m32029l());
        jSONObject.put(CampaignEx.JSON_KEY_CREATIVE_ID, m32030m());
        return jSONObject;
    }

    /* renamed from: p */
    private final JSONObject m32033p() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("module_version", m32020c());
        return jSONObject;
    }

    /* renamed from: q */
    private final JSONObject m32034q() {
        JSONObject jSONObject = new JSONObject();
        JSONObject r = m32035r();
        if (!C10552ge.m32080a(r)) {
            jSONObject.put("screen", r);
        }
        JSONObject s = m32036s();
        if (!C10552ge.m32080a(s)) {
            jSONObject.put("settings", s);
        }
        return jSONObject;
    }

    /* renamed from: r */
    private final JSONObject m32035r() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("orientation", m32021d());
        return jSONObject;
    }

    /* renamed from: s */
    private final JSONObject m32036s() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("time_zone", m32022e());
        jSONObject.put("device_id", m32023f());
        return jSONObject;
    }

    /* renamed from: t */
    private final JSONObject m32037t() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("consent_token", m32024g());
        if (m32025h() != null) {
            jSONObject.put("is_child_under_coppa", m32025h().booleanValue());
        }
        if (m32026i() != null) {
            jSONObject.put("is_under_age_of_gdpr_consent", m32026i().booleanValue());
        }
        return jSONObject;
    }

    /* renamed from: u */
    private final JSONObject m32038u() {
        JSONObject jSONObject = new JSONObject();
        CharSequence j = m32027j();
        if (!(j == null || j.length() == 0)) {
            jSONObject.put("ad_content_threshold", m32027j());
        }
        return jSONObject;
    }
}
