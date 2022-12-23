package com.applovin.impl.mediation;

import com.applovin.impl.mediation.p028a.C1575c;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.utils.C2036e;

/* renamed from: com.applovin.impl.mediation.c */
public class C1616c {

    /* renamed from: a */
    private final C1959m f2205a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2092v f2206b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1618a f2207c;

    /* renamed from: d */
    private C2036e f2208d;

    /* renamed from: com.applovin.impl.mediation.c$a */
    public interface C1618a {
        /* renamed from: c */
        void mo13311c(C1575c cVar);
    }

    C1616c(C1959m mVar, C1618a aVar) {
        this.f2205a = mVar;
        this.f2206b = mVar.mo14286A();
        this.f2207c = aVar;
    }

    /* renamed from: a */
    public void mo13350a() {
        if (C2092v.m5047a()) {
            this.f2206b.mo14789b("AdHiddenCallbackTimeoutManager", "Cancelling timeout");
        }
        C2036e eVar = this.f2208d;
        if (eVar != null) {
            eVar.mo14671a();
            this.f2208d = null;
        }
    }

    /* renamed from: a */
    public void mo13351a(final C1575c cVar, long j) {
        if (C2092v.m5047a()) {
            C2092v vVar = this.f2206b;
            vVar.mo14789b("AdHiddenCallbackTimeoutManager", "Scheduling in " + j + "ms...");
        }
        this.f2208d = C2036e.m4876a(j, this.f2205a, new Runnable() {
            public void run() {
                if (C2092v.m5047a()) {
                    C1616c.this.f2206b.mo14789b("AdHiddenCallbackTimeoutManager", "Timing out...");
                }
                C1616c.this.f2207c.mo13311c(cVar);
            }
        });
    }
}
