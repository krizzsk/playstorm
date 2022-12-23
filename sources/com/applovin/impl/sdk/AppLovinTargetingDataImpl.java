package com.applovin.impl.sdk;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdContentRating;
import com.applovin.sdk.AppLovinGender;
import com.applovin.sdk.AppLovinTargetingData;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppLovinTargetingDataImpl implements AppLovinTargetingData {

    /* renamed from: a */
    private final Map<String, String> f2812a = new HashMap();

    /* renamed from: b */
    private final Object f2813b = new Object();

    /* renamed from: c */
    private Integer f2814c = null;

    /* renamed from: d */
    private AppLovinGender f2815d = null;

    /* renamed from: e */
    private AppLovinAdContentRating f2816e = null;

    /* renamed from: f */
    private String f2817f = null;

    /* renamed from: g */
    private String f2818g = null;

    /* renamed from: h */
    private List<String> f2819h = null;

    /* renamed from: i */
    private List<String> f2820i = null;

    /* renamed from: a */
    private void m3735a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f2813b) {
                if (StringUtils.isValidString(str2)) {
                    this.f2812a.put(str, str2);
                } else {
                    this.f2812a.remove(str);
                }
            }
        }
    }

    public void clearAll() {
        synchronized (this.f2813b) {
            this.f2812a.clear();
        }
    }

    public Map<String, String> getAllData() {
        HashMap hashMap;
        synchronized (this.f2813b) {
            hashMap = new HashMap(this.f2812a);
        }
        return hashMap;
    }

    public String getEmail() {
        return this.f2817f;
    }

    public AppLovinGender getGender() {
        return this.f2815d;
    }

    public List<String> getInterests() {
        return this.f2820i;
    }

    public List<String> getKeywords() {
        return this.f2819h;
    }

    public AppLovinAdContentRating getMaximumAdContentRating() {
        return this.f2816e;
    }

    public String getPhoneNumber() {
        return this.f2818g;
    }

    public Integer getYearOfBirth() {
        return this.f2814c;
    }

    public void setEmail(String str) {
        m3735a("email", str != null ? StringUtils.toFullSHA1Hash(str.toLowerCase().trim()) : str);
        this.f2817f = str;
    }

    public void setGender(AppLovinGender appLovinGender) {
        String str;
        if (appLovinGender != null) {
            if (appLovinGender == AppLovinGender.FEMALE) {
                str = "F";
            } else if (appLovinGender == AppLovinGender.MALE) {
                str = "M";
            } else if (appLovinGender == AppLovinGender.OTHER) {
                str = "O";
            }
            m3735a(InneractiveMediationDefs.KEY_GENDER, str);
            this.f2815d = appLovinGender;
        }
        str = null;
        m3735a(InneractiveMediationDefs.KEY_GENDER, str);
        this.f2815d = appLovinGender;
    }

    public void setInterests(List<String> list) {
        m3735a("interests", list == null ? null : CollectionUtils.implode(list, list.size()));
        this.f2820i = list;
    }

    public void setKeywords(List<String> list) {
        m3735a("keywords", list == null ? null : CollectionUtils.implode(list, list.size()));
        this.f2819h = list;
    }

    public void setMaximumAdContentRating(AppLovinAdContentRating appLovinAdContentRating) {
        m3735a("maximum_ad_content_rating", (appLovinAdContentRating == null || appLovinAdContentRating == AppLovinAdContentRating.NONE) ? null : Integer.toString(appLovinAdContentRating.ordinal()));
        this.f2816e = appLovinAdContentRating;
    }

    public void setPhoneNumber(String str) {
        m3735a("phone_number", str != null ? StringUtils.toFullSHA1Hash(str.replaceAll("[^0-9]", "")) : str);
        this.f2818g = str;
    }

    public void setYearOfBirth(Integer num) {
        m3735a("year_of_birth", num == null ? null : Integer.toString(num.intValue()));
        this.f2814c = num;
    }
}
