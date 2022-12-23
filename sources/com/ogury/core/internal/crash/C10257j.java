package com.ogury.core.internal.crash;

import android.content.Context;
import com.ogury.core.internal.C10219ai;
import com.ogury.core.internal.crash.C10246c;

/* renamed from: com.ogury.core.internal.crash.j */
/* compiled from: CrashSerializerFactory.kt */
public final class C10257j {

    /* renamed from: a */
    private final Context f26044a;

    /* renamed from: b */
    private final C10250e f26045b;

    /* renamed from: c */
    private final C10264m f26046c;

    public C10257j(Context context, C10250e eVar, C10264m mVar) {
        C10219ai.m31036b(context, "context");
        C10219ai.m31036b(eVar, "crashFormatter");
        C10219ai.m31036b(mVar, "fileStore");
        this.f26044a = context;
        this.f26045b = eVar;
        this.f26046c = mVar;
    }

    /* renamed from: a */
    public final C10246c mo66831a(Throwable th) {
        C10219ai.m31036b(th, "throwable");
        return new C10246c(new C10246c.C10247a(this.f26044a, this.f26045b, this.f26046c, th), (byte) 0);
    }
}
