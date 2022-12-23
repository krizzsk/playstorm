package com.ogury.p376ed.internal;

import android.graphics.Rect;

/* renamed from: com.ogury.ed.internal.bj */
public final class C10363bj implements C10364bk {

    /* renamed from: a */
    private int f26244a;

    /* renamed from: a */
    public final void mo67092a(Rect rect, Rect rect2) {
        C10765mq.m32773b(rect, "adLayoutRect");
        C10765mq.m32773b(rect2, "containerRect");
        int i = rect2.top - this.f26244a;
        if (i != 0) {
            this.f26244a = rect2.top;
            rect.top -= i;
            rect.bottom -= i;
        }
    }
}
