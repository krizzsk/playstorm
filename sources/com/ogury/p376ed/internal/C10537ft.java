package com.ogury.p376ed.internal;

import java.lang.reflect.Field;
import p394io.presage.common.AdConfig;

/* renamed from: com.ogury.ed.internal.ft */
public final class C10537ft {
    /* renamed from: a */
    public static final void m32041a(AdConfig adConfig, String str) {
        C10765mq.m32773b(str, "campaignId");
        if (adConfig != null) {
            Field declaredField = adConfig.getClass().getDeclaredField("campaignId");
            C10765mq.m32770a((Object) declaredField, "this::class.java.getDeclaredField(\"campaignId\")");
            declaredField.setAccessible(true);
            declaredField.set(adConfig, str);
        }
    }

    /* renamed from: b */
    public static final void m32042b(AdConfig adConfig, String str) {
        C10765mq.m32773b(str, "creativeId");
        if (adConfig != null) {
            Field declaredField = adConfig.getClass().getDeclaredField("creativeId");
            C10765mq.m32770a((Object) declaredField, "this::class.java.getDeclaredField(\"creativeId\")");
            declaredField.setAccessible(true);
            declaredField.set(adConfig, str);
        }
    }
}
