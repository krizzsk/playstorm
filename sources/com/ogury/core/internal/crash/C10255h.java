package com.ogury.core.internal.crash;

import android.content.Context;
import com.ogury.core.internal.C10219ai;
import com.ogury.core.internal.crash.C10262l;

/* renamed from: com.ogury.core.internal.crash.h */
/* compiled from: CrashReportFacadeFactory.kt */
public final class C10255h {
    /* renamed from: a */
    public static C10254g m31097a(Context context, SdkInfo sdkInfo) {
        C10219ai.m31036b(context, "context");
        C10219ai.m31036b(sdkInfo, "sdkInfo");
        C10252f fVar = new C10252f(context);
        C10250e eVar = new C10250e(sdkInfo);
        C10264m mVar = new C10264m(context);
        return new C10254g(fVar, mVar, new C10257j(context, eVar, mVar), (C10258k) null, (C10262l.C10263a) null, 24);
    }
}
