package com.ogury.p376ed.internal;

import android.graphics.Rect;
import android.view.View;

/* renamed from: com.ogury.ed.internal.bd */
public final class C10355bd {
    /* renamed from: a */
    public static final boolean m31333a(View view, Rect rect) {
        C10765mq.m32773b(view, "<this>");
        C10765mq.m32773b(rect, "containerRect");
        return ((float) rect.height()) <= ((float) view.getRootView().getHeight()) * 0.4f;
    }
}
