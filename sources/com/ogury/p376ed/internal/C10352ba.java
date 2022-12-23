package com.ogury.p376ed.internal;

import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: com.ogury.ed.internal.ba */
public final class C10352ba {

    /* renamed from: a */
    private final ViewGroup f26232a;

    public C10352ba(ViewGroup viewGroup) {
        C10765mq.m32773b(viewGroup, "adLayout");
        this.f26232a = viewGroup;
    }

    /* renamed from: a */
    public final void mo67088a(C10576gy gyVar) {
        C10765mq.m32773b(gyVar, "adExposure");
        ViewParent parent = this.f26232a.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null && viewGroup.getVisibility() != 0) {
            gyVar.mo67513a(0.0f);
        }
    }
}
