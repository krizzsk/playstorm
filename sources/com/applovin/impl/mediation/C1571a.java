package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.mediation.p028a.C1575c;
import com.applovin.impl.sdk.C1788a;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.utils.C2032a;

/* renamed from: com.applovin.impl.mediation.a */
public class C1571a extends C2032a {

    /* renamed from: a */
    private final C1788a f2050a;

    /* renamed from: b */
    private final C2092v f2051b;

    /* renamed from: c */
    private C1572a f2052c;

    /* renamed from: d */
    private C1575c f2053d;

    /* renamed from: e */
    private int f2054e;

    /* renamed from: f */
    private boolean f2055f;

    /* renamed from: com.applovin.impl.mediation.a$a */
    public interface C1572a {
        /* renamed from: a */
        void mo13131a(C1575c cVar);
    }

    C1571a(C1959m mVar) {
        this.f2051b = mVar.mo14286A();
        this.f2050a = mVar.mo14333af();
    }

    /* renamed from: a */
    public void mo13129a() {
        if (C2092v.m5047a()) {
            this.f2051b.mo14789b("AdActivityObserver", "Cancelling...");
        }
        this.f2050a.mo13825b(this);
        this.f2052c = null;
        this.f2053d = null;
        this.f2054e = 0;
        this.f2055f = false;
    }

    /* renamed from: a */
    public void mo13130a(C1575c cVar, C1572a aVar) {
        if (C2092v.m5047a()) {
            C2092v vVar = this.f2051b;
            vVar.mo14789b("AdActivityObserver", "Starting for ad " + cVar.getAdUnitId() + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        mo13129a();
        this.f2052c = aVar;
        this.f2053d = cVar;
        this.f2050a.mo13823a(this);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (!this.f2055f) {
            this.f2055f = true;
        }
        this.f2054e++;
        if (C2092v.m5047a()) {
            this.f2051b.mo14789b("AdActivityObserver", "Created Activity: " + activity + ", counter is " + this.f2054e);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        if (this.f2055f) {
            this.f2054e--;
            if (C2092v.m5047a()) {
                this.f2051b.mo14789b("AdActivityObserver", "Destroyed Activity: " + activity + ", counter is " + this.f2054e);
            }
            if (this.f2054e <= 0) {
                if (C2092v.m5047a()) {
                    this.f2051b.mo14789b("AdActivityObserver", "Last ad Activity destroyed");
                }
                if (this.f2052c != null) {
                    if (C2092v.m5047a()) {
                        this.f2051b.mo14789b("AdActivityObserver", "Invoking callback...");
                    }
                    this.f2052c.mo13131a(this.f2053d);
                }
                mo13129a();
            }
        }
    }
}
