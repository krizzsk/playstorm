package com.ogury.p376ed.internal;

import java.util.List;

/* renamed from: com.ogury.ed.internal.ck */
public final class C10403ck {

    /* renamed from: a */
    private List<String> f26339a = C10692km.m32648a();

    /* renamed from: b */
    private List<? extends Class<?>> f26340b = C10692km.m32648a();

    /* renamed from: a */
    public final List<String> mo67155a() {
        return this.f26339a;
    }

    /* renamed from: a */
    public final void mo67156a(List<String> list) {
        C10765mq.m32773b(list, "<set-?>");
        this.f26339a = list;
    }

    /* renamed from: b */
    public final List<Class<?>> mo67157b() {
        return this.f26340b;
    }

    /* renamed from: b */
    public final void mo67158b(List<? extends Class<?>> list) {
        C10765mq.m32773b(list, "<set-?>");
        this.f26340b = list;
    }

    /* renamed from: c */
    public final boolean mo67159c() {
        return this.f26339a.isEmpty() && this.f26340b.isEmpty();
    }
}
