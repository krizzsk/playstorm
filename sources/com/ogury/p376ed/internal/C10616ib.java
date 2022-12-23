package com.ogury.p376ed.internal;

import android.content.Context;
import android.content.pm.ShortcutManager;

/* renamed from: com.ogury.ed.internal.ib */
public final class C10616ib {
    /* renamed from: a */
    public static ShortcutManager m32359a(Context context) {
        C10765mq.m32773b(context, "context");
        Object systemService = context.getSystemService(ShortcutManager.class);
        C10765mq.m32770a(systemService, "context.getSystemService…rtcutManager::class.java)");
        return (ShortcutManager) systemService;
    }
}
