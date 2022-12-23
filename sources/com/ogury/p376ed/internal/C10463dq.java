package com.ogury.p376ed.internal;

import android.content.Context;

/* renamed from: com.ogury.ed.internal.dq */
public final class C10463dq {

    /* renamed from: a */
    private final Context f26441a;

    /* renamed from: b */
    private final C10531fn f26442b;

    /* renamed from: c */
    private final C10430dc f26443c;

    private C10463dq(Context context, C10531fn fnVar, C10430dc dcVar) {
        C10765mq.m32773b(context, "context");
        C10765mq.m32773b(fnVar, "profigGateway");
        C10765mq.m32773b(dcVar, "extraAdConfiguration");
        this.f26441a = context;
        this.f26442b = fnVar;
        this.f26443c = dcVar;
    }

    public /* synthetic */ C10463dq(Context context) {
        this(context, C10531fn.f26635a, C10430dc.f26375a);
    }

    /* renamed from: a */
    public final boolean mo67196a() {
        C10530fm a = C10531fn.m32005a(this.f26441a);
        return m31642a(a == null ? null : Integer.valueOf(a.mo67442q()));
    }

    /* renamed from: b */
    public final boolean mo67197b() {
        C10530fm a = C10531fn.m32005a(this.f26441a);
        return m31642a(a == null ? null : Integer.valueOf(a.mo67443r()));
    }

    /* renamed from: a */
    private final boolean m31642a(Integer num) {
        int intValue = (num == null ? 0 : num.intValue()) & 1;
        if (C10430dc.m31549a()) {
            C10530fm a = C10531fn.m32005a(this.f26441a);
            intValue &= a == null ? 0 : a.mo67444s();
        }
        return intValue == 1;
    }
}
