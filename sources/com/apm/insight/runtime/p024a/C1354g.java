package com.apm.insight.runtime.p024a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.C1217a;
import com.apm.insight.entity.Header;

@Deprecated
/* renamed from: com.apm.insight.runtime.a.g */
class C1354g extends C1346c {
    C1354g(Context context, C1343b bVar, C1348d dVar) {
        super(CrashType.CUSTOM_JAVA, context, bVar, dVar);
    }

    /* renamed from: a */
    public C1217a mo12447a(C1217a aVar) {
        C1217a a = super.mo12447a(aVar);
        Header a2 = Header.m1383a(this.f1394b);
        Header.m1385a(a2);
        Header.m1388b(a2);
        a2.mo12238c();
        a2.mo12239d();
        a2.mo12240e();
        a.mo12244a(a2);
        return a;
    }
}
