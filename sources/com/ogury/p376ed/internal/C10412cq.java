package com.ogury.p376ed.internal;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ogury.ed.internal.cq */
public final class C10412cq implements C10413cr {

    /* renamed from: a */
    private final List<C10413cr> f26351a = new ArrayList();

    /* renamed from: a */
    public final void mo67165a() {
        for (C10413cr a : this.f26351a) {
            a.mo67165a();
        }
        this.f26351a.clear();
    }

    /* renamed from: a */
    public final void mo67166a(C10413cr crVar) {
        C10765mq.m32773b(crVar, "disposable");
        this.f26351a.add(crVar);
    }
}
