package com.ogury.core.internal.crash;

import com.ogury.core.internal.C10219ai;
import com.ogury.core.internal.C10234av;
import java.util.Set;

/* renamed from: com.ogury.core.internal.crash.n */
/* compiled from: OguryPackageExtractor.kt */
public final class C10266n {

    /* renamed from: a */
    private final C10252f f26060a;

    public C10266n(C10252f fVar) {
        C10219ai.m31036b(fVar, "crashReportDao");
        this.f26060a = fVar;
    }

    /* renamed from: a */
    public final String mo66837a(String str) {
        C10219ai.m31036b(str, "stackTrace");
        Set<String> a = this.f26060a.mo66819a();
        if (a == null) {
            return null;
        }
        for (String next : a) {
            if (C10234av.m31053a((CharSequence) str, (CharSequence) next, false, 2)) {
                return next;
            }
        }
        return null;
    }
}
