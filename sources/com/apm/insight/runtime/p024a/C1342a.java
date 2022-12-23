package com.apm.insight.runtime.p024a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.C1217a;
import com.apm.insight.entity.Header;
import com.apm.insight.p023l.C1285a;
import com.apm.insight.p023l.C1313s;

/* renamed from: com.apm.insight.runtime.a.a */
class C1342a extends C1346c {
    C1342a(Context context, C1343b bVar, C1348d dVar) {
        super(CrashType.ANR, context, bVar, dVar);
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
        a.mo12251a("process_name", (Object) C1285a.m1725c(this.f1394b));
        C1313s.m1884a(a, a2, this.f1393a);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo12448a() {
        return true;
    }
}
