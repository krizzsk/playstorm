package com.ogury.p376ed.internal;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.ogury.ed.internal.cb */
public final class C10391cb {

    /* renamed from: a */
    private final View f26318a;

    public C10391cb(Activity activity) {
        C10765mq.m32773b(activity, "activity");
        View decorView = activity.getWindow().getDecorView();
        if (decorView != null) {
            this.f26318a = ((ViewGroup) decorView).getChildAt(0);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: a */
    public final int mo67146a() {
        return this.f26318a.getMeasuredWidth();
    }

    /* renamed from: b */
    public final int mo67147b() {
        return this.f26318a.getMeasuredHeight();
    }
}
