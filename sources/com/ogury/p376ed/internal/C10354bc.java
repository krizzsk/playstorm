package com.ogury.p376ed.internal;

import android.graphics.Rect;
import android.view.View;

/* renamed from: com.ogury.ed.internal.bc */
public final class C10354bc {
    /* renamed from: a */
    public static Rect m31330a(View view) {
        C10765mq.m32773b(view, "view");
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }

    /* renamed from: b */
    public static Rect m31331b(View view) {
        C10765mq.m32773b(view, "view");
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return rect;
    }

    /* renamed from: c */
    public static Rect m31332c(View view) {
        C10765mq.m32773b(view, "view");
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        if (rect.width() != view.getWidth()) {
            rect.right = rect.left + view.getWidth();
        }
        if (rect.height() != view.getHeight()) {
            rect.bottom = rect.top + view.getHeight();
        }
        return rect;
    }
}
