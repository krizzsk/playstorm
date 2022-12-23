package com.ogury.p376ed.internal;

import android.content.Context;
import com.ogury.p376ed.internal.C10527fk;

/* renamed from: com.ogury.ed.internal.fn */
public final class C10531fn {

    /* renamed from: a */
    public static final C10531fn f26635a = new C10531fn();

    /* renamed from: b */
    private static C10530fm f26636b;

    private C10531fn() {
    }

    /* renamed from: a */
    public static C10530fm m32004a() {
        return f26636b;
    }

    /* renamed from: a */
    public static void m32006a(C10530fm fmVar) {
        C10765mq.m32773b(fmVar, "newProfig");
        f26636b = fmVar;
    }

    /* renamed from: a */
    public static C10530fm m32005a(Context context) {
        C10765mq.m32773b(context, "context");
        if (f26636b == null) {
            C10527fk.C10528a aVar = C10527fk.f26610a;
            String d = C10527fk.C10528a.m31966a(context).mo67398d();
            C10532fo foVar = C10532fo.f26637a;
            f26636b = C10532fo.m32008a(d);
        }
        return f26636b;
    }

    /* renamed from: b */
    public static void m32007b(Context context) throws C10499eq {
        C10765mq.m32773b(context, "context");
        C10517fc.f26576a.mo67367a(context).mo67366b();
    }
}
