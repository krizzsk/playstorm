package com.ogury.p376ed;

import com.ogury.p376ed.internal.C10430dc;
import com.ogury.p376ed.internal.C10765mq;

/* renamed from: com.ogury.ed.OguryAdRequests */
public final class OguryAdRequests {
    public static final String AD_CONTENT_THRESHOLD_G = "G";
    public static final String AD_CONTENT_THRESHOLD_MA = "MA";
    public static final String AD_CONTENT_THRESHOLD_PG = "PG";
    public static final String AD_CONTENT_THRESHOLD_T = "T";
    public static final String AD_CONTENT_THRESHOLD_UNSPECIFIED = "";
    public static final OguryAdRequests INSTANCE = new OguryAdRequests();

    private OguryAdRequests() {
    }

    public static final void setAdContentThreshold(String str) {
        C10765mq.m32773b(str, "adConsentThreshold");
        C10430dc dcVar = C10430dc.f26375a;
        C10430dc.m31548a("AD_CONTENT_THRESHOLD", str);
    }

    public static final String getAdContentThreshold() {
        C10430dc dcVar = C10430dc.f26375a;
        return C10430dc.m31551b("AD_CONTENT_THRESHOLD", "");
    }
}
