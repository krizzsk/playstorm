package com.ogury.p376ed.internal;

import android.graphics.Rect;
import java.util.List;

/* renamed from: com.ogury.ed.internal.ay */
public final class C10349ay {
    /* renamed from: a */
    public static final int m31314a(Rect rect) {
        C10765mq.m32773b(rect, "<this>");
        return rect.width() * rect.height();
    }

    /* renamed from: a */
    public static final void m31316a(Rect rect, Rect rect2) {
        C10765mq.m32773b(rect, "<this>");
        C10765mq.m32773b(rect2, "screenRect");
        rect.offset(-rect2.left, -rect2.top);
    }

    /* renamed from: a */
    public static final void m31317a(List<Rect> list, Rect rect) {
        C10765mq.m32773b(list, "<this>");
        C10765mq.m32773b(rect, "containerRect");
        for (Rect a : list) {
            m31316a(a, rect);
        }
    }

    /* renamed from: a */
    public static final boolean m31318a(Rect rect, List<Rect> list) {
        C10765mq.m32773b(rect, "<this>");
        C10765mq.m32773b(list, "rectangles");
        return list.contains(rect);
    }

    /* renamed from: b */
    public static final int m31320b(Rect rect, Rect rect2) {
        C10765mq.m32773b(rect, "<this>");
        C10765mq.m32773b(rect2, "rect2");
        if (rect.left >= rect2.right || rect2.left >= rect.right || rect.top >= rect2.bottom || rect2.top >= rect.bottom) {
            return 0;
        }
        int max = Math.max(rect.left, rect2.left);
        int max2 = Math.max(rect.top, rect2.top);
        return (Math.min(rect.right, rect2.right) - max) * (Math.min(rect.bottom, rect2.bottom) - max2);
    }

    /* renamed from: a */
    public static final boolean m31319a(List<Rect> list, int i, int i2) {
        C10765mq.m32773b(list, "<this>");
        for (Rect contains : list) {
            if (contains.contains(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static final Rect m31321c(Rect rect, Rect rect2) {
        C10765mq.m32773b(rect, "<this>");
        C10765mq.m32773b(rect2, "rect2");
        Rect rect3 = new Rect(rect);
        if (!rect3.intersect(rect2)) {
            return null;
        }
        return rect3;
    }

    /* renamed from: a */
    public static final void m31315a(Rect rect, float f) {
        C10765mq.m32773b(rect, "<this>");
        rect.bottom = rect.top + ((int) (((float) rect.height()) / f));
        rect.right = rect.left + ((int) (((float) rect.width()) / f));
    }
}
