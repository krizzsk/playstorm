package com.ogury.p376ed.internal;

import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: com.ogury.ed.internal.aa */
public final class C10305aa implements C10334am {
    /* renamed from: a */
    public final void mo67001a(C10546g gVar, C10318aj ajVar) {
        C10765mq.m32773b(gVar, "adLayout");
        C10765mq.m32773b(ajVar, "adController");
        ViewGroup.LayoutParams layoutParams = gVar.getLayoutParams();
        if (layoutParams != null) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 0;
            gVar.setLeft(0);
            gVar.setTop(0);
            gVar.mo67458c();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }
}
