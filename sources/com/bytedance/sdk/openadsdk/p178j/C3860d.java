package com.bytedance.sdk.openadsdk.p178j;

import com.tapjoy.TapjoyConstants;

/* renamed from: com.bytedance.sdk.openadsdk.j.d */
/* compiled from: NetType */
public enum C3860d {
    TYPE_2G("2g"),
    TYPE_3G("3g"),
    TYPE_4G("4g"),
    TYPE_5G("5g"),
    TYPE_WIFI(TapjoyConstants.TJC_CONNECTION_TYPE_WIFI),
    TYPE_UNKNOWN(TapjoyConstants.TJC_CONNECTION_TYPE_MOBILE);
    

    /* renamed from: g */
    private String f9986g;

    private C3860d(String str) {
        this.f9986g = str;
    }

    public String toString() {
        return this.f9986g;
    }
}
