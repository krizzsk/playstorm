package com.apm.insight.runtime.p024a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.C1217a;
import com.apm.insight.entity.Header;
import com.apm.insight.p023l.C1313s;

/* renamed from: com.apm.insight.runtime.a.e */
public class C1351e extends C1346c {
    C1351e(Context context, C1343b bVar, C1348d dVar) {
        super(CrashType.BLOCK, context, bVar, dVar);
    }

    /* renamed from: a */
    public C1217a mo12447a(C1217a aVar) {
        C1217a a = super.mo12447a(aVar);
        mo12472g(a);
        C1313s.m1884a(a, (Header) null, this.f1393a);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo12448a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo12467c() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo12469d() {
        return false;
    }
}
