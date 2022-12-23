package com.ogury.p376ed.internal;

import android.graphics.Rect;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ogury.ed.internal.gy */
public final class C10576gy {

    /* renamed from: a */
    private Rect f26701a;

    /* renamed from: b */
    private List<Rect> f26702b;

    /* renamed from: c */
    private float f26703c;

    public C10576gy() {
        List<Rect> emptyList = Collections.emptyList();
        C10765mq.m32770a((Object) emptyList, "emptyList()");
        this.f26702b = emptyList;
    }

    /* renamed from: a */
    public final Rect mo67512a() {
        return this.f26701a;
    }

    /* renamed from: a */
    public final void mo67514a(Rect rect) {
        this.f26701a = rect;
    }

    /* renamed from: a */
    public final void mo67515a(List<Rect> list) {
        C10765mq.m32773b(list, "<set-?>");
        this.f26702b = list;
    }

    /* renamed from: b */
    public final List<Rect> mo67516b() {
        return this.f26702b;
    }

    /* renamed from: a */
    public final void mo67513a(float f) {
        this.f26703c = f;
    }

    /* renamed from: c */
    public final float mo67517c() {
        return this.f26703c;
    }
}
