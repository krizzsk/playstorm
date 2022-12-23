package com.applovin.impl.sdk;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinUserSegment;

/* renamed from: com.applovin.impl.sdk.g */
class C1939g implements AppLovinUserSegment {

    /* renamed from: a */
    private String f3602a;

    C1939g() {
    }

    public String getName() {
        return this.f3602a;
    }

    public void setName(String str) {
        if (C2092v.m5047a() && str != null) {
            if (str.length() > 32) {
                C2092v.m5053i("AppLovinUserSegment", "Setting name greater than 32 characters: " + str);
            }
            if (!StringUtils.isAlphaNumeric(str)) {
                C2092v.m5053i("AppLovinUserSegment", "Setting name that is not alphanumeric: " + str);
            }
        }
        this.f3602a = str;
    }

    public String toString() {
        return "AppLovinUserSegment{name=" + getName() + '}';
    }
}
