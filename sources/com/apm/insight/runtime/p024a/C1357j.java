package com.apm.insight.runtime.p024a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.C1217a;
import com.apm.insight.entity.Header;
import com.apm.insight.p023l.C1313s;

/* renamed from: com.apm.insight.runtime.a.j */
class C1357j extends C1346c {
    C1357j(Context context, C1343b bVar, C1348d dVar) {
        super(CrashType.JAVA, context, bVar, dVar);
    }

    /* renamed from: a */
    public C1217a mo12462a(int i, C1217a aVar) {
        C1217a a = super.mo12462a(i, aVar);
        if (i == 0) {
            a.mo12251a("app_count", (Object) 1);
            a.mo12251a("magic_tag", (Object) "ss_app_log");
            mo12472g(a);
            Header a2 = Header.m1383a(this.f1394b);
            a2.mo12238c();
            a.mo12244a(a2);
            C1313s.m1884a(a, a2, this.f1393a);
        } else if (i == 1) {
            Header i2 = a.mo12266i();
            i2.mo12239d();
            i2.mo12240e();
        } else if (i == 2) {
            Header.m1385a(a.mo12266i());
        } else if (i == 5) {
            Header.m1388b(a.mo12266i());
        }
        return a;
    }
}
