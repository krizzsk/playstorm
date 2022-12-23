package com.ogury.p376ed.internal;

import android.content.Context;
import com.ogury.p376ed.internal.C10446dj;

/* renamed from: com.ogury.ed.internal.di */
public final class C10445di {

    /* renamed from: a */
    public static final C10445di f26411a = new C10445di();

    /* renamed from: b */
    private static C10446dj f26412b;

    private C10445di() {
    }

    /* renamed from: a */
    public static void m31607a(Context context) {
        C10765mq.m32773b(context, "context");
        if (f26412b == null) {
            C10446dj.C10447a aVar = C10446dj.f26413a;
            f26412b = C10446dj.C10447a.m31617a(context);
        }
    }

    /* renamed from: a */
    public static void m31608a(C10444dh dhVar) {
        C10765mq.m32773b(dhVar, "event");
        C10446dj djVar = f26412b;
        if (djVar != null) {
            djVar.mo67189a(dhVar);
        }
    }
}
