package com.ogury.p376ed.internal;

import android.content.Context;

/* renamed from: com.ogury.ed.internal.ab */
public final class C10306ab {

    /* renamed from: a */
    private C10546g f26111a;

    /* renamed from: b */
    private final Context f26112b;

    /* renamed from: c */
    private final C10510ez f26113c;

    public /* synthetic */ C10306ab(C10546g gVar, Context context) {
        this(gVar, context, new C10510ez(context));
    }

    private C10306ab(C10546g gVar, Context context, C10510ez ezVar) {
        C10765mq.m32773b(gVar, "adLayout");
        C10765mq.m32773b(context, "context");
        C10765mq.m32773b(ezVar, "androidDevice");
        this.f26111a = gVar;
        this.f26112b = context;
        this.f26113c = ezVar;
    }

    /* renamed from: a */
    public final void mo67003a(C10546g gVar) {
        C10765mq.m32773b(gVar, "<set-?>");
        this.f26111a = gVar;
    }

    /* renamed from: a */
    private final int m31150a(int i, boolean z) {
        if (!z) {
            return i;
        }
        if (this.f26113c.mo67347p()) {
            return -1;
        }
        return this.f26113c.mo67343l();
    }

    /* renamed from: a */
    public final void mo67002a(C10407cn cnVar, boolean z, boolean z2) {
        C10765mq.m32773b(cnVar, "adSize");
        C10648iz izVar = new C10648iz(false, m31150a(cnVar.mo67160a(), z), cnVar.mo67161b(), 0, 0);
        izVar.mo67673e(17);
        if (z2) {
            this.f26111a.setLeft(0);
            this.f26111a.setTop(0);
            this.f26111a.setInitialSize(izVar);
            return;
        }
        this.f26111a.setInitialSizeWithoutResizing(izVar);
    }
}
