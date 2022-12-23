package com.ironsource.mediationsdk.p207a;

import com.ironsource.mediationsdk.p207a.C6544b;
import com.ironsource.mediationsdk.utils.C6782o;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* renamed from: com.ironsource.mediationsdk.a.d */
public final class C6553d extends C6544b {

    /* renamed from: w */
    private static C6553d f16956w;

    /* renamed from: x */
    private String f16957x = "";

    private C6553d() {
        this.f16927r = "ironbeast";
        this.f16926q = 2;
        this.f16928s = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
    }

    /* renamed from: d */
    public static synchronized C6553d m19930d() {
        C6553d dVar;
        synchronized (C6553d.class) {
            if (f16956w == null) {
                C6553d dVar2 = new C6553d();
                f16956w = dVar2;
                dVar2.mo36359a();
            }
            dVar = f16956w;
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo36369b() {
        this.f16929t.add(2001);
        this.f16929t.add(2002);
        this.f16929t.add(2003);
        this.f16929t.add(2004);
        this.f16929t.add(Integer.valueOf(IronSourceConstants.IS_INSTANCE_LOAD_FAILED));
        this.f16929t.add(Integer.valueOf(IronSourceConstants.IS_INSTANCE_LOAD_NO_FILL));
        this.f16929t.add(Integer.valueOf(IronSourceConstants.IS_INSTANCE_READY_TRUE));
        this.f16929t.add(Integer.valueOf(IronSourceConstants.IS_INSTANCE_READY_FALSE));
        this.f16929t.add(3001);
        this.f16929t.add(Integer.valueOf(IronSourceConstants.BN_CALLBACK_LOAD_ERROR));
        this.f16929t.add(Integer.valueOf(IronSourceConstants.BN_RELOAD));
        this.f16929t.add(Integer.valueOf(IronSourceConstants.BN_RELOAD_FAILED));
        this.f16929t.add(Integer.valueOf(IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS));
        this.f16929t.add(3002);
        this.f16929t.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_RELOAD));
        this.f16929t.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_LOAD_SUCCESS));
        this.f16929t.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_LOAD_ERROR));
        this.f16929t.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS));
        this.f16929t.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_RELOAD_ERROR));
        this.f16929t.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS));
        this.f16929t.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS));
        this.f16929t.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_SHOW));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo36378c(C6552c cVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo36379d(int i) {
        return this.f16957x;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo36381d(C6552c cVar) {
        int a = cVar.mo36390a();
        return a == 2204 || a == 2004 || a == 2005 || a == 2301 || a == 2300 || a == 3009;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo36382e(C6552c cVar) {
        return C6782o.m20647a().mo36990b(m19893e(cVar.mo36390a()) == C6544b.C6550a.BANNER.f16950f ? 3 : 2);
    }
}
