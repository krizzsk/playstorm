package com.ogury.p376ed.internal;

import android.graphics.Rect;

/* renamed from: com.ogury.ed.internal.bg */
public final class C10360bg implements C10364bk {
    /* renamed from: a */
    private static float m31344a(int i, int i2) {
        return ((float) i) / ((float) i2);
    }

    /* renamed from: a */
    public final void mo67092a(Rect rect, Rect rect2) {
        C10765mq.m32773b(rect, "adLayoutRect");
        C10765mq.m32773b(rect2, "containerRect");
        m31345b(rect, rect2);
        m31346c(rect, rect2);
    }

    /* renamed from: b */
    private static void m31345b(Rect rect, Rect rect2) {
        if (rect.width() > rect2.width()) {
            C10349ay.m31315a(rect, m31344a(rect.width(), rect2.width()));
        }
    }

    /* renamed from: c */
    private static void m31346c(Rect rect, Rect rect2) {
        if (rect.height() > rect2.height()) {
            C10349ay.m31315a(rect, m31344a(rect.height(), rect2.height()));
        }
    }
}
