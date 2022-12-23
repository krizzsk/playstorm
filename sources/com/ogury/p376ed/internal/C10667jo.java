package com.ogury.p376ed.internal;

import android.util.Log;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* renamed from: com.ogury.ed.internal.jo */
public final class C10667jo {

    /* renamed from: a */
    public static final C10667jo f26924a = new C10667jo();

    /* renamed from: b */
    private static boolean f26925b;

    private C10667jo() {
    }

    /* renamed from: a */
    public static void m32616a(Throwable th) {
        C10765mq.m32773b(th, "error");
        if (f26925b) {
            Log.e(CampaignEx.KEY_OMID, "caught_error", th);
        }
    }
}
