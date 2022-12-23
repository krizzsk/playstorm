package com.applovin.impl.sdk.p046ad;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.ad.d */
public final class C1828d {

    /* renamed from: a */
    private static final Map<String, C1828d> f2936a = new HashMap();

    /* renamed from: b */
    private static final Object f2937b = new Object();

    /* renamed from: c */
    private JSONObject f2938c;

    /* renamed from: d */
    private final String f2939d;

    /* renamed from: e */
    private AppLovinAdSize f2940e;

    /* renamed from: f */
    private AppLovinAdType f2941f;

    private C1828d(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str) {
        String str2;
        if (!TextUtils.isEmpty(str) || !(appLovinAdType == null || appLovinAdSize == null)) {
            this.f2940e = appLovinAdSize;
            this.f2941f = appLovinAdType;
            if (StringUtils.isValidString(str)) {
                str2 = str.trim();
            } else {
                str2 = appLovinAdSize.getLabel() + "_" + appLovinAdType.getLabel();
            }
            this.f2939d = str2.toLowerCase(Locale.ENGLISH);
            return;
        }
        throw new IllegalArgumentException("No zone identifier or type or size specified");
    }

    /* renamed from: a */
    public static C1828d m3844a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType) {
        return m3845a(appLovinAdSize, appLovinAdType, (String) null);
    }

    /* renamed from: a */
    public static C1828d m3845a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str) {
        C1828d dVar = new C1828d(appLovinAdSize, appLovinAdType, str);
        synchronized (f2937b) {
            String str2 = dVar.f2939d;
            if (f2936a.containsKey(str2)) {
                dVar = f2936a.get(str2);
            } else {
                f2936a.put(str2, dVar);
            }
        }
        return dVar;
    }

    /* renamed from: a */
    public static C1828d m3846a(String str) {
        return m3845a((AppLovinAdSize) null, (AppLovinAdType) null, str);
    }

    /* renamed from: a */
    public static void m3847a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("ad_size") && jSONObject.has("ad_type")) {
            synchronized (f2937b) {
                C1828d dVar = f2936a.get(JsonUtils.getString(jSONObject, "zone_id", ""));
                if (dVar != null) {
                    dVar.f2940e = AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", ""));
                    dVar.f2941f = AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", ""));
                }
            }
        }
    }

    /* renamed from: b */
    public static C1828d m3848b(String str) {
        return m3845a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED, str);
    }

    /* renamed from: f */
    public static Collection<C1828d> m3849f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(6);
        Collections.addAll(linkedHashSet, new C1828d[]{m3850g(), m3851h(), m3852i(), m3853j(), m3854k(), m3855l()});
        return Collections.unmodifiableSet(linkedHashSet);
    }

    /* renamed from: g */
    public static C1828d m3850g() {
        return m3844a(AppLovinAdSize.BANNER, AppLovinAdType.REGULAR);
    }

    /* renamed from: h */
    public static C1828d m3851h() {
        return m3844a(AppLovinAdSize.MREC, AppLovinAdType.REGULAR);
    }

    /* renamed from: i */
    public static C1828d m3852i() {
        return m3844a(AppLovinAdSize.LEADER, AppLovinAdType.REGULAR);
    }

    /* renamed from: j */
    public static C1828d m3853j() {
        return m3844a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.REGULAR);
    }

    /* renamed from: k */
    public static C1828d m3854k() {
        return m3844a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED);
    }

    /* renamed from: l */
    public static C1828d m3855l() {
        return m3844a(AppLovinAdSize.NATIVE, AppLovinAdType.NATIVE);
    }

    /* renamed from: a */
    public String mo13931a() {
        return this.f2939d;
    }

    /* renamed from: b */
    public MaxAdFormat mo13932b() {
        AppLovinAdSize c = mo13933c();
        if (c == AppLovinAdSize.BANNER) {
            return MaxAdFormat.BANNER;
        }
        if (c == AppLovinAdSize.LEADER) {
            return MaxAdFormat.LEADER;
        }
        if (c == AppLovinAdSize.MREC) {
            return MaxAdFormat.MREC;
        }
        if (c == AppLovinAdSize.CROSS_PROMO) {
            return MaxAdFormat.CROSS_PROMO;
        }
        if (c == AppLovinAdSize.INTERSTITIAL) {
            if (mo13934d() == AppLovinAdType.REGULAR) {
                return MaxAdFormat.INTERSTITIAL;
            }
            if (mo13934d() == AppLovinAdType.INCENTIVIZED) {
                return MaxAdFormat.REWARDED;
            }
            if (mo13934d() == AppLovinAdType.AUTO_INCENTIVIZED) {
                return MaxAdFormat.REWARDED_INTERSTITIAL;
            }
            return null;
        } else if (c == AppLovinAdSize.NATIVE) {
            return MaxAdFormat.NATIVE;
        } else {
            return null;
        }
    }

    /* renamed from: c */
    public AppLovinAdSize mo13933c() {
        if (this.f2940e == null && JsonUtils.valueExists(this.f2938c, "ad_size")) {
            this.f2940e = AppLovinAdSize.fromString(JsonUtils.getString(this.f2938c, "ad_size", (String) null));
        }
        return this.f2940e;
    }

    /* renamed from: d */
    public AppLovinAdType mo13934d() {
        if (this.f2941f == null && JsonUtils.valueExists(this.f2938c, "ad_type")) {
            this.f2941f = AppLovinAdType.fromString(JsonUtils.getString(this.f2938c, "ad_type", (String) null));
        }
        return this.f2941f;
    }

    /* renamed from: e */
    public boolean mo13935e() {
        return m3849f().contains(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f2939d.equalsIgnoreCase(((C1828d) obj).f2939d);
    }

    public int hashCode() {
        return this.f2939d.hashCode();
    }

    public String toString() {
        return "AdZone{id=" + this.f2939d + ", zoneObject=" + this.f2938c + '}';
    }
}
