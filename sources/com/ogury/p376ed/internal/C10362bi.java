package com.ogury.p376ed.internal;

import android.graphics.Rect;

/* renamed from: com.ogury.ed.internal.bi */
public final class C10362bi implements C10364bk {

    /* renamed from: a */
    private final float f26243a;

    public C10362bi(float f) {
        this.f26243a = f;
    }

    /* renamed from: a */
    public final void mo67092a(Rect rect, Rect rect2) {
        C10765mq.m32773b(rect, "adLayoutRect");
        C10765mq.m32773b(rect2, "containerRect");
        new C10361bh(rect, rect2, this.f26243a).mo67092a(rect, rect2);
    }

    /* renamed from: b */
    public final C10361bh mo67095b(Rect rect, Rect rect2) {
        C10765mq.m32773b(rect, "adLayoutRect");
        C10765mq.m32773b(rect2, "containerRect");
        return new C10361bh(rect, rect2, this.f26243a);
    }
}
