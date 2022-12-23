package com.ogury.p376ed.internal;

import java.util.List;

/* renamed from: com.ogury.ed.internal.ij */
public final class C10626ij implements C10632in {

    /* renamed from: a */
    private final C10629il f26824a;

    /* renamed from: a */
    public final void mo67626a() {
    }

    public C10626ij(C10629il ilVar) {
        C10765mq.m32773b(ilVar, "loadCallback");
        this.f26824a = ilVar;
    }

    /* renamed from: a */
    public final void mo67627a(List<? extends C10635iq> list) {
        C10765mq.m32773b(list, "loadCommands");
        for (C10635iq a : list) {
            a.mo67628a(this.f26824a);
        }
    }
}
