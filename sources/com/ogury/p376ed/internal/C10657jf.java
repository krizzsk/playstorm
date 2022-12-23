package com.ogury.p376ed.internal;

import android.graphics.Rect;
import android.view.View;

/* renamed from: com.ogury.ed.internal.jf */
public final class C10657jf implements C10656je {

    /* renamed from: a */
    private final C10510ez f26898a;

    /* renamed from: b */
    private final boolean f26899b;

    public C10657jf(C10510ez ezVar, boolean z) {
        C10765mq.m32773b(ezVar, "androidDevice");
        this.f26898a = ezVar;
        this.f26899b = z;
    }

    /* renamed from: a */
    public final void mo67681a(C10580hb hbVar) {
        C10765mq.m32773b(hbVar, "mraidCommandExecutor");
        int a = C10556gi.m32086a(this.f26898a.mo67342k());
        int a2 = C10556gi.m32086a(this.f26898a.mo67343l());
        Rect a3 = this.f26898a.mo67337a((View) hbVar.mo67518a());
        hbVar.mo67520a(a, a2);
        hbVar.mo67529b(C10556gi.m32086a(a3.width()), C10556gi.m32086a(a3.height()));
        m32570b(hbVar);
    }

    /* renamed from: b */
    private final void m32570b(C10580hb hbVar) {
        String n = this.f26898a.mo67345n();
        hbVar.mo67525a(n, this.f26899b);
        if (!this.f26899b) {
            n = "none";
        }
        hbVar.mo67527a(!this.f26899b, n);
    }
}
