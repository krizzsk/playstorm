package com.ogury.p376ed.internal;

import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.ogury.core.internal.crash.OguryCrashReport;

/* renamed from: com.ogury.ed.internal.da */
public final class C10427da {

    /* renamed from: a */
    public static final C10427da f26371a = new C10427da();

    private C10427da() {
    }

    /* renamed from: a */
    public static void m31544a(Throwable th) {
        C10765mq.m32773b(th, "t");
        try {
            OguryCrashReport.logException(CampaignUnit.JSON_KEY_ADS, th);
        } catch (Throwable unused) {
        }
    }
}
