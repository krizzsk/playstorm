package com.ogury.p376ed.internal;

import android.content.res.Configuration;
import android.graphics.Rect;

/* renamed from: com.ogury.ed.internal.bl */
public final class C10365bl implements C10364bk {

    /* renamed from: a */
    private final Configuration f26245a;

    /* renamed from: b */
    private Rect f26246b = new Rect();

    /* renamed from: c */
    private Rect f26247c = new Rect();

    /* renamed from: d */
    private int f26248d = this.f26245a.orientation;

    public C10365bl(Configuration configuration) {
        C10765mq.m32773b(configuration, "configuration");
        this.f26245a = configuration;
    }

    /* renamed from: a */
    public final void mo67092a(Rect rect, Rect rect2) {
        C10765mq.m32773b(rect, "adLayoutRect");
        C10765mq.m32773b(rect2, "containerRect");
        int i = this.f26245a.orientation;
        if (this.f26248d != i) {
            m31360b(rect, rect2);
            m31361c(rect, rect2);
        }
        this.f26246b = new Rect(rect2);
        this.f26248d = i;
    }

    /* renamed from: b */
    private final void m31360b(Rect rect, Rect rect2) {
        int i = this.f26247c.left - this.f26246b.left;
        int width = this.f26246b.width() - this.f26247c.width();
        if (width != 0) {
            float f = ((float) i) / ((float) width);
            int width2 = rect.width();
            rect.left = rect2.left + C10778nc.m32798a(((float) (rect2.width() - width2)) * f);
            rect.right = rect.left + width2;
        }
    }

    /* renamed from: c */
    private final void m31361c(Rect rect, Rect rect2) {
        int i = this.f26247c.top - this.f26246b.top;
        int height = this.f26246b.height() - this.f26247c.height();
        if (height != 0) {
            float f = ((float) i) / ((float) height);
            int height2 = rect.height();
            rect.top = rect2.top + C10778nc.m32798a(((float) (rect2.height() - height2)) * f);
            rect.bottom = rect.top + height2;
        }
    }

    /* renamed from: a */
    public final void mo67096a(Rect rect) {
        C10765mq.m32773b(rect, "adLayoutRect");
        this.f26247c = new Rect(rect);
    }
}
