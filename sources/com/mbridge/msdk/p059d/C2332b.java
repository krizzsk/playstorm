package com.mbridge.msdk.p059d;

import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.p054c.C2278a;
import com.mbridge.msdk.p054c.C2283b;
import com.mbridge.msdk.p059d.C2328a;

/* renamed from: com.mbridge.msdk.d.b */
/* compiled from: TimerController */
public class C2332b {

    /* renamed from: com.mbridge.msdk.d.b$a */
    /* compiled from: TimerController */
    static class C2334a {

        /* renamed from: a */
        static C2332b f4853a = new C2332b();
    }

    private C2332b() {
    }

    public static C2332b getInstance() {
        return C2334a.f4853a;
    }

    public void start() {
        C2278a b = C2283b.m5275a().mo15563b(C2350a.m5601e().mo15793h());
        if (b == null) {
            b = C2283b.m5275a().mo15562b();
        }
        int e = b.mo15502e();
        if (e > 0) {
            C2328a.C2331a.f4852a.mo15710a((long) (e * 1000));
        }
    }

    public void addRewardList(String str, String str2) {
        C2328a.C2331a.f4852a.mo15711a(str, str2);
    }

    public void addInterstitialList(String str, String str2) {
        C2328a.C2331a.f4852a.mo15712b(str, str2);
    }
}
