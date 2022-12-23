package com.ironsource.mediationsdk.p207a;

import com.ironsource.mediationsdk.p207a.C6544b;
import com.ironsource.mediationsdk.utils.C6782o;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* renamed from: com.ironsource.mediationsdk.a.h */
public final class C6557h extends C6544b {

    /* renamed from: w */
    private static C6557h f16964w;

    /* renamed from: x */
    private String f16965x = "";

    private C6557h() {
        this.f16927r = "outcome";
        this.f16926q = 3;
        this.f16928s = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
    }

    /* renamed from: d */
    public static synchronized C6557h m19950d() {
        C6557h hVar;
        synchronized (C6557h.class) {
            if (f16964w == null) {
                C6557h hVar2 = new C6557h();
                f16964w = hVar2;
                hVar2.mo36359a();
            }
            hVar = f16964w;
        }
        return hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo36369b() {
        this.f16929t.add(1000);
        this.f16929t.add(1001);
        this.f16929t.add(1002);
        this.f16929t.add(1003);
        this.f16929t.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_LOAD_FAILED));
        this.f16929t.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE));
        this.f16929t.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_READY_TRUE));
        this.f16929t.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_READY_FALSE));
        this.f16929t.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON));
        this.f16929t.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL));
        this.f16929t.add(Integer.valueOf(IronSourceConstants.RV_MEDIATION_LOAD_ERROR));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo36378c(C6552c cVar) {
        return cVar.mo36390a() == 305;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo36379d(int i) {
        return (i == 15 || (i >= 300 && i < 400)) ? this.f16965x : "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo36381d(C6552c cVar) {
        int a = cVar.mo36390a();
        return a == 14 || a == 514 || a == 305 || a == 1003 || a == 1005 || a == 1203 || a == 1010 || a == 1301 || a == 1302;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo36382e(C6552c cVar) {
        return C6782o.m20647a().mo36990b((m19893e(cVar.mo36390a()) == C6544b.C6550a.OFFERWALL.f16950f ? 1 : 0) ^ 1);
    }
}
