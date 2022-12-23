package com.ogury.p376ed.internal;

import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ogury.ed.internal.ip */
public final class C10634ip implements C10632in {

    /* renamed from: a */
    private final C10629il f26839a;

    /* renamed from: b */
    private LinkedList<C10635iq> f26840b = new LinkedList<>();

    public C10634ip(C10629il ilVar) {
        C10765mq.m32773b(ilVar, "loadCallback");
        this.f26839a = ilVar;
    }

    /* renamed from: a */
    public final void mo67627a(List<? extends C10635iq> list) {
        C10765mq.m32773b(list, "loadCommands");
        this.f26840b.addAll(list);
        m32431b();
    }

    /* renamed from: a */
    public final void mo67626a() {
        m32431b();
    }

    /* renamed from: b */
    private final void m32431b() {
        C10635iq pollFirst = this.f26840b.pollFirst();
        if (pollFirst != null) {
            pollFirst.mo67628a(this.f26839a);
        }
    }
}
