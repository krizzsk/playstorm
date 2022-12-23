package com.ogury.p376ed.internal;

import android.content.Context;

/* renamed from: com.ogury.ed.internal.gh */
public final class C10555gh {
    /* renamed from: a */
    public static final boolean m32084a(Context context, String str) {
        C10765mq.m32773b(context, "<this>");
        C10765mq.m32773b(str, "permission");
        return context.checkCallingOrSelfPermission(str) == 0;
    }
}
